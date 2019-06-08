package Logica;

import java.awt.EventQueue;

import Interfaz.FrameArbol;

public class Arbol {
	private Nodo nodo;
	public void construirArbol() {
		String o1, o2, o3;
		o1 = "decision";
		o2 = "probabilidad";
		o3 = "gasto";
		nodo = new Nodo(0, "");
		
		Nodo n1 = new Nodo(1, "");
		Nodo n2 = new Nodo(2, "");
		
		
		Nodo n3 = new Nodo(3, "");
		
		
		Nodo n4 = new Nodo(4, "");
		
		
		nodo.setOpcion(o2);
		n4.setOpcion(o1);
		n3.setOpcion(o2);
		n2.setOpcion(o1);
		n1.setOpcion(o3);
		
		nodo.setPuntaje(200);
		n1.setPuntaje(-100);
		n2.setPuntaje(150);
		n3.setPuntaje(-100);
		n4.setPuntaje(150);
		
		n2.addpart(n1);
		n3.addpart(n2);
		n4.addpart(n3);
		nodo.addpart(n4);
	}
	
	public  void mostrarHijos () {				
		System.out.println(nodo.operation());
	}

	public Nodo getInicio() {
		return nodo;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}

	public static void main(String args[]) {				
		Arbol arbol = new Arbol();	
		arbol.construirArbol();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameArbol frame = new FrameArbol(arbol);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//arbol.mostrarHijos();
		
	}
	
}
