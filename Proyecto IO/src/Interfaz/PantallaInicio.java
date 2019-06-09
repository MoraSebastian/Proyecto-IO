package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import Logica.Arbol;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaInicio {

	public JFrame frame;
	public Arbol arbol = new Arbol();
	private JTextField txtNombreusuario;

	public PantallaInicio() {
		initialize();
		
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 828);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnJugar = new JButton("");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accionJugar();
			}
		});
		
		btnJugar.setSelectedIcon(null);
		btnJugar.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 55.png")));
		btnJugar.setBounds(524, 503, 203, 55);
		btnJugar.setBorderPainted(false);
		btnJugar.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 56.png")));
		btnJugar.setOpaque(false);
		btnJugar.setBorderPainted(false);
		btnJugar.setContentAreaFilled(false);
		frame.getContentPane().add(btnJugar);
		
		JButton btnPuntajes = new JButton("");
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
		btnPuntajes.setBounds(524, 705, 203, 55);
		frame.getContentPane().add(btnPuntajes);
		
		JButton btnCreditos = new JButton("");
		btnCreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionCreditos();
			}
		});
		btnCreditos.setSelectedIcon(null);
		btnCreditos.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 50.png")));
		btnCreditos.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 49.png")));
		btnCreditos.setOpaque(false);
		btnCreditos.setContentAreaFilled(false);
		btnCreditos.setBorderPainted(false);
		btnCreditos.setBounds(723, 706, 203, 55);
		frame.getContentPane().add(btnCreditos);
		
		
		JButton btnDecisiones = new JButton("");
		btnDecisiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionDecision();
			}
		});
		btnDecisiones.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 51.png")));
		btnDecisiones.setBounds(328, 706, 203, 55);
		btnDecisiones.setBorderPainted(false);
		btnDecisiones.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 52.png")));
		btnDecisiones.setOpaque(false);
		btnDecisiones.setBorderPainted(false);
		btnDecisiones.setContentAreaFilled(false);
		frame.getContentPane().add(btnDecisiones);
		
		txtNombreusuario = new JTextField();
		txtNombreusuario.setFont(new Font("Agency FB", Font.PLAIN, 20));
		txtNombreusuario.setBounds(640, 456, 112, 30);
		frame.getContentPane().add(txtNombreusuario);
		txtNombreusuario.setColumns(10);
		
		JLabel lblNickname = new JLabel("Usuario:");
		lblNickname.setForeground(new Color(128, 0, 0));
		lblNickname.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblNickname.setBounds(514, 443, 126, 49);
		frame.getContentPane().add(lblNickname);
		
		JLabel lblContenedorInicial = new JLabel("");
		lblContenedorInicial.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 57.png")));
		lblContenedorInicial.setBounds(196, 397, 913, 250);
		frame.getContentPane().add(lblContenedorInicial);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 58.png")));
		lblLogo.setBounds(-20, -14, 1302, 521);
		frame.getContentPane().add(lblLogo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondo.setIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 33.png")));
		lblFondo.setBounds(-107, 0, 1389, 845);
		frame.getContentPane().add(lblFondo);
		
	}
	
	public void accionJugar(){
		frame.getContentPane().removeAll();
		JPanel panelJ = new PanelJuego(this.arbol);
		panelJ.setBounds(0, 0, 1300, 828);
		frame.add(panelJ);
		frame.repaint();
	}
	
	public void accionCreditos(){
		frame.getContentPane().removeAll();
		JPanel panelC = new PanelCreditos();
		panelC.setBounds(0, 0, 1300, 828);
		frame.add(panelC);
		frame.repaint();
	}
	
	public void accionPuntajes(){
		frame.getContentPane().removeAll();
		JPanel panelP = new PanelPuntaje();
		panelP.setBounds(0, 0, 1300, 828);
		frame.add(panelP);
		frame.repaint();
	}
	
	public void accionDecision(){
		
	}
}
