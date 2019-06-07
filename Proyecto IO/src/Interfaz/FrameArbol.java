package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Arbol;


public class FrameArbol extends JFrame {


	/**
	 * panel del grafico 
	 */
	private PanelGrafico pg;
	
	private Arbol arbol;
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public FrameArbol(Arbol arbol) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(820, 355);
		setTitle("Arbol");
		setLayout(new BorderLayout());
		setResizable(false);
		this.arbol = arbol;
		pg = new PanelGrafico(arbol);
		add(pg,BorderLayout.CENTER);
		pg.graficar();
	}

}
