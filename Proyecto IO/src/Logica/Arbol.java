package Logica;

import java.awt.EventQueue;

import Interfaz.FrameArbol;

public class Arbol {
	private Nodo nodo;
	private int cantidad = 0;
	

	private Nodo referencia;
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
		n1.setPuntaje(10);
		nodo.addpart(n1);
		
		//Nodo 1.1 Pedir ayuda con la tarea
		Nodo n11 = new  Nodo(2,"Ella acepta ayudarlo y Morita se sienta a su lado para que le explique lo que no entiende."
				+ " A lo lejos divisa a su grupo de amigos, espera que no se acercen  a arruinar la oportunidad.");
		n11.setTipo(n11.PROBABILIDAD);
		n11.agregarOpcion("Sus amigos  se acercan.");
		n11.agregarOpcion("Sus amigos no se acercan.");
		n1.addpart(n11);
		
		//Nodo 1.1.1 Los amigos se acercan
		Nodo n111 = new Nodo(3,"Por la puerta se acerca el grupo de IO de Morita. "
				+ "Uno de ellos le dice: 'Parce,  páseme la tarea que me dijo que ya la tenía."
				+ "La chica se voltea y mira hacia Morita con cara de enojo por haberla echo perder el tiempo, se va.");
		n111.setTipo(n111.TERMINAL);
		n111.setPuntaje(-5);
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
		n112.setTipo(n112.DECISION);
		n112.agregarOpcion("Invitarla a tomar cerveza");
		n112.agregarOpcion("Invitarla a comer bonice.");
		n11.addpart(n112);
		
		//Nodo 1.1.2.1 Invitarla a tomar una cerveza
		Nodo n1121 = new Nodo (4, "Catalina lo observa con cara extrañada y algo incómoda le responde "
				+ "que si. Parece que no le gustó mucho la idea, pero aún así acepto.");
		n1121.setTipo(n1121.DECISION);
		n1121.agregarOpcion("Percibiendo su incomodidad, le dice que le de su número de celular para "
				+ "determinar cuándo ir a tomar la cerveza, ya que ahora no es un buen momento. (Más"
				+ " adelante Morita se las arreglará para convenserla.)");
		n1121.agregarOpcion("Insistirle en ir de una vez a tomar cerveza (Puede que más adelante "
				+ "se arrepienta).");
		n112.addpart(n1121);
		
		//Nodo 1.1.2.1.1 Pedir el numero
		Nodo n11211 = new Nodo(5, "Catalina visiblemente aliviada le da su número a Morita. Se despiden,"
				+ " pero Morita está contento por haber conseguido su número, ya es un gran avance. Llega "
				+ "por la tarde a su hogar y se dispone a escribirle. ¿Cómo debería empezar la "
				+ "conversación?");
		n11211.setTipo(n11211.DECISION);
		n11211.agregarOpcion("Hola, ¿Cómo estás?");
		n11211.agregarOpcion("Hola, oye, soy Morita. ¿Cuando estarás disponible para salir?");
		
		//Nodo 1.1.2.1.1.1 Hola ¿Como estas?
		Nodo n112111 = new Nodo (6, "Ella responde: Bien y tú? Morita continúa la conversación con un "
				+ "'Bien'. Él necesita buscar la oportunidad para preguntarle cuándo pueden salir. Por "
				+ "ahora le pregunta cosas relacionadas con IO3. Cada vez ella le responde más demorada"
				+ " y Morita no es capaz de recordarle la invitación. La conversación muere.");
		n112111.setTipo(n112111.TERMINAL);
		n112111.agregarOpcion("ERES UN MATADOR CON LAS CHICAS....\n "
				+ "PERO DE CONVERSACIONES.");
		
