package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Arbol;
import Logica.Componente;
import Logica.Nodo;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FrameArbol extends JFrame {

	private JPanel contentPane;
	private Arbol arbol;
	JScrollPane scroll;
	JPanel panel;
	/**
	 * Create the frame.
	 */
	public FrameArbol(Arbol arbol) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scroll = new JScrollPane();
		scroll.setBackground(Color.WHITE);
		scroll .setBounds(0, 0, 434, 423);
		scroll .setViewportView(panel);
		scroll .getViewport().setView(panel);
		
		panel.setLayout(null);
		
		panel.setPreferredSize(new Dimension(480,470));
		
		contentPane.add(scroll);
		this.arbol = arbol;
		
		Graficar();
	}
	public void Graficar() {
		Componente comp = arbol.getInicio();
		int x = 25;
		int y = 25;
		String tipo;
	//	System.out.println("Tipo: "+comp.getTipo());
		while(comp != null) {
			tipo = comp.getTipo();
			JLabel lbl, lb;			
			switch(tipo) {
			case "decision":				
				lbl = new JLabel();
				lbl.setBounds(x, y, 85, 85);
				
				lb = new JLabel();
				lb.setBounds(x + 95, y ,250 , 100);
				lb.setText("<html>"+comp.getOpciones().get(comp.getDecision())+"<html>");
				lbl.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 43.png")));
				panel.add(lbl);
				panel.add(lb);
				System.out.println("decision");
				break;
			case "probabilidad":
				lbl = new JLabel();
				lbl.setBounds(x, y, 85, 85);
				
				lb = new JLabel();
				lb.setBounds(x + 95, y ,250 , 100);
				lb.setText("<html>"+comp.getOpciones().get(comp.getDecision())+"<html>");
				lbl.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 42.png")));
				panel.add(lbl);
				panel.add(lb);
				break;
			case "terminal":
				lbl = new JLabel();
				lbl.setBounds(x, y, 200, 85);							
				lbl.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 59.png")));
				panel.add(lbl);				
				break;
			}			
			comp = comp.getSiguiente();
			panel.setPreferredSize(new Dimension(480,470 +y-100 ));
			y += 150;
		}
		//cambiar entre nodos
		
	}
}
