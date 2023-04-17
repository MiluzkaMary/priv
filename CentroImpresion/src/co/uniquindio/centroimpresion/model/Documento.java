package co.uniquindio.centroimpresion.model;

public class Documento {
	
	private String titulo;
	private boolean valido;
	private double valor;
	private int prioridad;
	
	public Documento () {
		
	}
	
	public Documento(String titulo, boolean valido, double valor) {
		super();
		this.titulo = titulo;
		this.valido = valido;
		this.valor = valor;
		
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isValido() {
		return valido;
	}


	public void setValido(boolean valido) {
		this.valido = valido;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", valido=" + valido + ", valor=" + valor + "]";
	}
	
	
	

}
