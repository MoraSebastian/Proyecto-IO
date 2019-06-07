package Interfaz;

import javax.swing.JPanel;

import Logica.Arbol;


import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

public class PanelGrafico extends JPanel {

	private Arbol a;
	private JInternalFrame internalFrame;
	
	public PanelGrafico(Arbol a) {
		setLayout(null);
		this.a = a;
		internalFrame = new JInternalFrame("Datos");
		internalFrame.setBounds(0, 0, 815, 325);
		add(internalFrame);
		internalFrame.setVisible(true);
		

	}
	
	  public void graficar(){
	        this.removeAll();
	        Rectangle tamano = this.internalFrame.getBounds();
	        this.internalFrame = null;
	        this.internalFrame = new JInternalFrame("Datos",true);
	        this.add(this.internalFrame);
	        this.internalFrame.setVisible(true);
	        this.internalFrame.setBounds(tamano);
	        this.internalFrame.setEnabled(false);
	        this.internalFrame.setResizable(false);
	        this.internalFrame.add(new Grafico(a),BorderLayout.CENTER);
	    }
}
