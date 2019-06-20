package Logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Nodo extends Componente{
	public static String PROBABILIDAD = "probabilidad";
	public static String DECISION = "decision";
	public static String GASTO = "gasto";
	public static String TERMINAL = "terminal";
	
	private double puntaje;
	private String tipo;
	private ArrayList<String> opciones = new ArrayList<String>();
	private double probabilidad;
	protected ArrayList<Componente> partes = new ArrayList<Componente>();
	
	
	
	public Nodo(int id, String enunciado) {
		this.id = id;
		this.enunciado = enunciado;
	}
	
	public  void addpart(Componente c) {
		partes.add(c);
	}
	public String operation() {
		String cad = this.id + "[";
        for (Iterator<Componente> it = partes.iterator(); it.hasNext();) {
            Componente component = it.next();
            cad += component.operation();            
        }
        cad = cad.substring(0, cad.length()-1) + "]";       
        return cad;
	}
		
	public ArrayList<Componente> getPartes(){
		return this.partes;
	}
			
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getProbabilidad() {
		return this.probabilidad;
	}
	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}

	@Override
	public Componente getSiguiente() {
		Componente c = null;
		if(partes.size()!=0) {
			c = partes.get(this.decision);
		}
		return c;
	}
	
	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		
		
		this.puntaje = puntaje;
	}

	public void agregarOpcion(String opcion) {
		opciones.add(opcion);
	}
	
	public ArrayList<String> getOpciones(){
		return opciones;
	}

	public void setOpciones(ArrayList<String> opciones) {
		this.opciones = opciones;
	}
	
}