		//Nodo 1.1.2.1.1.2 Preguntarle cuando estara disponible
		Nodo n112112 = new Nodo (6, "Catalina le responde diciendole la disponibilidad que tiene. Ahora"
				+ " es tiempo de decidir si continuar el plan de la cerveza o cambiarlo. Si continúa "
				+ "con el plan actual, tiene más posibilidades de romper el hielo, si lo cambia, podría "
				+ "agradarle más a ella, pero perdería la oportunidad de generar mayor confianza.");
		n112112.setTipo(n112112.DECISION);
		n112112.agregarOpcion("Morita seguirá con su plan inicial, el de la cerveza. La conversación "
				+ "termina con una fecha y hora definidas para reunirse.");
		n112112.agregarOpcion("Morita le sugiere que vayan por el plan del bonice. Ella acepta.");
		
		// Nodo 1.1.2.1.1.2.1 Continuar con el plan inicial de la cerveza
		Nodo n1121122 = new Nodo(7, "Morita y Catalina se dirigen a un bar cercano a la universidad. "
				+ "Cada uno pide una cerveza. Como siente que Catalina está algo incómoda por el lugar"
				+ ", ¿qué debería hacer para remediar esto?");
		n1121122.setTipo(n1121122.PROBABILIDAD);
		n1121122.agregarOpcion("Morita pide más cervezas.");
		n1121122.agregarOpcion("Morita pide jugo de mora.");
		
		//Nodo 1.1.2.1.1.2.2 Mejor ir por un bonice
		Nodo n1121121 = new Nodo(7, "A catalina le agrada la idea de ir a comer bonice, Morita espera"
				+ " que haga un buen clima, porque el bonice solo es rico cuando hace calor.");
		n1121121.setTipo(n1121121.PROBABILIDAD);
		n1121121.agregarOpcion("No llueve y hace buen clima.");
		n1121121.agregarOpcion("Cae un aguacero.");
		
		//Nodo 1.1.2.1.1.2.1.1 Hace buen clima
		Nodo n11211211 = new Nodo(8, "Morita y Catalina salen a comer bonice, tienen una buena charla y "
				+ "disfrutan el momento. Se dirigen de nuevo a la universidad, pero Morita está decidio"
				+ " a hacerle una invitación porque siente que tuvieron buena química. Si lo hace en "
				+ "ese momento, puede que no sea apropiado, pero si lo hace antes de despedirse, puede "
				+ "que se acobarde.");
		n11211211.setTipo(n11211211.DECISION);
		n11211211.agregarOpcion("Pedirle en ese momento una cita.");
		n11211211.agregarOpcion("Esperar la hora de despedirse para pedirle la cita.");
		
		//Nodo 1.1.2.1.1.2.1.2 Cae un aguacero
		Nodo n11211212 = new Nodo (8, "Al ver que llueve, Morita le propone ir a comer empanadita de "
				+ "1000, ya que no cuenta con presupuesto para invitarla para algo más caro. El espera"
				+ " que ella acepte su invitación.");
		n11211212.setTipo(n11211212.PROBABILIDAD);
		n11211212.agregarOpcion("Catalina acepta su invitación.");
		n11211212.agregarOpcion("Catalina dice que no, que mejor hacen el plan para otro día.");
		
		//Nodo 1.1.2.1.1.2.1.2.1 Catalina acepta la invitacion
		Nodo n112112121 = new Nodo(9, "Catalina no pone problema y se dirigen a la tienda donde venden "
				+ "empanaditas de mil. Se sientan a hablar. Morita disfruta muchísimo de la charla y "
				+ "considera que hay muy buena química entre los dos. Piden otra ronda de empanadas "
				+ "y esta vez le ofrecen salsa de ajo para aderezar. Morita no puede resistirse a su "
				+ "salsa favorita.");
		n112112121.setTipo(n112112121.PROBABILIDAD);
		n112112121.agregarOpcion("Morita le echa salsa de ajo a la empanada.");
		n112112121.agregarOpcion("Morita decide no aderezar la empanada con salsa de ajo.");
		
		//Nodo 1.1.2.1.1.2.1.2.1.1 Echarle salsa de ajo a la empanada
		Nodo n1121121211 = new Nodo(9, "Morita y Catalina continuan hablando y coqueteando por un rato, "
				+ "tienen una gran conexión. Cuando llega el momento en que Catalina se acerca para darle "
				+ "un beso, se aleja de nuevo. Al parecer el olor de salsa de ajo no le agradó. La "
				+ "situación se tornó algo incómoda, por lo que terminaron la conversación, se despidieron "
				+ "y nada más volvió a suceder.");
		n1121121211.setTipo(n1121121211.TERMINAL);
		n1121121211.agregarOpcion("ERES UN CONQUISTADOR ALGO DESPISTADO.");
		
