package Logica;

import java.applet.AudioClip;

public class Reproductor {
	AudioClip sound;	
   public void Reproducir(String ruta) {
	   
	   sound = java.applet.Applet.newAudioClip(getClass().getResource(ruta));
	   sound.play();
	   System.out.println("REPRODUCE");	
   }
}