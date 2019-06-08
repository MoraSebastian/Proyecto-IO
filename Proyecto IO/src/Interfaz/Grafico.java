package Interfaz;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

import Logica.Arbol;
import Logica.Componente;



/**
 * Clase que permite dibujar en la interfaz
 * @author anferente97
 * Fecha: 20.4.19
 */
public class Grafico extends JPanel{

	/**
	 * Referencia al arbol
	 */
	private Arbol a;
	
	/**
	 * Elemento que permite ubicarse en la gráfica
	 */
	private FontMetrics fm = null;
	
	/**
	 * Mapeo
	 */
    private HashMap posicionNodo = null;
    
    /**
     * Distancia entre los elementos
     */
    int distancia = 25;
    int dye;
    
    /**
     * Constructor
     */
    public Grafico(Arbol a) {
    	this.a = a;
    	posicionNodo = new HashMap();
    	repaint();
    }	
    
    public void calcular() {
    	posicionNodo.clear();
    	calcularPosiciones(a.getInicio(),5,20);
    }
    
    public void calcularPosiciones(Componente nodo, int x, int y) {
    	if(nodo!=null){
             int ancho = fm.stringWidth(String.valueOf(nodo.getId()));
             if(nodo.getTipo().equals("decision")) {
            	 posicionNodo.put(nodo, new Rectangle(x-ancho/2,y-fm.getHeight()-3,ancho+6,fm.getHeight())); 
             }else if(nodo.getTipo().equals("probabilidad")){
            	 posicionNodo.put(nodo, new Ellipse2D.Double(x-ancho/2,y-fm.getHeight()-3,ancho+6,fm.getHeight()));
             }else if(nodo.getTipo().equals("gasto")) {
            	 posicionNodo.put(nodo, new Polygon(new int[] {x-4,x+ancho-4,x+(2*ancho)-4},new int[] {y,y-fm.getHeight()-6,y},3));
             }
             
             calcularPosiciones(nodo.getSiguiente(),x,y+distancia);
            	 
         }
    }
    
    public void dibujar(Graphics2D g){
    	 Componente referencia = a.getInicio();
         while(referencia!=null){
        	 if(referencia.getTipo().equals("decision")) {
        		 Rectangle rectangulo = (Rectangle) posicionNodo.get(referencia);
        		 g.draw(rectangulo);
        		 g.drawString(String.valueOf(referencia.getId()),rectangulo.x+3,rectangulo.y+dye);
             }else if(referencia.getTipo().equals("probabilidad")){
            	 Ellipse2D eli = (Ellipse2D)posicionNodo.get(referencia);
            	 g.draw(eli);
            	 g.drawString(String.valueOf(referencia.getId()),(int)eli.getX()+3,(int)eli.getY()+dye);
             }else if(referencia.getTipo().equals("gasto")) {
            	Polygon triangulo  = (Polygon) posicionNodo.get(referencia);
            	g.draw(triangulo);
            	
             }
        	
            
           
            
            referencia = referencia.getSiguiente();
         	
         }
    }
    
   
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fm = g.getFontMetrics();
        calcular();
        Graphics2D graf = (Graphics2D) g;
        graf.translate(0,0);
        dye = fm.getLeading()+fm.getAscent();
        dibujar(graf);
    }
}
