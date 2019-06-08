package Logica;

import java.awt.EventQueue;

import Interfaz.FrameArbol;

public class Arbol {
	private Nodo nodo;
	public void construirArbol() {
		
		//Nodo 0
		nodo = new Nodo(0," la 1:30 de la tarde, se acerca la clase de IO3, Morita ya decidió proponerse"
				+ " a conquistar aquella chica solitaria, tímida y misteriosa que siempre le dió curiosidad. "
				+ "Necesita buscar una excusa para iniciar una conversación ¿Qué hará?");
		nodo.setTipo(nodo.DECISION);
		nodo.agregarOpcion("Preguntarle por la tarea que hay para la clase.");
		
		//Nodo 1 Acercarse a la chica para saber que hacer
		Nodo n1 = new Nodo(1,"Morita se acerca a la chica y le pregunta qué había para hoy. "
				+ "Ella se voltea hacia él y le dice que hoy es	la entrega del ejercicio de árboles de decisión"
				+ " ¿Cómo puede Morita continuar la conversación?");
		n1.setTipo(n1.DECISION);
		n1.agregarOpcion("Pedirle ayuda con la tarea (aunque ya la tienes hecha)");
		n1.agregarOpcion("Ofrecerle ayuda con la tarea");
		nodo.addpart(n1);
		
		//Nodo 1.1 Pedir ayuda con la tarea
		Nodo n11 = new  Nodo(2,"Ella acepta ayudarlo y Morita se sienta a su lado para que le explique lo que no entiende."
				+ " A lo lejos divisa a su grupo de amigos, espera que no se acercen  a arruinar la oportunidad.");
		n11.setTipo(n11.PROBABILIDAD);
		n11.agregarOpcion("Sus amigos se acercan.");
		n11.agregarOpcion("Sus amigos no se acercan.");
		n1.addpart(n11);
		
		//Nodo 1.1.1 Los amigos se acercan
		Nodo n111 = new Nodo(3,"Por la puerta se acerca el grupo de IO de Morita. "
				+ "Uno de ellos le dice: 'Parce,  páseme la tarea que me dijo que ya la tenía."
				+ "La chica se voltea y mira hacia Morita con cara de enojo por haberla echo perder el tiempo, se va.");
		n111.setTipo(n111.TERMINAL);
		n11.addpart(n111);
		
		//NODO 1.1.2 Los amigos no se acercan
		Nodo n112 = new Nodo(3,"La chica le explica exitosamente y Morita resuelve la tarea (de nuevo)."
				+ "Antes de que la clase empiece, Morita le pregunta su nombre a lo que ella le " + 
				"dice que es Catalina. Morita le dice: \"Oye, muchas gracias, te debo una. La próxima te" + 
				"invito a algo, por el favor.\"" + 
				"\n" + 
				"Pasó una semana, las siguientes ocasiones en que la encontraba, la saludaba. " + 
				"Necesitaba una oportunidad para hacerle la invitación. Aquel momento llegó, se " + 
				"encontraba sola leyendo. Morita planea acercarse, pero debe tener claro que tipo " + 
				"de invitación hacerle para que ella acepte.");
		n112.agregarOpcion("Invitarla a tomar cerveza");
		n112.agregarOpcion("Invitarla a comer bonice.");
		n11.addpart(n112);
		
		
		//Nodo 1.1.2.2 Invitarla a comer Bonice
		Nodo n1122 = new Nodo(4,"A Catalina le agrada la idea de ir a comer bonice, Morita espera que haga un buen clima porque el bonice solo es rico cuando hace calor.");
		n1122.setTipo(n1122.PROBABILIDAD);
		n1122.agregarOpcion("No llueve y hace buen clima.");
		n1122.agregarOpcion("Cae un aguacero.");
		n112.addpart(n1122);
		
		
		//Nodo 1.1.2.2.1 No llueve
		Nodo n11221 = new Nodo(5,"Morita y Catalina salen a comer bonice, tienen una buena charla y disfrutan el momento." + 
				"Se dirigen de nuevo a la universidad, pero Morita está decidido a hacerle una invitación " + 
				"porque siente que tuvieron buena química. Si lo hace en ese momento, puede que no sea " + 
				"apropiado, pero si lo hace antes de despedirse, puede que se acobarde");
		n11221.setTipo(n11221.DECISION);
		n11221.agregarOpcion("Pedirle en ese momento una cita.");
		n11221.agregarOpcion("Esperar a la hora de despedirse para pedirle la cita.");
		n1122.addpart(n11221);
		
		//Nodo 1.1.2.2.2 Llueve
		Nodo n11222 = new Nodo(5, "Al ver que llueve, Morita le propone ir a comer empanadita de 1000, ya que no cuenta con presupuesto para invitarla para algo mas caro. El espera que ella acepte su " + 
				"invitación");
		n11222.setTipo(n11222.PROBABILIDAD);
		n11222.agregarOpcion("Catalina acepta su invitación");
		n11222.agregarOpcion("Catalina dice que no, que mejor hacen el plan otro día.");
		n1122.addpart(n11222);
		
		//Nodo 1.1.2.2.1.1 Pedirle la cita en ese momento
		Nodo n112211 = new Nodo(6,"En ese momento Morita mira a Catalina a los ojos y le dice que pasó una " + 
				"excelente tarde a su lado. Que desea volver a salir con ella, pero no para devolverle " + 
				"un favor de amigos sino como algo más. X algo sonrojada le dice que si." + 
				"El sueño de Morita se hace realidad, por primera vez en su vida una chica aceptó su invitación.");
		n112211.setTipo(n112211.GASTO);
		n112211.agregarOpcion("ERES ES TODO UN TÍMIDO CONQUISTADOR.");
		n11221.addpart(n112211);
		
		//Nodo 1.1.2.2.1.2 Pedirle la cita al final
		Nodo n112212 = new Nodo(6,"Mientras se dirigían a la universidad, en el semáforo de carrera 13, Morita sintió que algo le cayó en el brazo. Era popó de paloma. Justo se había puesto debajo de los cables de electricidad donde las palomas se ubican siempre. Tuvo que ir corriendo a la universidad a limpiarse. A penas pudo despedirse de Catalina. Perdió la oportunidad de hacerle una nueva invitación.");
		n112212.setTipo(n112212.GASTO);
		n112212.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE.");
		n11221.addpart(n112212);
		
		//Nodo 1.1.2.2.2.1 Acepta ir a comer empanada
		Nodo n112221 = new Nodo(6,"Catalina no pone problema y se dirigen a la tienda donde venden empanaditas de mil. Se sientan a hablar. Morita disfruta muchísimo de la charla y considera que hay muy buena química entre los dos. Piden otra ronda de empanadas y esta vez le ofrecen salsa de ajo para aderezar. Morita no puede resistirse a su salsa favorita. ");
		n112221.setTipo(n112221.PROBABILIDAD);
		n112221.agregarOpcion("Morita le echa salsa de ajo a la empanada.");
		n112221.agregarOpcion("Morita decide no aderezar la empenada con salsa de ajo.");
		n11222.addpart(n112221);
		
		
		//Nodo 1.1.2.2.2.2 Espera a otro día
		Nodo n112222 = new Nodo(6,"Durante el mes, en Bogotá no dejó de llover. Morita se quedó esperando...");
		n112222.setTipo(n112222.GASTO);
		n112222.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE.");
		n11222.addpart(n112222);

		//Nodo 1.1.2.2.2.1.1 Le hecha salsa de ajo
		Nodo n1122211 = new Nodo(7,"Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Cuando llega el momento en que Catalina se acerca para darle un beso, se aleja de nuevo. Al parecer el olor de salsa de ajo no le agradó. La situación se tornó algo incómoda, por lo que terminaron la conversación, se despidieron y nada mas volvió a suceder.");
		n1122211.setTipo(n1122211.GASTO);
		n1122211.agregarOpcion("ERES UN CONQUISTADOR ALGO DESPISTADO");
		n112221.addpart(n1122211);
		
		//Nodo 1.1.2.2.2.1.2 No usa la salsa de ajo
		Nodo n1122212 = new Nodo(7, "Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Antes de despedirse, Catalina, muy sonrojada le dice a Morita que la pasó muy bien a su lado. Que desearía volver a salir con el, ya que le pareció alguien divertido. Le da un beso en la mejilla y se aleja muy apenada.");
		n1122212.setTipo(n1122212.GASTO);
		n1122212.agregarOpcion("ERES UN CONQUISTADOR CON BUENA CONVERSACIÓN");
		n112221.addpart(n1122212);
	}
	
	public  void mostrarHijos () {				
		System.out.println(nodo.operation());
	}

	public Nodo getInicio() {
		return nodo;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}

	public static void main(String args[]) {				
		Arbol arbol = new Arbol();	
		arbol.construirArbol();
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try { FrameArbol
		 * frame = new FrameArbol(arbol); frame.setVisible(true); } catch (Exception e)
		 * { e.printStackTrace(); } } });
		 */
		arbol.mostrarHijos();
		
	}
	
}
