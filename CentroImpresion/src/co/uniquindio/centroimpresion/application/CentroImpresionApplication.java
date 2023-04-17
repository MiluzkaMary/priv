package co.uniquindio.centroimpresion.application;

import java.io.IOException;
import java.util.List;

import co.uniquindio.centroimpresion.controllers.ImpresorasVentanaController;
import co.uniquindio.centroimpresion.controllers.VentanaPrincipalController;
import co.uniquindio.centroimpresion.model.Estado;
import co.uniquindio.centroimpresion.model.Impresora;
import co.uniquindio.centroimpresion.model.TipoImpresora;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

public class CentroImpresionApplication extends Application {
	
	/*
	 * Autor: Miluzka Mary Saire
	 * Codigo: 476299
	 */
	
	private ObservableList<Impresora> listaImpresoras = FXCollections.observableArrayList();
	private Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		configurarVentana();
		mostrarVentanaPrincipal();
		
		
	}
	
	public void TestImpresoras() {
		listaImpresoras.add(new Impresora("Brother MFC-L2750DW", Estado.ACTIVO, "Brother", TipoImpresora.LASER, 5));
		listaImpresoras.add(new Impresora("Samsung ML-5010ND", Estado.ACTIVO, "Samsung", TipoImpresora.IMP_3D, 3));
		listaImpresoras.add(new Impresora("Canon Pixma Pro-100",Estado.INACTIVO, "Canon", TipoImpresora.TINTA, 0));
	}
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
	
	public ObservableList<Impresora> getlistaImpresoras() {
		return listaImpresoras;
	}
	
	public void configurarVentana() {
        primaryStage.setTitle("Centro de Impresión");
		
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
		@Override
		public void handle(WindowEvent e) {
			Platform.exit();
			System.exit(0);
			}
		});
	}
	
	
	
	public void mostrarVentanaPrincipal() {
		try {
		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/uniquindio/centroimpresion/view/ImpresorasVentana.fxml"));
			ImpresorasVentanaController controlador = new ImpresorasVentanaController();
	        loader.setController(controlador);
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
			
			
			
		} catch (IOException e) {
			e.printStackTrace();		}
	}

}