		//Nodo 1.1.2.1.1.2.1.2.1.2 No usar la salsa de ajo
		Nodo n1121121212 = new Nodo(10, "Morita y Catalina continuan hablando y coqueteando por un rato, "
				+ "tienen una gran conexión. Antes de despedirse, Catalina, muy sonrojada le dice a Morita "
				+ "que la pasó muy bien a su lado. Que desearía volver a salir con el, ya que le pareció "
				+ "alguien divertido. Le da un beso en la mejilla y se aleja muy apenada.");
		n1121121212.setTipo(n1121121212.TERMINAL);
		n1121121212.agregarOpcion("ERES UN CONQUISTADOR CON BUENA CONVERSACIÓN.");
		
		//Nodo 1.1.2.1.1.2.1.2.2 Catalina dice que mejor para otro dia 
		Nodo n112112122 = new Nodo(9, "Durante el mes, en Bogotá no dejó de llover. Morita se quedó esperando...");
		n112112122.setTipo(n112112122.TERMINAL);
		n112112122.agregarOpcion("MUY DEMALAS HERMANO.");
		
		//Nodo 1.1.2.1.1.2.1.1.1 Pedirle la cita  --------------    ----------------
		Nodo n112112111 = new Nodo(9, "En ese momento Morita mira a Catalina a los ojos y le dice que pasó "
				+ "una excelente tarde a su lado. Que desea volver a salir con ella, pero no para devolverle"
				+ " un favor de amigos sino como algo más. Catalina algo sonrojada le dice que si."
				+ " El sueño de Morita se hace realidad, por primera vez en su vida una chica aceptó "
				+ "su invitación.");
		n112112111.setTipo(n112112111.TERMINAL);
		n112112111.agregarOpcion("ERES TODO UN CONQUISTADOR.");
		
		//Nodo 1.1.2.1.1.2.1.1.2 Esperar a la hora de despedida para pedirle la cita ---------  ----
		Nodo n112112112 = new Nodo(9, "Mientras se dirigían a la universidad, en el semáforo de la carrera 13,"
				+ "Morita sintió que algo le cayo en el brazo. Era popó de paloma. Justo se había puesto "
				+ "debajo de los cables de electricidad donde las palomas se ubican siempre. Tuvo que ir "
				+ "corriendo a la universidad a limpiarse. A penas pudo despedirse de Catalina. Persió la "
				+ "oportunidad de hacerle una nueva invitación.");
		n112112112.setTipo(n112112112.TERMINAL);
		n112112112.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE. ");
		
		//Nodo 1.1.2.1.1.2.2.1 Pedir más cervezas
		Nodo n11211221 = new Nodo (8, "Es la peor decisión que Morita pudo haber tomado en su vida. No"
				+ " sabía que el era muy propenso a emborracharse, por lo que a la tercera cerveza ya no "
				+ "estaba en sus cabales. Intentó acercarse a Catalina y darle un beso, por lo que ella "
				+ "inmediatamente se levantó y le pegó un puño en la cara, fue tan fuerte que incluó le"
				+ " rompió las gafas..");
		n11211221.setTipo(n11211221.TERMINAL);
		n11211221.agregarOpcion("ERES UN CONQUISTADOR QUE NO SE CONOCE A SI MISMO.");
		
		//Nodo 1.1.2.1.1.2.2.2 Pedir jugo de mora
		Nodo n11211222 = new Nodo (8, "El jugo de mora fue una buena idea. Le hizo gracia a Catalina, ya "
				+ "que Morita contó un mal chiste sobre las moras que hizo que se rompiera el hielo."
				+ " Hablaron un buen rato y volvieron a la universidad. Antes de despedirse, Catalina, "
				+ "muy sonrojada le dice a Morita que la pasó muy bien a su lado. Que desearía volver a "
				+ "salir con el, ya que le pareció alguien divertido. Le da un beso en la mejilla y se "
				+ "aleja muy apenada.");
		n11211222.setTipo(n11211222.TERMINAL);
		n11211222.agregarOpcion("ERES UN CONQUISTADOR CON MALOS CHISTES PERO UNA BUENA CONVERSACIÓN.");
		
