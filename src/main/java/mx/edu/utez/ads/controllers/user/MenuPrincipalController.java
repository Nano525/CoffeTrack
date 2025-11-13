package mx.edu.utez.ads.controllers.user;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import mx.edu.utez.ads.utils.WindowUtils;

public class MenuPrincipalController {

    @FXML private Button btnPedidosActuales;
    @FXML private Button btnPedidosListos;
    @FXML private Button btnPedidosCancelados;
    @FXML private Button onSalir;

    @FXML
    private void initialize() {
        // Inicialización del controlador
    }

    @FXML
    private void onPedidosActuales() {
        System.out.println("Mostrando pedidos actuales...");
        // TODO: Cambiar a la vista de pedidos actuales cuando se cree
        // WindowUtils.switchWindow(btnPedidosActuales, "/mx/edu/utez/ads/user/PedidosActuales.fxml", "Pedidos Actuales");
    }

    @FXML
    private void onPedidosListos() {
        System.out.println("Mostrando pedidos listos...");
        // TODO: Cambiar a la vista de pedidos listos cuando se cree
        // WindowUtils.switchWindow(btnPedidosListos, "/mx/edu/utez/ads/user/PedidosListos.fxml", "Pedidos Listos");
    }

    @FXML
    private void onPedidosCancelados() {
        System.out.println("Mostrando pedidos cancelados...");
        // TODO: Cambiar a la vista de pedidos cancelados cuando se cree
        // WindowUtils.switchWindow(btnPedidosCancelados, "/mx/edu/utez/ads/user/PedidosCancelados.fxml", "Pedidos Cancelados");
    }

    @FXML
    private void onSalir() {
        WindowUtils.switchWindow(onSalir, "/mx/edu/utez/ads/auth/Login.fxml", "Inicio de sesion");
    }
}
