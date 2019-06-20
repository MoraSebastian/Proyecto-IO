package Logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Archivo {

	public 	ArrayList<Puntaje> puntajes;
	public Archivo() {
		puntajes = new ArrayList<Puntaje>();
	}
	public void leer() {
		// crea el flujo para leer desde el archivo
				File file = new File("C:\\Users\\MARISOL RUEDA\\Desktop\\Proyecto IO\\src\\puntajes.txt");
				Scanner scanner;
				try {
					//se pasa el flujo al objeto scanner
					scanner = new Scanner(file);
					while (scanner.hasNextLine()) {
						// el objeto scanner lee linea a linea desde el archivo
						String linea = scanner.nextLine();
						String[] partes = linea.split(" ");
						Puntaje e= new Puntaje();
						e.setNombre(partes[0]);
						e.setPuntaje(partes[1]);
						agregarPuntaje(e);
					}
					//se cierra el ojeto scanner
					scanner.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	}
	
	public void guardar() {
		vaciar();
		FileWriter flwriter = null;
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("C:\\\\Users\\\\MARISOL RUEDA\\\\Desktop\\\\Proyecto IO\\\\src\\\\puntajes.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			for(int i = 0;i<puntajes.size();i++) {
				bfwriter.write(puntajes.get(i).getNombre()+" "+puntajes.get(i).getPuntaje());
				bfwriter.newLine();

			}
			
			bfwriter.close();

 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void vaciar() {

		PrintWriter writer;
		try {
			writer = new PrintWriter("C:\\\\Users\\\\MARISOL RUEDA\\\\Desktop\\\\Proyecto IO\\\\src\\\\puntajes.txt");
			writer.print(""); writer.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void agregarPuntaje(Puntaje p) {
		puntajes.add(p);
		Puntaje menor;
		 for (int x = 0; x < puntajes.size(); x++) {
		        for (int i = 0; i < puntajes.size()-x-1; i++) {
		            if(Integer.valueOf(puntajes.get(i).getPuntaje()) < Integer.valueOf(puntajes.get(i+1).getPuntaje())){
		                Puntaje tmp = puntajes.get(i+1);
		                puntajes.set(i+1,puntajes.get(i));
		                puntajes.set(i,tmp);
		            }
		        }
		 }
	}
}
