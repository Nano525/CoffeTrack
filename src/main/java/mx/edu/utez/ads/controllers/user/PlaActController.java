package mx.edu.utez.ads.controllers.user;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PlaActController {

    @FXML private TableView<Pedido> tblPedidos;
    @FXML private TableColumn<Pedido, String> colId;
    @FXML private TableColumn<Pedido, String> colCliente;
    @FXML private TableColumn<Pedido, String> colProductos;
    @FXML private TableColumn<Pedido, String> colEstado;
    @FXML private TableColumn<Pedido, String> colTotal;

    @FXML private Label lblPedido;
    @FXML private Label lblCliente;
    @FXML private Label lblEstado;

    @FXML private Button btnListo;
    @FXML private Button btnCancelar;

    private ObservableList<Pedido> listaPedidos;

    @FXML
    public void initialize() {
        // Configurar columnas
        colId.setCellValueFactory(data -> data.getValue().idProperty());
        colCliente.setCellValueFactory(data -> data.getValue().clienteProperty());
        colProductos.setCellValueFactory(data -> data.getValue().productosProperty());
        colEstado.setCellValueFactory(data -> data.getValue().estadoProperty());
        colTotal.setCellValueFactory(data -> data.getValue().totalProperty());

        // Datos de ejemplo
        listaPedidos = FXCollections.observableArrayList(
                new Pedido("0012", "Anna Lopez", "Latte", "Listo", "$40.00"),
                new Pedido("0013", "Jorge Ruiz", "Capuchino", "En preparación", "$39.90"),
                new Pedido("0014", "Mateo Perz", "Té", "Cancelado", "$30.00"),
                new Pedido("0015", "Laura Martínez", "Americano", "En preparación", "$35.99"),
                new Pedido("0016", "Jose Morales", "Expresso, Concha", "En preparación", "$65.00")
        );

        tblPedidos.setItems(listaPedidos);

        // Al seleccionar un pedido en la tabla, mostrar detalles
        tblPedidos.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) mostrarDetallePedido(newSel);
        });
    }

    private void mostrarDetallePedido(Pedido pedido) {
        lblPedido.setText("Pedido " + pedido.getId());
        lblCliente.setText(pedido.getCliente());
        lblEstado.setText(pedido.getEstado());
    }

    @FXML
    private void onListo() {
        Pedido seleccionado = tblPedidos.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setEstado("Listo");
            tblPedidos.refresh();
            lblEstado.setText("Listo");
        }
    }

    @FXML
    private void onCancelar() {
        Pedido seleccionado = tblPedidos.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            seleccionado.setEstado("Cancelado");
            tblPedidos.refresh();
            lblEstado.setText("Cancelado");
        }
    }

    // Clase interna modelo Pedido
    public static class Pedido {
        private final javafx.beans.property.SimpleStringProperty id;
        private final javafx.beans.property.SimpleStringProperty cliente;
        private final javafx.beans.property.SimpleStringProperty productos;
        private final javafx.beans.property.SimpleStringProperty estado;
        private final javafx.beans.property.SimpleStringProperty total;

        public Pedido(String id, String cliente, String productos, String estado, String total) {
            this.id = new javafx.beans.property.SimpleStringProperty(id);
            this.cliente = new javafx.beans.property.SimpleStringProperty(cliente);
            this.productos = new javafx.beans.property.SimpleStringProperty(productos);
            this.estado = new javafx.beans.property.SimpleStringProperty(estado);
            this.total = new javafx.beans.property.SimpleStringProperty(total);
        }

        public String getId() {
            return id.get();
        }
        public String getCliente() {
            return cliente.get();
        }
        public String getProductos() {

            return productos.get();
        }
        public String getEstado() {

            return estado.get();
        }
        public String getTotal() {
            return total.get();
        }

        public void setEstado(String estado) {
            this.estado.set(estado);
        }

        public javafx.beans.property.StringProperty idProperty() {

            return id;
        }
        public javafx.beans.property.StringProperty clienteProperty() {

            return cliente;
        }
        public javafx.beans.property.StringProperty productosProperty() {

            return productos;
        }
        public javafx.beans.property.StringProperty estadoProperty() {

            return estado;
        }
        public javafx.beans.property.StringProperty totalProperty() {

            return total;
        }
    }
}
