package co.uniquindio.centroimpresion.controllers;

import co.uniquindio.centroimpresion.application.CentroImpresionApplication;
import co.uniquindio.centroimpresion.model.Impresora;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class ImpresorasVentanaController {
	@FXML
	CentroImpresionApplication centroImpresionAplicacion;
	
	@FXML
    private Button btnDetalles;

    @FXML
    private TextField txtNumCopias;

    @FXML
    private RadioButton rb_v;

    @FXML
    private Button btnArchivo;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ComboBox<?> cb_impresora;

    @FXML
    private Label lbl_Orientacion;

    @FXML
    private Label label_1;

    @FXML
    private AnchorPane anchorRight;

    @FXML
    private Button btnImprimir;

    @FXML
    private TableView<Impresora> tableViewImpresoras;

    @FXML
    private ComboBox<String> cb_tamaño;

    @FXML
    private Label lblTamañoPapel;

    @FXML
    private Button btnAgregar;

    @FXML
    private Label lblOpcionesColor;

    @FXML
    private RadioButton rb_h;

    @FXML
    private Button btnEditar;

    @FXML
    private AnchorPane anchorLeft;

    @FXML
    private Label label_impresora;

    @FXML
    private SplitPane splitPane;

    @FXML
    private Label lblCopias;

    @FXML
    private Button btnEliminar;

    @FXML
    private RadioButton rb_color;

    @FXML
    private ScrollPane scrollTable;

    @FXML
    private RadioButton rb_blanconegro;

    @FXML
    private TableColumn<Impresora, String> columnaNombre;

    @FXML
    private Label label_preferencias;
    
    public ImpresorasVentanaController() {
    }
    @FXML
    private void initialize() {
    	// Crear una columna para el nombre
    	columnaNombre = new TableColumn<>("Nombre");
    	columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    	

    	
	}
    
    public void setAplicacion(CentroImpresionApplication centroImpresionAplicacion) {
		this.centroImpresionAplicacion = centroImpresionAplicacion;
		tableViewImpresoras.setItems(centroImpresionAplicacion.getlistaImpresoras());
	}

}


