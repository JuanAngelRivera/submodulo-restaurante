package src.com.restaurante.componentes;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import src.com.restaurante.modelos.ClientesDAO;

import java.util.Optional;

public class ButtonCell extends TableCell < ClientesDAO, String >
{
    Button btnCelda;
    private String strLabelBtn;

    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);
        if (!empty)
            this.setGraphic(btnCelda);
        else
        {

        }
    }

    public ButtonCell(String label)
    {
        ClientesDAO clientesDAO = this.getTableView().getItems().get(this.getIndex());
        strLabelBtn = label;
        btnCelda = new Button(strLabelBtn);

        if (strLabelBtn.equals("Editar"))
        {

        }
        else
        {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Mensaje del sistema");
            alerta.setContentText("¿Quieres eliminar el registro seleccionado?");
            Optional<ButtonType> opcion = alerta.showAndWait();
            if (opcion.get() == ButtonType.OK)
                clientesDAO.DELETE();
        }
        this.getTableView().setItems(clientesDAO.SELECT());
        this.getTableView().refresh();
    }
}
