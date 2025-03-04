package src.com.restaurante.vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import src.com.restaurante.modelos.ClientesDAO;

public class Cliente extends Stage
{
    private Button btnGuardar;
    private TextField txtNomCte, txtDireccion, txtTelCte, txtEmail;
    private VBox vbox;
    private Scene escena;
    private ClientesDAO clientesDAO;
    private TableView <ClientesDAO> tbvClientes;
    public void crearUI()
    {
        txtNomCte = new TextField();
        txtDireccion = new TextField();
        txtTelCte = new TextField();
        txtEmail = new TextField();
        btnGuardar = new Button("Guardar");
        btnGuardar.setOnAction(e -> {
            clientesDAO.setNomCte(txtNomCte.getText());
            clientesDAO.setDireccion(txtDireccion.getText());
            clientesDAO.setTelCte(txtTelCte.getText());
            clientesDAO.setEmailCte(txtEmail.getText());
            clientesDAO.INSERT();
            tbvClientes.setItems(clientesDAO.SELECT());
            tbvClientes.refresh();
            this.close();
        });
        vbox = new VBox(txtNomCte, txtDireccion, txtTelCte, txtEmail, btnGuardar);
        escena = new Scene(vbox, 120, 150);
    }

    public Cliente(TableView <ClientesDAO> tbvClientes)
    {
        this.tbvClientes = tbvClientes;
        clientesDAO = new ClientesDAO();
        crearUI();
        this.setTitle("Cliente");
        this.setScene(escena);
        this.show();
    }
}