		//Nodo 1.1.2.1.2 Insistir en ir a tomar la cerveza
		Nodo n11212 = new Nodo (5, "Morita y Catalina se dirigen a un bar cercano a la universidad. "
				+ "Cada uno pide una cerveza. Como siente que Catalina está algo incómoda por el lugar "
				+ ", ¿qué debería hacer para remediar eso?");
		n11212.setTipo(n11212.PROBABILIDAD);
		n11212.agregarOpcion("Morita pide más cervezas.");
		n11212.agregarOpcion("Morita pide juguito de mora.");
		
		//Nodo 1.1.2.1.2.1 Pedir más cervezas
		Nodo n112121 = new Nodo (6, "Es la peor decisión que Morita pudo haber tomado en su vida. "
				+ "No sabía que el era muy propenso a emborracharse, por lo que a la tercera cerveza "
				+ "ya no estaba en sus cabales. Intentó acercarse a Catalina y darle un beso, por lo "
				+ "que ella inmediatamente se levantó y le pegó un puño en la cara, fue tan fuerte"
				+ "que incluso le rompió las gafas.");
		n112121.setTipo(n112121.TERMINAL);
		n112121.agregarOpcion("ERES UN CONQUISTADOR QUE NO SE CONOCE A SI MISMO.");
		
		//Nodo 1.1.2.1.2.2 Pedir jugo de mora.
		Nodo n112122 = new Nodo(6, "El jugo de mora fue una buena idea. Le hizo gracia a Catalina, ya que "
				+ "Morita contó un mal chiste sobre las moras que hizo que se rompiera el hielo. "
				+ "Hablaron un buen rato y volvieron a la universidad. Antes de despedirse, Catalina, "
				+ "muy sonrojada le dice a Morita que la pasó muy bien a su lado. Que desearía volver "
				+ "a salir con el, ya que le pareció alguien divertido. Le da un beso en la mejilla y "
				+ "se aleja muy apenada.");
		n112122.setTipo(n112122.TERMINAL);
		n112122.agregarOpcion("ERES UN CONQUISTADOR CON MALOS CHISTES PERO BUENA CONVERSACIÓN.");
		
		
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
		Nodo n11222 = new Nodo(5, "Al ver que llueve, Morita le propone ir a comer empanadita de 1000, ya que no cuenta con presupuesto para invitarla para algo mas caro. El espera que ella acepte su invitación");
		n11222.setTipo(n11222.PROBABILIDAD);
		n11222.agregarOpcion("Catalina acepta su invitación");
		n11222.agregarOpcion("Catalina dice que no, que mejor hacen el plan otro día.");
		n1122.addpart(n11222);
		
		//Nodo 1.1.2.2.1.1 Pedirle la cita en ese momento
		Nodo n112211 = new Nodo(6,"En ese momento Morita mira a Catalina a los ojos y le dice que pasó una " + 
				"excelente tarde a su lado. Que desea volver a salir con ella, pero no para devolverle " + 
				"un favor de amigos sino como algo más. X algo sonrojada le dice que si." + 
				"El sueño de Morita se hace realidad, por primera vez en su vida una chica aceptó su invitación.");
		n112211.setTipo(n112211.TERMINAL);
		n112211.agregarOpcion("ERES ES TODO UN TÍMIDO CONQUISTADOR.");
		n11221.addpart(n112211);
		
		//Nodo 1.1.2.2.1.2 Pedirle la cita al final
		Nodo n112212 = new Nodo(6,"Mientras se dirigían a la universidad, en el semáforo de carrera 13, Morita sintió que algo le cayó en el brazo. Era popó de paloma. Justo se había puesto debajo de los cables de electricidad donde las palomas se ubican siempre. Tuvo que ir corriendo a la universidad a limpiarse. A penas pudo despedirse de Catalina. Perdió la oportunidad de hacerle una nueva invitación.");
		n112212.setTipo(n112212.TERMINAL);
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
		n112222.setTipo(n112222.TERMINAL);
		n112222.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE.");
		n11222.addpart(n112222);

