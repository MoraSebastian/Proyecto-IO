package Controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import udistrital.edu.Ciencias3.Interfaz.PanelBotones;

public class Controlador {
	
	// EN ESTA SECCION DEFINES EL TAMAÑO DE LA IMAGEN
	
	// Crea un icono que referencie a la imagen en disco
	ImageIcon iconoOriginal = new ImageIcon(PanelBotones.class.getResource("/imgs/delgada.png"));
	int ancho = 50; // ancho en pixeles que tendra el icono escalado
	int alto = 50; // alto (para que conserve la proporcion pasamos -1)

	// Obtiene un icono en escala con las dimensiones especificadas
	ImageIcon iconoEscala = new ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));

	
	// SELECCIONAS EL BOTÓN Y AGREGAS EL MOUSELISTENER 
	//de esta clase solo te importan el mouseEntered y el mouse Exited
	btnBuscar.addMouseListener(new MouseListener(){
		@Override
		public void mouseClicked(MouseEvent me) {
			me.getX();
	        me.getY();
			
		}
		@Override
		//Acá modificas por la imagen que quieres que aparezca cuando el mouse entre en el botón
		public void mouseEntered(MouseEvent me) {
			// Crea un icono que referencie a la imagen en disco
			ImageIcon iconoOriginal1 = new ImageIcon(PanelBotones.class.getResource("/imgs/gruesa.png"));

			int ancho = 50; // ancho en pixeles que tendra el icono escalado
			int alto = 50; // alto (para que conserve la proporcion pasamos -1)

			// Obtiene un icono en escala con las dimensiones especificadas
			ImageIcon iconoEscala1 = new ImageIcon(iconoOriginal1.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
			btnBuscar.setIcon(iconoEscala1);
			
		}
		@Override
		//Acá debes poner la misma imagen que tenía el botón antes del cambio, para que cuando este salga se devuelva a lo original
		public void mouseExited(MouseEvent arg0) {
			// Crea un icono que referencie a la imagen en disco
			ImageIcon iconoOriginal = new ImageIcon(PanelBotones.class.getResource("/imgs/delgada.png"));

			int ancho = 50; // ancho en pixeles que tendra el icono escalado
			int alto = 50; // alto (para que conserve la proporcion pasamos -1)

			// Obtiene un icono en escala con las dimensiones especificadas
			ImageIcon iconoEscala = new ImageIcon(iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
			btnBuscar.setIcon(iconoEscala);
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	    });
}
