package src.com.restaurante.vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cliente extends Stage
{
    private Button btnGuardar;
    private TextField txtNomCte, txtDireccion, txtTelCte, txtEmail;
    private VBox vbox;
    private Scene escena;

    public void crearUI()
    {
        txtNomCte = new TextField();
        txtDireccion = new TextField();
        txtTelCte = new TextField();
        txtEmail = new TextField();
        btnGuardar = new Button("Guardar");
        vbox = new VBox(txtNomCte, txtDireccion, txtTelCte, txtEmail, btnGuardar);
    }

    public Cliente()
    {
        this.setTitle("Cliente");
        this.setScene(escena);
        this.show();
    }
}