		//Nodo 1.1.2.2.2.1.1 Le hecha salsa de ajo
		Nodo n1122211 = new Nodo(7,"Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Cuando llega el momento en que Catalina se acerca para darle un beso, se aleja de nuevo. Al parecer el olor de salsa de ajo no le agradó. La situación se tornó algo incómoda, por lo que terminaron la conversación, se despidieron y nada mas volvió a suceder.");
		n1122211.setTipo(n1122211.TERMINAL);
		n1122211.agregarOpcion("ERES UN CONQUISTADOR ALGO DESPISTADO");
		n112221.addpart(n1122211);
		
		//Nodo 1.1.2.2.2.1.2 No usa la salsa de ajo
		Nodo n1122212 = new Nodo(7, "Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Antes de despedirse, Catalina, muy sonrojada le dice a Morita que la pasó muy bien a su lado. Que desearía volver a salir con el, ya que le pareció alguien divertido. Le da un beso en la mejilla y se aleja muy apenada.");
		n1122212.setTipo(n1122212.TERMINAL);
		n1122212.agregarOpcion("ERES UN CONQUISTADOR CON BUENA CONVERSACIÓN");
		n112221.addpart(n1122212);
		
		//Nodo 1.2 Ofrecer ayuda con la tarea
		Nodo n12 = new Nodo(2, "Ella acepta ser ayudada. Al parecer tenía problemas en resolver el"
				+ " problema. Morita se toma su tiempo para explicarle el ejercicio y que pueda "
				+ "terminarlo. Finalmente llega la hora de que empiece la clase, por lo que aprovecha"
				+ " y le pregunta su nombrem a lo que ella responde: 'X'. Esperemos que la ayuda haya"
				+ " sido suficiente para causar reacción en ella.");
		n12.setTipo(n12.PROBABILIDAD);
		n12.agregarOpcion("X Le agradece.");
		n12.agregarOpcion("X le agradece y le promete invitarle a algo por su ayuda.");
		
		//Nodo 1.2.1 Catalina le agradece y ya
		Nodo n121 = new Nodo (3, "Y esa fue la única y última vez que Morita habló con X.");
		n121.setTipo(n121.TERMINAL);
		n121.agregarOpcion("SER AMABLE NO SIEMPRE ES SUFICIENTE.");
		
		//Nodo 1.2.2 Le agradece y le invita a algo
		Nodo n122 = new Nodo (3, "Morita se sorprende de la facilidad con la que consiguió aquella"
				+ " reacción en X. Intercambian números para determinar cuando se reunirán. Habrá "
				+ "que andar con cuidado ya que todo está saliendo muy bien. Ya en su hogar, Morita"
				+ " debe decidir si iniciar la conversación o no.");
		n122.setTipo(n122.DECISION);
		n122.agregarOpcion("Morita decide escribirle primero.");
		n122.agregarOpcion("Morita esperará hasta que ella se comunique.");
		
		//Nodo 1.2.2.1 Escribirle primero
		Nodo n1221 = new Nodo (4, "Morita prefiere no arriesgarse y da la iniciativa para iniciar "
				+ "la conversación. X responde rápidamente y finalmente ella le dice donde se "
				+ "pueden reunir, para gastarle algo de comer. Ahora él debe decidir entre las "
				+ "opciones que ella le dió.");
		n1221.setTipo(n1221.DECISION);
		n1221.agregarOpcion("Ir a comer empanadita de 1000.");
		n1221.agregarOpcion("Ir a comer helado.");
		
		//Nodo 1.2.2.1.1 Empanada de mil
		Nodo n12211 = new Nodo (5, "X no pone problema y se dirigen a la tienda donde venden "
				+ "empanaditas de mil. Se sientan a hablar. Morita disfruta muchísimo de la charla "
				+ "y considera que hay muy buena química entre los dos. Piden otra ronda de empanadas "
				+ "y esta vez le ofrecen salsa de ajo para aderezar. Morita no puede resistirse a "
				+ "su salsa favorita.");
		n12211.setTipo(n12211.PROBABILIDAD);
		n12211.agregarOpcion("Morita le hecha salsa de ajo a la empanada.");
		n12211.agregarOpcion("Morita decide no aderezar la empanada con salsa de ajo.");
		
