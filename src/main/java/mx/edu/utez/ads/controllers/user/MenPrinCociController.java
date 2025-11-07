package mx.edu.utez.ads.controllers.user;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenPrinCociController {

    @FXML private Button btnPedidosActuales;
    @FXML private Button btnPedidosListos;
    @FXML private Button btnPedidosCancelados;
    @FXML private Button btnSalir;

    @FXML
    private void initialize() {
        // Aquí puedes agregar inicializaciones si es necesario
    }

    @FXML
    private void onPedidosActuales() {
        System.out.println("Mostrando pedidos actuales...");
        // Cambiar a la vista de pedidos actuales
    }

    @FXML
    private void onPedidosListos() {
        System.out.println("Mostrando pedidos listos...");
    }

    @FXML
    private void onPedidosCancelados() {
        System.out.println("Mostrando pedidos cancelados...");
    }

    @FXML
    private void onSalir() {
        System.out.println("Saliendo de la aplicación...");
        System.exit(0);
    }
}
