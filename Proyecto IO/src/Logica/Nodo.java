package Logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Nodo extends Componente{
	private double puntaje;
	private String opcion;
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
            cad += component.getId() + ",";            
        }
        cad = cad.substring(0, cad.length()-1) + "]";       
        return cad;
	}
		
	public ArrayList<Componente> getPartes(){
		return this.partes;
	}
			
	public String getOpcion() {
		return this.opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	
	public double getProbabilidad() {
		return this.probabilidad;
	}
	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}
}
