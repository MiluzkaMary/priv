package co.uniquindio.centroimpresion.controllers;

import co.uniquindio.centroimpresion.application.CentroImpresionApplication;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

public class VentanaPrincipalController {
	@FXML
	private TextField txtContrasenia;
	@FXML
	private Label labelTitulo;
	@FXML
	private Button btnIngresar;
    CentroImpresionApplication centroImpresionApplication;
    
    public VentanaPrincipalController() {
    	
    }
	
	public void setAplicacion(CentroImpresionApplication centroImpresionApplication) {
        this.centroImpresionApplication = centroImpresionApplication;
    }

}
