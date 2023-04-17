package co.uniquindio.centroimpresion.model;

public class Impresora {
	
	private String nombre;
	private Estado estado;
	private String marca;
	private TipoImpresora tipo;
	private int prioridad;
	
    public Impresora() {
		
	}
	
	/**
	 * Constructor
	 * @param nombre
	 * @param estado
	 * @param marca
	 * @param tipo
	 * @param prioridad
	 */
	public Impresora(String nombre, Estado estado, String marca, TipoImpresora tipo, int prioridad) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.marca = marca;
		this.tipo = tipo;
		this.prioridad= prioridad;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoImpresora getTipo() {
		return tipo;
	}

	public void setTipo(TipoImpresora tipo) {
		this.tipo = tipo;
	}
	
	public int getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Impresora [nombre=" + nombre + ", estado=" + estado + ", marca=" + marca + ", tipo=" + tipo + ", prioridad=" + prioridad
				+ "]";
	}
	
	
	
	
	
	

}
