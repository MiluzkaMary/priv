package co.uniquindio.centroimpresion.model;

public enum Estado {
	
    ACTIVO(0), INACTIVO(1);

	
	/**
	 * Este atributo representa la opcion del switch
	 */
	private int estadoImpresora;
	
	/**
	 * Metodo constructor de la clase Estado
	 * @param estadoImpresora
	 */
	private Estado (int estadoImpresora) {
		this.estadoImpresora = estadoImpresora;
	}

	public int getEstado() {
		return estadoImpresora;
	}

	public void setEstado(int estadoImpresora) {
		this.estadoImpresora = estadoImpresora;
	}
	


}
