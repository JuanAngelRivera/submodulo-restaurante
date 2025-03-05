package src.com.restaurante.componentes;

import src.com.restaurante.modelos.ClientesDAO;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;

import java.util.Optional;

public class ButtonCell extends TableCell<ClientesDAO, String> {
    Button btnCelda;
    private String strLabelBtn;
    public ButtonCell(String label){


        strLabelBtn= label;
        btnCelda=new Button(strLabelBtn);
        btnCelda.setOnAction(actionEvent -> {
            ClientesDAO objC= this.getTableView().getItems().get(this.getIndex());
            if (strLabelBtn.equals(("editar"))) {

            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Mensaje del sistema");
                alert.setContentText("Deseas eliminar el registro seleccionado?");
                Optional<ButtonType> opcion =alert.showAndWait();
                if(opcion.get() == ButtonType.OK) {
                    objC.DELETE();
                }
            }
            this.getTableView().setItems(objC.SELECT());
            this.getTableView().refresh();
        });

    }

    @Override
    protected void updateItem(String s, boolean b) {
        super.updateItem(s, b);
        if( !isEmpty())
            this.setGraphic(btnCelda);
    }
}
