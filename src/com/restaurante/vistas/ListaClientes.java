package src.com.restaurante.vistas;

import javafx.scene.control.*;
import javafx.util.Callback;
import src.com.restaurante.componentes.ButtonCell;
import src.com.restaurante.modelos.ClientesDAO;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListaClientes extends Stage
{
    private ToolBar tlbMenu;
    private TableView <ClientesDAO> tbvClientes;
    private VBox vbox;
    private Scene escena;
    private Button btnAgregar;

    public void crearTabla()
    {
        ClientesDAO clientesDAO = new ClientesDAO();
        TableColumn <ClientesDAO, String> colNomCte = new TableColumn<>("Cliente");
        colNomCte.setCellValueFactory(new PropertyValueFactory<> ("nomCte"));
        TableColumn <ClientesDAO, String> colDireccion = new TableColumn<>("Direccion");
        colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        TableColumn <ClientesDAO, String> colTel = new TableColumn<>("Telefono");
        colTel.setCellValueFactory(new PropertyValueFactory<>("telCte"));
        TableColumn <ClientesDAO, String> colEmail = new TableColumn<>("Email");
        colEmail.setCellValueFactory(new PropertyValueFactory<>("emailCte"));

        TableColumn <ClientesDAO, String> tbcEditar = new TableColumn<>("Editar");
        tbcEditar.setCellValueFactory(new Callback <TableColumn<ClientesDAO, String>, TableCell<ClientesDAO, String>>() {
            @Override
            public TableCell <ClientesDAO, String> call(TableColumn <ClientesDAO, String> param) {
                return new ButtonCell("Editar");
            }
        });

        TableColumn <ClientesDAO, String> tbcEliminar = new TableColumn<>("Eliminar");
        tbcEliminar.setCellValueFactory(new Callback<TableColumn<ClientesDAO, String>, TableCell<ClientesDAO, String>>() {
            @Override
<<<<<<< HEAD
            public TableCell<ClientesDAO, String> call(TableColumn.CellDataFeatures<ClientesDAO, String> clientesDAOStringCellDataFeatures) {
=======
            public TableCell<ClientesDAO, String> call(TableColumn<ClientesDAO, String> param) {
>>>>>>> 202fa304e9fc1ed44fbd966088276948e7798a9e
                return new ButtonCell("Eliminar");
            }
        });

        tbvClientes.getColumns().addAll(colNomCte, colDireccion, colTel, colEmail, tbcEditar, tbcEliminar);
        tbvClientes.setItems(clientesDAO.SELECT());
    }

    private void crearUI()
    {
        tbvClientes = new TableView<>();

        btnAgregar = new Button("HOLA");
        //btnAgregar.setGraphic(new ImageView(getClass().getResource("/src/com/restaurante/imagenes/add_icon.png").toExternalForm()));
        btnAgregar.setOnAction(event  -> new Cliente(tbvClientes));
        tlbMenu = new ToolBar(btnAgregar);
        crearTabla();
        vbox = new VBox(tlbMenu, tbvClientes);
        escena = new Scene(vbox, 800, 600);
    }

    public ListaClientes()
    {
        crearUI();
        setTitle("Lista de Clientes");
        setScene(escena);
        show();
    }
}
