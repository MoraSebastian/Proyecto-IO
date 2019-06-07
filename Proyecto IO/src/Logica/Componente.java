package Logica;

public abstract class Componente {
	//atributos
	protected int id;
	protected String enunciado;
	
	//métodos
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnunciado() {
		return this.enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String operation() {
		return getEnunciado();
	}
	
	public abstract Componente getSiguiente();
}
