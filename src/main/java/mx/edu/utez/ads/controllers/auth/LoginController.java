package mx.edu.utez.ads.controllers.auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import mx.edu.utez.ads.utils.WindowUtils;

public class LoginController {
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private Button OnLoginButtonClicked;
    @FXML
    private Hyperlink OnRegisterButton;
    @FXML
    private void initialize() {}
    @FXML
    public void OnLoginButtonClicked(ActionEvent event){
        if (email.getText().isEmpty() || password.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("Credenciales incorrectas");
            alert.setContentText("Por favor ingrese un Email o Password");
        }else{
            if(email.getText().equals("admin") && password.getText().equals("Pixel&logic5*")){
                try{
                    WindowUtils.switchWindow(OnLoginButtonClicked, "/mx/edu/utez/ads/user/MenuPrincipal.fxml", "Menu Principal");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    @FXML
    public void OnRegisterButton(ActionEvent event){
         WindowUtils.switchWindow(OnRegisterButton, "/mx/edu/utez/ads/auth/registration.fxml", "Ventana de registro");
     }

}
