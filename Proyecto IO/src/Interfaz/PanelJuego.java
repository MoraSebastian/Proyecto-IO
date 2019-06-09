package Interfaz;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelJuego extends JPanel {
	JPanel panel = new JPanel();
	public PanelJuego() {
		setLayout(null);
		
		
		panel.setBackground(new Color(112, 128, 144));
		panel.setBounds(0, 0, 1291, 797);
		add(panel);
		panel.setLayout(null);
		
		JInternalFrame internalFrameSinopsis = new JInternalFrame("Sinopsis");
		internalFrameSinopsis.setBounds(154, 65, 1093, 700);
		panel.add(internalFrameSinopsis);
		internalFrameSinopsis.setFrameIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 37.png")));
		internalFrameSinopsis.setClosable(true);
		internalFrameSinopsis.setVisible(false);
		internalFrameSinopsis.getContentPane().setLayout(null);
		
		JLabel lblAquiVaLa = new JLabel("aqui va la sinopsis");
		lblAquiVaLa.setBounds(172, 67, 185, 14);
		internalFrameSinopsis.getContentPane().add(lblAquiVaLa);
		internalFrameSinopsis.setVisible(true);
		
		JButton btnBotondecision2 = new JButton("");
		btnBotondecision2.setOpaque(false);
		btnBotondecision2.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision2.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision2.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision2.setContentAreaFilled(false);
		btnBotondecision2.setBorderPainted(false);
		btnBotondecision2.setBounds(642, 628, 378, 44);
		panel.add(btnBotondecision2);
		
		JButton btnBotondecision = new JButton("pruebaaa");
		btnBotondecision.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotondecision.setRolloverIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 39.png")));
		btnBotondecision.setBounds(232, 628, 378, 44);
		btnBotondecision.setBorderPainted(false);
		btnBotondecision.setPressedIcon(new ImageIcon(PantallaInicio.class.getResource("/RecusosInterfaz/Recurso 38.png")));
		btnBotondecision.setOpaque(false);
		btnBotondecision.setContentAreaFilled(false);
		panel.add(btnBotondecision);
		
		JButton btnDerecho = new JButton("");
		btnDerecho.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 40.png")));
		btnDerecho.setBounds(1050, 543, 68, 61);
		btnDerecho.setBorderPainted(false);
		btnDerecho.setOpaque(false);
		btnDerecho.setContentAreaFilled(false);
		panel.add(btnDerecho);
		
		JButton btnIzquierda = new JButton("");
		btnIzquierda.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 41.png")));
		btnIzquierda.setBounds(972, 538, 68, 61);
		btnIzquierda.setBorderPainted(false);
		btnIzquierda.setOpaque(false);
		btnIzquierda.setContentAreaFilled(false);
		panel.add(btnIzquierda);
		
		JEditorPane textoHistoria = new JEditorPane();
		textoHistoria.setEditable(false);
		textoHistoria.setForeground(new Color(51, 0, 0));
		textoHistoria.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		textoHistoria.setBackground(new Color(0,0,0,0));
		textoHistoria.setText("Sirve ggggggggggggggggggggggggggggggg gggggggggggggggggggggggggggggggggggggggggggggggggggggggg gggggggggggggggggggggggggggggg gggggggggggggggggggggggggggggggggggggggggggggggggg\r\ntransparenteeee\r\nyujuuuuu\r\njyujyjy\r\njyjy\r\njyj\r\n");
		textoHistoria.setBounds(180, 211, 921, 334);
		panel.add(textoHistoria);
		
		JLabel lblPuntaje = new JLabel("puntaje");
		lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntaje.setFont(new Font("Agency FB", Font.PLAIN, 43));
		lblPuntaje.setBounds(929, 46, 266, 72);
		panel.add(lblPuntaje);
		
		JLabel lblTipoopcion = new JLabel("DECISI\u00D3N");
		lblTipoopcion.setForeground(new Color(220, 20, 60));
		lblTipoopcion.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lblTipoopcion.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 43.png")));
		lblTipoopcion.setBounds(71, 51, 298, 72);
		panel.add(lblTipoopcion);
		
		JLabel lblContenedorpreguntas = new JLabel("");
		lblContenedorpreguntas.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 46.png")));
		lblContenedorpreguntas.setBounds(25, 572, 1222, 218);
		panel.add(lblContenedorpreguntas);
		
		JLabel lblContenedorjuego = new JLabel("");
		lblContenedorjuego.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 47.png")));
		lblContenedorjuego.setBounds(27, 147, 1250, 650);
		panel.add(lblContenedorjuego);
		
		JLabel lblPanelsuperior = new JLabel("");
		lblPanelsuperior.setBounds(35, 11, 1222, 150);
		panel.add(lblPanelsuperior);
		lblPanelsuperior.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 48.png")));
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PanelJuego.class.getResource("/RecusosInterfaz/Recurso 33.png")));
		lblFondo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFondo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblFondo.setBounds(-107, 0, 1389, 845);
		panel.add(lblFondo);

	}
}
