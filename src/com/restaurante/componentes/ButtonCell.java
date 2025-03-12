package src.com.restaurante.componentes;

import javafx.scene.control.*;
import src.com.restaurante.modelos.ClientesDAO;
import src.com.restaurante.modelos.DAO;
import src.com.restaurante.vistas.Cliente;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ButtonCell<T> extends TableCell<T, String>
{
    Button btnCelda;
    private String strLabelBtn;

    public ButtonCell(String label, BiConsumer<TableView<T>, T> action)
    {
        strLabelBtn = label;
        btnCelda = new Button(strLabelBtn);
        btnCelda.setOnAction(actionEvent ->
        {
            T obj = getTableView().getItems().get(getIndex());
            action.accept(getTableView(), obj);
        });
    }

    @Override
    protected void updateItem(String s, boolean b)
    {
        super.updateItem(s, b);
        if( !isEmpty())
            this.setGraphic(btnCelda);
    }
}
