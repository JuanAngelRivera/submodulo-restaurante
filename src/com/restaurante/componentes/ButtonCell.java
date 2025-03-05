package src.com.restaurante.componentes;

import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import src.com.restaurante.modelos.ClientesDAO;

public class ButtonCell extends TableCell < ClientesDAO, String >
{
    Button btnCelda;

    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);
        if
    }

    public ButtonCell()
    {
        btnCelda = new Button("Editar");
    }
}
