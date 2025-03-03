package src.com.restaurante.vistas;

import src.com.restaurante.modelos.ClientesDAO;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;

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
        tbvClientes.getColumns().addAll(colNomCte, colDireccion, colTel, colEmail);
        tbvClientes.setItems(clientesDAO.SELECT());
    }

    private void crearUI()
    {
        tbvClientes = new TableView<>();

        btnAgregar = new Button();
        btnAgregar.setGraphic(new ImageView(getClass().getResource("/src/com/restaurante/imagenes/add_icon.png").toExternalForm()));
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
