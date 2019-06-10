package Logica;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Componente {
	//atributos
	protected int id;
	protected int decision;
	public int getDecision() {
		return decision;
	}
	public void setDecision(int decision) {
		this.decision = decision;
	}
	protected String Ubicacion;
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
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
	public abstract String getTipo();
	public abstract double getPuntaje();
	public abstract ArrayList<String> getOpciones();
}
