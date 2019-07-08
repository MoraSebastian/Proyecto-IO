package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelCreditos extends JPanel {
	JFrame frame;
	JPanel panel = new JPanel();
	JEditorPane textoHistoria;
	public PanelCreditos(JFrame fram) {
		frame = fram;
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
		btnVolver.setBounds(521, 505, 203, 55);
		btnVolver.setContentAreaFilled(false);
		btnVolver.setBorderPainted(false);
		btnVolver.setOpaque(false);

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionVolver();
			}
		});
		
		textoHistoria = new JEditorPane();
		textoHistoria.setText("Desarrolladores: \n Andrés Rentería \n Sebastián Mora \n Estefanía García \n"
				+ "Dibujante:  Rodrigo Álvarez Avendaño \n"
				+ "Audios:  SodelsCot \n"
				+ "Imágenes:  freePik");
		textoHistoria.setEditable(false);
		textoHistoria.setForeground(new Color(51, 0, 0));
		textoHistoria.setFont(new Font("Century Schoolbook", Font.PLAIN, 26));
		textoHistoria.setBackground(new Color(0,0,0,0));
		textoHistoria.setBounds(300, 211, 921, 334);
		panel.add(textoHistoria);
		
		panel.add(btnVolver);
		
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
		frame.dispose();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicio window = new PantallaInicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
