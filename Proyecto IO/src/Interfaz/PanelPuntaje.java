package Interfaz;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPuntaje extends JPanel {
	JPanel panel = new JPanel();
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
}
