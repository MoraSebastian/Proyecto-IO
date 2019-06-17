package Logica;

import java.util.ArrayList;

public class NodoTerminal extends Componente{
	public NodoTerminal(int id, String enunciado) {
		this.id = id;
		this.enunciado = enunciado;
	}
	public double DeterminarPuntaje() {
		//toca implementarlo
		return 0;
	}
	@Override
	public Componente getSiguiente() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public double getPuntaje() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

}
