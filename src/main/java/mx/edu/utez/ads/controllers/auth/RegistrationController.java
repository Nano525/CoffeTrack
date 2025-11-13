package mx.edu.utez.ads.controllers.auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import mx.edu.utez.ads.utils.WindowUtils;
import java.util.regex.Pattern;

public class RegistrationController {
    @FXML
    private Button OnRegistro;
    @FXML
    private Button OnRegresar;
    @FXML
    private TextField fullName;
    @FXML
    private TextField email;
    @FXML
    private TextField userName;
    @FXML
    private PasswordField password;
    @FXML
    private SplitMenuButton rolMenuButton;
    @FXML
    private TextField userRol;

    @FXML
    private void initialize() {
        // Configurar el menú de roles para actualizar el campo oculto
        rolMenuButton.getItems().forEach(item -> {
            item.setOnAction(e -> {
                userRol.setText(item.getText());
                rolMenuButton.setText(item.getText());
            });
        });
    }

    @FXML
    public void OnRegistro(ActionEvent event){
        // Validar campos vacíos
        if (fullName.getText().trim().isEmpty()) {
            mostrarError("Campo requerido", "Por favor ingrese su nombre completo");
            fullName.requestFocus();
            return;
        }

        if (email.getText().trim().isEmpty()) {
            mostrarError("Campo requerido", "Por favor ingrese su correo electrónico");
            email.requestFocus();
            return;
        }

        if (userName.getText().trim().isEmpty()) {
            mostrarError("Campo requerido", "Por favor ingrese un nombre de usuario");
            userName.requestFocus();
            return;
        }

        if (password.getText().isEmpty()) {
            mostrarError("Campo requerido", "Por favor ingrese una contraseña");
            password.requestFocus();
            return;
        }

        if (userRol.getText().trim().isEmpty()) {
            mostrarError("Campo requerido", "Por favor seleccione un rol");
            return;
        }

        // Validar formato de email
        if (!validarEmail(email.getText().trim())) {
            mostrarError("Email inválido", "Por favor ingrese un correo electrónico válido");
            email.requestFocus();
            return;
        }

        // Validar contraseña (debe tener mayúsculas y caracteres especiales)
        String passwordText = password.getText();
        if (!validarContrasena(passwordText)) {
            mostrarError("Contraseña inválida", 
                "La contraseña debe contener:\n" +
                "- Al menos una letra mayúscula\n" +
                "- Al menos un carácter especial (!@#$%^&*()_+-=[]{}|;:,.<>?)");
            password.requestFocus();
            return;
        }

        // Si todas las validaciones pasan, mostrar éxito
        mostrarExito("Registro exitoso", 
            "Usuario registrado correctamente:\n" +
            "Nombre: " + fullName.getText() + "\n" +
            "Email: " + email.getText() + "\n" +
            "Usuario: " + userName.getText() + "\n" +
            "Rol: " + userRol.getText());
        
        // Limpiar campos después del registro exitoso
        limpiarCampos();
    }

    private boolean validarEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private boolean validarContrasena(String password) {
        // Debe tener al menos una mayúscula
        boolean tieneMayuscula = password.chars().anyMatch(Character::isUpperCase);
        
        // Debe tener al menos un carácter especial
        String caracteresEspeciales = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        boolean tieneEspecial = password.chars()
            .anyMatch(c -> caracteresEspeciales.indexOf(c) >= 0);
        
        return tieneMayuscula && tieneEspecial;
    }

    private void mostrarError(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error de validación");
        alert.setHeaderText(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarExito(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro exitoso");
        alert.setHeaderText(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void limpiarCampos() {
        fullName.clear();
        email.clear();
        userName.clear();
        password.clear();
        userRol.clear();
        rolMenuButton.setText("Rol");
    }

    @FXML
    public void OnRegresar(ActionEvent event){
        WindowUtils.switchWindow(OnRegresar, "/mx/edu/utez/ads/auth/Login.fxml", "Inicio de sesion");
    }

}
