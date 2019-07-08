package Interfaz;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Logica.Arbol;
import Logica.Nodo;
import Logica.Puntaje;
import Logica.Reproductor;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.SystemColor;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

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
	JLabel lblIMG;
	JLabel lblPanelsuperior;
	JButton btnProbabilidad;
	String usuario;
	JFrame frame;
	
	//Arbol que llega (Completo)
	Arbol arbol;
	JButton btnPuntajes;
	//Arbol que sale
	Arbol salida = new Arbol();
	double puntaje = 0;
	Reproductor repro = new Reproductor();
	private void cargar() {
		btnBotondecision.setText("");
		btnDerecho.setEnabled(true);
		btnIzquierda.setEnabled(true);
		btnBotondecision2.setText("");
		lblPuntaje.setText(String.valueOf(Integer.valueOf(lblPuntaje.getText())+(int)arbol.getReferencia().getPuntaje()));
		switch(arbol.getReferencia().getTipo()) {
		case "probabilidad":
			btnProbabilidad.setVisible(true);
			lblTipoopcion.setText("Probabilidad");
			btnBotondecision.setEnabled(false);
			btnBotondecision2.setEnabled(false);
			lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 32.png")));
			break;
		case "decision":
			btnProbabilidad.setVisible(false);
			btnBotondecision.setEnabled(true);
			btnBotondecision2.setEnabled(true);
			lblTipoopcion.setText("Decision");
			lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 31.png")));
			break;
		case "terminal":
			btnBotondecision.setEnabled(false);
			btnBotondecision2.setEnabled(false);
			btnPuntajes.setVisible(true);
			break;
		}
		
		textoHistoria.setText(arbol.getReferencia().getEnunciado());
		textoHistoria.setVisible(true);
		repro.Reproducir(arbol.getReferencia().getAudio());
		if(arbol.getReferencia().getUbicacion()!=null) {
			ImageIcon fot = new ImageIcon(PanelJuego.class.getResource(arbol.getReferencia().getUbicacion()));
			Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblIMG.getWidth(), lblIMG.getHeight(), Image.SCALE_DEFAULT));
			lblIMG.setIcon(icono);
			this.repaint();
		}
		lblIMG.setVisible(false);
		btnIzquierda.setEnabled(false);
		panel.updateUI();
		btnBotondecision.setText(arbol.getReferencia().getOpciones().get(0));
		if(arbol.getReferencia().getOpciones().size()>1) {
			btnBotondecision2.setText(arbol.getReferencia().getOpciones().get(1));
		}
		
	}
	
	public PanelJuego(Arbol arbol,String usuario,JFrame fram) {
		frame = fram;
		this.usuario = usuario;
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
		internalFrameSinopsis.setBounds(0, 0, 1193, 700);
		panel.add(internalFrameSinopsis);
		internalFrameSinopsis.setFrameIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		internalFrameSinopsis.setClosable(true);
		internalFrameSinopsis.setVisible(false);
		internalFrameSinopsis.getContentPane().setLayout(null);
		
		lblAquiVaLa = new JLabel();
		lblAquiVaLa.setBounds(0,0,1185,700);
		lblAquiVaLa.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Sinopsis-04.png")));
		internalFrameSinopsis.getContentPane().add(lblAquiVaLa);
		internalFrameSinopsis.setVisible(true);
		
		btnPuntajes = new JButton("");
		btnPuntajes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionPuntajes();
			}
		});
		btnPuntajes.setSelectedIcon(null);
		btnPuntajes.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 54.png")));
		btnPuntajes.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 53.png")));
		btnPuntajes.setOpaque(false);
		btnPuntajes.setContentAreaFilled(false);
		btnPuntajes.setBorderPainted(false);
		btnPuntajes.setVisible(false);
		btnPuntajes.setBounds(300, 500, 200, 100);
		panel.add(btnPuntajes);
		
		btnBotondecision2 = new JButton("");
		btnBotondecision2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBotondecision2.setOpaque(false);
		btnBotondecision2.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision2.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision2.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setContentAreaFilled(false);
		btnBotondecision2.setActionCommand("btn2");
		btnBotondecision2.addActionListener( this);
		btnBotondecision2.setBorderPainted(false);
		btnBotondecision2.setBounds(232,700, 1200, 44);
		panel.add(btnBotondecision2);
		
		btnBotondecision = new JButton("");
		btnBotondecision.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBotondecision.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision.setBounds(232, 628, 1200, 44);
		btnBotondecision.setBorderPainted(false);
		btnBotondecision.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setOpaque(false);
		btnBotondecision.setActionCommand("btn1");
		btnBotondecision.addActionListener( this);
		btnBotondecision.setContentAreaFilled(false);
		panel.add(btnBotondecision);
		
		
		btnProbabilidad = new JButton();
		btnProbabilidad.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 44.png")));
		btnProbabilidad.setBounds(700, 500, 200, 100);
		btnProbabilidad.setBorderPainted(false);
		btnProbabilidad.setOpaque(false);
		btnProbabilidad.setContentAreaFilled(false);
		btnProbabilidad.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 45.png")));
		btnProbabilidad.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 45.png")));
		btnProbabilidad.setActionCommand("probabilidad");
		btnProbabilidad.addActionListener( this);
		panel.add(btnProbabilidad);
		
		btnDerecho = new JButton("");
		btnDerecho.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 40.png")));
		btnDerecho.setBounds(1050, 543, 68, 61);
		btnDerecho.setBorderPainted(false);
		btnDerecho.setOpaque(false);
		btnDerecho.setActionCommand("derecho");
		btnDerecho.addActionListener(this);
		btnDerecho.setContentAreaFilled(false);
		panel.add(btnDerecho);
		
		btnIzquierda = new JButton("");
		btnIzquierda.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 41.png")));
		btnIzquierda.setBounds(972, 538, 68, 61);
		btnIzquierda.setBorderPainted(false);
		btnIzquierda.setOpaque(false);
		btnIzquierda.setActionCommand("izquierdo");
		btnIzquierda.addActionListener(this);
		btnIzquierda.setContentAreaFilled(false);
		panel.add(btnIzquierda);
		
		textoHistoria = new JEditorPane();
		textoHistoria.setEditable(false);
		textoHistoria.setForeground(new Color(51, 0, 0));
		textoHistoria.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		textoHistoria.setBackground(new Color(0,0,0,0));
		textoHistoria.setBounds(180, 211, 921, 334);
		panel.add(textoHistoria);
		
		lblIMG = new JLabel();
		lblIMG.setBounds(180, 211, 921, 334);
		panel.add(lblIMG);
		
		lblPuntaje = new JLabel("0");
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Agency FB", Font.PLAIN, 43));
		lblPuntaje.setBounds(929, 46, 266, 72);
		panel.add(lblPuntaje);
		
		lblTipoopcion = new JLabel();
		lblTipoopcion.setForeground(new Color(220, 20, 60));
		lblTipoopcion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
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
			arbol.getReferencia().setDecision(0);
			System.out.println(arbol.getReferencia().getDecision()+" "+comando);
			//System.out.println(arbol.getReferencia().getDecision());
			salida.agregarNodo(arbol.getReferencia());
			arbol.setReferencia( (Nodo) arbol.getReferencia().getPartes().get(0));
			System.out.println(arbol.getReferencia().getEnunciado());
			puntaje += arbol.getReferencia().getPuntaje();
			
			//System.out.println(arbol.getReferencia().getEnunciado());
			cargar();
		break;
		case "btn2":
			arbol.getReferencia().setDecision(1);
			System.out.println(arbol.getReferencia().getDecision()+" "+comando);
			//System.out.println(arbol.getReferencia().getDecision());
			salida.agregarNodo(arbol.getReferencia());
			arbol.setReferencia( (Nodo) arbol.getReferencia().getPartes().get(1));
			System.out.println(arbol.getReferencia().getEnunciado());
			puntaje += arbol.getReferencia().getPuntaje();
			
			cargar();
			
		break;
		case "probabilidad":
			double p =  Math.random()*1;
			System.out.println(p);
			if(p<0.5) {
				btnBotondecision.setEnabled(true);
			}else {
				btnBotondecision2.setEnabled(true);
			}
			break;
		case "derecho":
			lblIMG.setVisible(true);
			textoHistoria.setVisible(false);
			btnIzquierda.setEnabled(true);
			btnDerecho.setEnabled(false);
			
			break;
		case "izquierdo":
			lblIMG.setVisible(false);
			textoHistoria.setVisible(true);
			btnIzquierda.setEnabled(false);
			btnDerecho.setEnabled(true);
			repro.Reproducir(arbol.getReferencia().getAudio());
			break;
		}
		
	}
	
	public void accionPuntajes(){
		Puntaje p = new Puntaje();
		p.setNombre(usuario);
		p.setPuntaje(lblPuntaje.getText());
		removeAll();
		JPanel panelP = new PanelPuntaje(p,arbol,frame);
		panelP.setBounds(0, 0, 1300, 828);
		add(panelP);
		repaint();
	}
	
}
