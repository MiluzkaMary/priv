package co.uniquindio.centroimpresion.model;

public enum TipoImpresora {
	
    TINTA(0), CARTUCHO(1), IMP_3D(2), LASER(3), TERMICA (4); 

	
	/**
	 * Este atributo representa la opcion del switch
	 */
	private int tipoImpresora;
	
	/**
	 * Metodo constructor de la clase TipoImpresora
	 * @param estadoImpresora
	 */
	private TipoImpresora (int tipoImpresora) {
		this.tipoImpresora = tipoImpresora;
	}

	public int getTipo() {
		return tipoImpresora;
	}

	public void getTipo(int tipoImpresora) {
		this.tipoImpresora = tipoImpresora;
	}

}
