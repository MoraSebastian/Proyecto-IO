package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Logica.Arbol;
import Logica.Archivo;
import Logica.Puntaje;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class PanelPuntaje extends JPanel {
	JPanel panel = new JPanel();
	Archivo a  = new Archivo();
	int y = 220;
	int x = 350;
	int contador = 25;
	JLabel lbl;
	JButton btnDecisiones;
	Arbol arbol;
	public PanelPuntaje() {
		setLayout(null);
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 1291, 797);
		add(panel);
		panel.setLayout(null);
		
		JButton btnVolver = new JButton("");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnVolver.setSelectedIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 35.png")));
		btnVolver.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 34.png")));
		btnVolver.setBounds(521, 705, 203, 55);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		
		panel.add(btnVolver);
		a.leer();

		for(int i = 0;i< a.puntajes.size();i++) {
			if(y>500) {
				x +=200;
				y=220;
			}
			lbl = new JLabel();
			lbl.setForeground(new Color(51, 0, 0));
			lbl.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
			y +=contador;
			lbl.setBounds(x,y,350,30);
			lbl.setText((i+1)+". "+a.puntajes.get(i).getNombre()+" "+a.puntajes.get(i).getPuntaje());
			panel.add(lbl);
		}
		JLabel lblContenedorjuego = new JLabel("");
		lblContenedorjuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblContenedorjuego.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 36.png")));
		lblContenedorjuego.setBounds(0, 158, 1250, 418);
		panel.add(lblContenedorjuego);
		
		JLabel lblPanelsuperior = new JLabel("");
		lblPanelsuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelsuperior.setBounds(35, 11, 1222, 150);
		panel.add(lblPanelsuperior);
		lblPanelsuperior.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 37.png")));
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 33.png")));
		lblFondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondo.setBounds(-107, 0, 1389, 845);
		panel.add(lblFondo);
	}
	
	public PanelPuntaje(Puntaje p, Arbol arbol) {
		this.arbol =arbol;
		
		setLayout(null);
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 1291, 797);
		add(panel);
		panel.setLayout(null);
		
		JButton btnVolver = new JButton("");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDecisiones = new JButton();
		btnDecisiones.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 51.png")));
		btnDecisiones.setBounds(328, 706, 203, 55);
		btnDecisiones.setBorderPainted(false);
		btnDecisiones.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 52.png")));
		btnDecisiones.setOpaque(false);
		btnDecisiones.setBorderPainted(false);
		btnDecisiones.setContentAreaFilled(false);
		btnDecisiones.setVisible(true);
		btnDecisiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionDecision();
			}
		});
		panel.add(btnDecisiones);
		
		btnVolver.setSelectedIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 35.png")));
		btnVolver.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 34.png")));
		btnVolver.setBounds(521, 705, 203, 55);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);
		
		panel.add(btnVolver);
		a.leer();
		a.agregarPuntaje(p);
		for(int i = 0;i< a.puntajes.size();i++) {
			if(y>500) {
				x +=200;
				y=220;
			}
			lbl = new JLabel();
			lbl.setForeground(new Color(51, 0, 0));
			lbl.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
			y +=contador;
			lbl.setBounds(x,y,350,30);
			lbl.setText((i+1)+". "+a.puntajes.get(i).getNombre()+" "+a.puntajes.get(i).getPuntaje());
			panel.add(lbl);
		}
		
		JLabel lblContenedorjuego = new JLabel("");
		lblContenedorjuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblContenedorjuego.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 36.png")));
		lblContenedorjuego.setBounds(0, 158, 1250, 418);
		panel.add(lblContenedorjuego);
		
		JLabel lblPanelsuperior = new JLabel("");
		lblPanelsuperior.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanelsuperior.setBounds(35, 11, 1222, 150);
		panel.add(lblPanelsuperior);
		lblPanelsuperior.setIcon(new ImageIcon(PanelPuntaje.class.getResource("/RecusosInterfaz/Recurso 37.png")));
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 33.png")));
		lblFondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondo.setBounds(-107, 0, 1389, 845);
		panel.add(lblFondo);
	}
	public void accionVolver(){
		
	}
	
	public void accionDecision() {
		EventQueue.invokeLater(new Runnable() { public void run() { 
			try { 
				FrameArbol frame = new FrameArbol(arbol); 
				frame.setVisible(true);
			} catch (Exception e){
				e.printStackTrace(); 
			} } });
	}

}
