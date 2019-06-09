package Interfaz;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Logica.Arbol;
import Logica.Nodo;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelJuego extends JPanel implements ActionListener {
	JPanel panel = new JPanel();
	JLabel lblFondo;
	JInternalFrame internalFrameSinopsis;
	JLabel lblAquiVaLa;
	JButton btnBotondecision2;
	JButton btnBotondecision;
	JButton btnDerecho;
	JButton btnIzquierda;
	JEditorPane textoHistoria;
	JLabel lblPuntaje;
	JLabel lblTipoopcion ;
	JLabel lblContenedorpreguntas;
	JLabel lblContenedorjuego;
	JLabel lblPanelsuperior;
	//Arbol que llega (Completo)
	Arbol arbol;
	
	//Arbol que sale
	Arbol salida = new Arbol();
	
	
	private void cargar() {
		switch(arbol.getReferencia().getTipo()) {
		case "probailidad":
			lblTipoopcion.setText("Probabilidad");
			lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 42.png")));
			break;
		case "decision":
			lblTipoopcion.setText("Decision");
			lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 43.png")));
			break;
		}
		textoHistoria.setText(arbol.getReferencia().getEnunciado());
		textoHistoria.setEditable(false);
		btnBotondecision.setText(arbol.getReferencia().getOpciones().get(0));
		if(arbol.getReferencia().getOpciones().size()>1) {
			btnBotondecision2.setText(arbol.getReferencia().getOpciones().get(1));

		}
	}
	
	public PanelJuego(Arbol arbol) {
		this.arbol = arbol;
		construirPanel();
		salida.vaciar();
		cargar();
	}
	
	private void construirPanel() {
		setLayout(null);
		
		
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 1291, 797);
		add(panel);
		panel.setLayout(null);
		
		internalFrameSinopsis = new JInternalFrame("Sinopsis");
		internalFrameSinopsis.setBounds(154, 65, 1093, 700);
		panel.add(internalFrameSinopsis);
		internalFrameSinopsis.setFrameIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 37.png")));
		internalFrameSinopsis.setClosable(true);
		internalFrameSinopsis.setVisible(false);
		internalFrameSinopsis.getContentPane().setLayout(null);
		
		lblAquiVaLa = new JLabel("aqui va la sinopsis");
		lblAquiVaLa.setBounds(172, 67, 185, 14);
		internalFrameSinopsis.getContentPane().add(lblAquiVaLa);
		internalFrameSinopsis.setVisible(true);
		
		btnBotondecision2 = new JButton("");
		btnBotondecision2.setOpaque(false);
		btnBotondecision2.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision2.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision2.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setContentAreaFilled(false);
		btnBotondecision2.setActionCommand("btn2");
		btnBotondecision2.addActionListener( this);
		btnBotondecision2.setBorderPainted(false);
		btnBotondecision2.setBounds(642, 628, 378, 44);
		panel.add(btnBotondecision2);
		
		btnBotondecision = new JButton("");
		btnBotondecision.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision.setBounds(232, 628, 378, 44);
		btnBotondecision.setBorderPainted(false);
		btnBotondecision.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setOpaque(false);
		btnBotondecision.setActionCommand("btn1");
		btnBotondecision.addActionListener( this);
		btnBotondecision.setContentAreaFilled(false);
		panel.add(btnBotondecision);
		
		btnDerecho = new JButton("");
		btnDerecho.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 40.png")));
		btnDerecho.setBounds(1050, 543, 68, 61);
		btnDerecho.setBorderPainted(false);
		btnDerecho.setOpaque(false);
		btnDerecho.setContentAreaFilled(false);
		panel.add(btnDerecho);
		
		btnIzquierda = new JButton("");
		btnIzquierda.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 41.png")));
		btnIzquierda.setBounds(972, 538, 68, 61);
		btnIzquierda.setBorderPainted(false);
		btnIzquierda.setOpaque(false);
		btnIzquierda.setContentAreaFilled(false);
		panel.add(btnIzquierda);
		
		textoHistoria = new JEditorPane();
		textoHistoria.setEditable(false);
		textoHistoria.setForeground(new Color(51, 0, 0));
		textoHistoria.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		textoHistoria.setBackground(new Color(0,0,0,0));
		textoHistoria.setBounds(180, 211, 921, 334);
		panel.add(textoHistoria);
		
		lblPuntaje = new JLabel("puntaje");
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Agency FB", Font.PLAIN, 43));
		lblPuntaje.setBounds(929, 46, 266, 72);
		panel.add(lblPuntaje);
		
		lblTipoopcion = new JLabel("DECISI\u00D3N");
		lblTipoopcion.setForeground(new Color(220, 20, 60));
		lblTipoopcion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 43.png")));
		lblTipoopcion.setBounds(71, 51, 298, 72);
		panel.add(lblTipoopcion);
		
		lblContenedorpreguntas = new JLabel("");
		lblContenedorpreguntas.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 46.png")));
		lblContenedorpreguntas.setBounds(25, 572, 1222, 218);
		panel.add(lblContenedorpreguntas);
		
		lblContenedorjuego = new JLabel("");
		lblContenedorjuego.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 47.png")));
		lblContenedorjuego.setBounds(27, 147, 1250, 650);
		panel.add(lblContenedorjuego);
		
		lblPanelsuperior = new JLabel("");
		lblPanelsuperior.setBounds(35, 11, 1222, 150);
		panel.add(lblPanelsuperior);
		lblPanelsuperior.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 48.png")));
		
		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 33.png")));
		lblFondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondo.setBounds(-107, 0, 1389, 845);
		panel.add(lblFondo);

	}
	
	public void actionPerformed(ActionEvent evento) {
		String comando = evento.getActionCommand();

		switch (comando) {
		case "btn1":
			salida.agregarNodo(arbol.getReferencia());
			arbol.setReferencia( (Nodo) arbol.getReferencia().getPartes().get(0));
			
			if(arbol.getReferencia().getTipo().equals("terminal")) {
				EventQueue.invokeLater(new Runnable() { public void run() { 
					try { FrameArbol frame = new FrameArbol(arbol); frame.setVisible(true); 
					} catch (Exception e){
						e.printStackTrace(); 
					} } });
			}else {
				cargar();
			}
		break;
		case "btn2":
			salida.agregarNodo(arbol.getReferencia());
			arbol.setReferencia( (Nodo) arbol.getReferencia().getPartes().get(1));
			
			if(arbol.getReferencia().getTipo().equals("terminal")) {
				EventQueue.invokeLater(new Runnable() { public void run() { 
					try { FrameArbol frame = new FrameArbol(arbol); frame.setVisible(true); 
					} catch (Exception e){
						e.printStackTrace(); 
					} } });
			}else {
				cargar();
			}
			
		break;
		
		}
		
	}
	
	
}