		//Nodo 1.2.2.1.1.1 Usar salsa de ajo
		Nodo n122111 = new Nodo (6, "Morita y X continuan hablando y coqueteando por un rato, "
				+ "tienen una gran conexión. Cuando llega el momento en que X se acerca para darle "
				+ "un beso, se aleja de nuevo. Al parecer el olor de salsa de ajo no le agradó. La "
				+ "situación se tornó algo incómoda, por lo que terminaron la conversación, se "
				+ "despidieron y nada más volvio a suceder.");
		n122111.setTipo(n122111.TERMINAL);
		n122111.agregarOpcion("ERES UN CONQUISTADOR ALGO DESPISTADO");
		
		//Nodo 1.2.2.1.1.2 No usar salsa de ajo
		Nodo n122112 = new Nodo (6	, "Morita y X continuan hablando y coqueteando por un rato, tienen"
				+ " una gran conexión. Antes de despedirse, X muy sonrojada le dice a Morita "
				+ "que la pasó muy bien a su lado. Que desearía volver a salir con el, ya que le "
				+ "pareció alguien divertido. Le da un beso en la mejilla y se aleja apenada. ");
		n122112.setTipo(n122112.TERMINAL);
		n122112.agregarOpcion("ERES UN CONQUISTADOR CON BUENA CONVERSACIÓN.");
		
		//Nodo 1.2.2.2 Esperar a que ella se comunique
		Nodo n1222 = new Nodo (4, "ESPERÓ, ESPERÓ Y SE QUEDO ESPERANDO ....");
		n1222.setTipo(n1222.TERMINAL);
		
		//Nodo 1.2.2.1.2 Ir a comer helado
		Nodo n12212 = new Nodo (5, "Llegó el día esperado. Le pareció verla radiante ese día, no "
				+ "podía creer que todo esto estuviera pasando. Se dirigieron al Creps and Waffles"
				+ " de la plaza de la 39, en el camino tuvieron una buena charla. Morita siente que "
				+ " hay una gran química entre los dos, esta es la oportunidad que estaba esperando. "
				+ "A pesar de ser ella la que invitó, Morita tiene la posibilidad de pagar por "
				+ "el helado, eso lo haría quedar bien y daría otra oportunidad para que se "
				+ "reúnan.");
		n12212.setTipo(n12212.DECISION);
		n12212.agregarOpcion("Morita se adelanta a X y paga los helados.");
		n12212.agregarOpcion("Morita permite que X pague los helados.");
		
		//Nodo 1.2.2.1.2.1 Pagar los helados primero
		Nodo n122121 = new Nodo(6, "X le mira agradecida y se sientan a comer el helado. Cada vez "
				+ "la charla se hace más interesante y Morita siente que es un buen momento para "
				+ "ser sincero con sus sentimientos. ¿Cómo debería demostrarlos?");
		n122121.setTipo(n122121.PROBABILIDAD);
		n122121.agregarOpcion("Acercarse e intentar darle un beso.");
		n122121.agregarOpcion("Decirle: 'Oye, me gustas'.");
		
		//Nodo 1.2.2.1.2.1.1 Intentar darle un beso
		Nodo n1221211 = new Nodo (7, "Morita se acerca cada vez más, e intenta darle un beso, ella"
				+ " lo detiene en seco y le dice: 'Oye, no te confundas, tengo novio'. ");
		n1221211.setTipo(n1221211.TERMINAL);
		n1221211.agregarOpcion("FRIENZONEADO PAPÁ");
		
		//Nodo 1.2.2.1.2.1.2 Decirle que le gusta
		Nodo n1221212 = new Nodo (7, "Morita dice estas palabras y el momento se vuelve inmediatamente"
				+ " incómodo. Ella algo apenada le dice: 'Lo siento, pero tengo novio'.");
		n1221212.setTipo(n1221212.TERMINAL);
		n1221212.agregarOpcion("FRIENZONEADO (muy afanado pues mijo)");
		
