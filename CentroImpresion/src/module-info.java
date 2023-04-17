module CentroImpresion {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	opens co.uniquindio.centroimpresion.controllers to javafx.fxml;
	opens co.uniquindio.centroimpresion.application to javafx.graphics, javafx.fxml;
}
