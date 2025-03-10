package src.com.restaurante.vistas;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import src.com.restaurante.modelos.CategoriasDAO;
import src.com.restaurante.componentes.ButtonCell;

public class ListaCategorias extends Stage
{

    private ToolBar tlbMenu;
    private TableView<CategoriasDAO> tbvCategorias;
    private VBox vBox;
    private Scene escena;
    private Button btnAgregar;

    public ListaCategorias()
    {
        CrearUI();
        this.setTitle("Listado de Categorias");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI()
    {
        tbvCategorias = new TableView<>();
        btnAgregar = new Button("Agregar");
        btnAgregar.setOnAction(event -> new Categoria(tbvCategorias, null));
//        ImageView imv = new ImageView(getClass().getResource("/imagenes/add_icon.png").toString());
//        imv.setFitWidth(20);
//        imv.setFitHeight(20);
//        btnAgregar.setGraphic(imv);
        tlbMenu = new ToolBar(btnAgregar);
        CreateTable();
        vBox = new VBox(tlbMenu, tbvCategorias);
        escena = new Scene(vBox, 800, 600);
    }

    private void CreateTable()
    {
        CategoriasDAO objC = new CategoriasDAO();

        TableColumn<CategoriasDAO,String> tbcNomCat = new TableColumn<>("Nombre");
        tbcNomCat.setCellValueFactory(new PropertyValueFactory<>("nomCat"));

        TableColumn<CategoriasDAO,String> tbcDesc = new TableColumn<>("Descripción");
        tbcDesc.setCellValueFactory(new PropertyValueFactory<>("descCat"));

//        TableColumn<CategoriasDAO,String> tbcEditar = new TableColumn<>("Editar");
//        tbcEditar.setCellFactory(new Callback<TableColumn<CategoriasDAO, String>, TableCell<CategoriasDAO, String>>() {
//            @Override
//            public TableCell<CategoriasDAO, String> call(TableColumn<CategoriasDAO, String> param) {
//                return new ButtonCell("Editar");
//            }
//        });
//        TableColumn<CategoriasDAO,String> tbcEliminar = new TableColumn<>("Eliminar");
//        tbcEliminar.setCellFactory(new Callback<TableColumn<CategoriasDAO, String>, TableCell<CategoriasDAO, String>>() {
//            @Override
//            public TableCell<CategoriasDAO, String> call(TableColumn<CategoriasDAO, String> param) {
//                return new ButtonCell("Eliminar");
//            }
//        });

        tbvCategorias.getColumns().addAll(tbcNomCat,tbcDesc);//,tbcEditar,tbcEliminar);
        tbvCategorias.setItems(objC.SELECT());
    }
}