		//Nodo 1.2.2.1.2.2 Dejar que ella pague los helados
		Nodo n122122 = new Nodo (6, "Ambos se sientan a comer helado. Cada vez la charla se hace "
				+ "más interesante y Morita siente que es un buen momento para ser sincero con sus "
				+ "sentimientos, ¿Se arriesgará?");
		n122122.setTipo(n122122.DECISION);
		n122122.agregarOpcion("Decirle: 'Oye, me gustas'.");
		n122122.agregarOpcion("No decirle nada.");
		
		//Nodo 1.2.2.1.2.2.1 Decirle que le gusta
		Nodo n1221221 = new Nodo (7, "Morita dice estas palabras y el momento se vuelve inmediatamente "
				+ "incómodo. Ella algo apenada le dice: 'Lo siento, pero tengo novio'.");
		n1221221.setTipo(n1221221.TERMINAL);
		n1221221.agregarOpcion("FRIENZONEADO (muy afanado pues mijo).");
		
		//Nodo 1.2.2.1.2.2.2 No decirle nada
		Nodo n1221222= new Nodo (7, "Estuvieron hablando por un buen rato hasta que terminaron el helado"
				+ ". Ella se despidió y se fue. Morita no fue capaz de invitarla a salir de nuevo. El "
				+ "tiempo pasó y X se volvió una simple conocida. ");
		n1221222.setTipo(n1221222.TERMINAL);
		n1221222.agregarOpcion("USTED NO APRENDER VERDAD.");
		
		n112112121.addpart(n1121121211);
		n112112121.addpart(n1121121212);
		
		n11211212.addpart(n1121121212);
		n11211212.addpart(n1121121212);
		
		n11211211.addpart(n112112111);
		n11211211.addpart(n112112112);
		
		n1121121.addpart(n11211211);
		n1121121.addpart(n11211212);
		
		n1121122.addpart(n11211221);
		n1121122.addpart(n11211222);
		
		n112112.addpart(n1121121);
		n112112.addpart(n1121122);
		
		n11211.addpart(n112111);
		n11211.addpart(n112112);
		
		n11212.addpart(n112121);
		n11212.addpart(n112122);
		
		n1121.addpart(n11211);
		n1121.addpart(n11212);
		
		
		n112221.addpart(n1122211);
		n112221.addpart(n1122212);
		
		n11222.addpart(n112221);
		n11222.addpart(n112222);
		
		n11221.addpart(n112211);
		n11221.addpart(n112212);
		
		n1122.addpart(n11221);
		n1122.addpart(n11222);
		
		n112.addpart(n1121);
		n112.addpart(n1122);
		
		n11.addpart(n111);
		n11.addpart(n112);
		
		
		n122121.addpart(n1221211);
		n122121.addpart(n1221212);
		
		n122122.addpart(n1221221);
		n122122.addpart(n1221222);
		
		n12212.addpart(n122121);
		n12212.addpart(n122122);
		
		n12211.addpart(n122111);
		n12211.addpart(n122112);
		
		n1221.addpart(n12211);
		n1221.addpart(n12212);
		
		n122.addpart(n1221);
		n122.addpart(n1222);
		
		n12.addpart(n121);
		n12.addpart(n122);
		
		n1.addpart(n11);
		n1.addpart(n12);
		
		nodo.addpart(n1);
	}
	
	public void agregarNodo(Nodo nodo) {
		referencia.addpart(nodo);
		cantidad++;
		if(this.nodo==null) {
			this.nodo=referencia;
		}
		referencia = (Nodo) referencia.getSiguiente();

	}
	public Arbol() {
		construirArbol();
		referencia = nodo;
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
	
	public void vaciar() {
		nodo = null;
	}

	public Nodo getReferencia() {
		return referencia;
	}

	public void setReferencia(Nodo nodo2) {
		this.referencia = nodo2;
	}

	public Nodo getNodo() {
		return nodo;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
