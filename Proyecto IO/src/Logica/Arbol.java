package Logica;

import java.awt.EventQueue;

import Interfaz.FrameArbol;

public class Arbol {
	private Nodo nodo;
	private int cantidad = 0;
	

	private Nodo referencia;
	public void construirArbol() {
		
			//Nodo 0
		nodo = new Nodo(0," Es la 1:30 de la tarde, se acerca la clase de IO3 morita está bajando "
				+ "por la caracola del sabio caldas, se puede percatar que hay dos chicas lindas "
				+ "que están riendo en una esquina, Morita piensa que podría hablarles y aplicar todo lo aprendido, "
				+ "pero también podría ir a clase y hablar con la chica que le gusta desde hace tanto: ¿qué debería hacer?");
		nodo.setTipo(nodo.DECISION);
		nodo.agregarOpcion("Ir a clase de IO3");
		nodo.agregarOpcion("Hablar con las chicas");
		
		//Inicio Historia de Tefa
		Nodo n = new Nodo(0,"Morita ya se propuso "
				+ "a conquistar aquella chica solitaria, tímida y misteriosa que siempre le dió curiosidad. "
				+ "Necesita buscar una excusa para iniciar una conversación ¿Qué hará?");
		n.setTipo(nodo.DECISION);
		n.agregarOpcion("Preguntarle por la tarea que hay para la clase.");
		
		//Nodo 1 Acercarse a la chica para saber que hacer
		Nodo n1 = new Nodo(1,"Morita se acerca a la chica y le pregunta qué había para hoy. "
				+ "Ella se voltea hacia él y le dice que hoy es	la entrega del ejercicio de árboles de decisión"
				+ " ¿Cómo puede Morita continuar la conversación?");
		n1.setTipo(n1.DECISION);
		n1.agregarOpcion("Pedirle ayuda con la tarea (aunque ya la tienes hecha)");
		n1.agregarOpcion("Ofrecerle ayuda con la tarea");
		n1.setPuntaje(10);
		
		
		//Nodo 1.1 Pedir ayuda con la tarea
		Nodo n11 = new  Nodo(2,"Ella acepta ayudarlo y Morita se sienta a su lado para que le explique lo que no entiende."
				+ " A lo lejos divisa a su grupo de amigos, espera que no se acercen  a arruinar la oportunidad.");
		n11.setTipo(n11.PROBABILIDAD);
		n11.agregarOpcion("Sus amigos  se acercan.");
		n11.agregarOpcion("Sus amigos no se acercan.");
		
		
		//Nodo 1.1.1 Los amigos se acercan
		Nodo n111 = new Nodo(3,"Por la puerta se acerca el grupo de IO de Morita. "
				+ "Uno de ellos le dice: 'Parce,  páseme la tarea que me dijo que ya la tenía."
				+ "La chica se voltea y mira hacia Morita con cara de enojo por haberla echo perder el tiempo, se va.");
		n111.setTipo(n111.TERMINAL);
		n111.setPuntaje(-5);
		
		
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
		
		
		//Nodo 1.1.2.1 Invitarla a tomar una cerveza
		Nodo n1121 = new Nodo (4, "Catalina lo observa con cara extrañada y algo incómoda le responde "
				+ "que si. Parece que no le gustó mucho la idea, pero aún así acepto.");
		n1121.setTipo(n1121.DECISION);
		n1121.agregarOpcion("Percibiendo su incomodidad, le dice que le de su número de celular para "
				+ "determinar cuándo ir a tomar la cerveza, ya que ahora no es un buen momento. (Más"
				+ " adelante Morita se las arreglará para convenserla.)");
		n1121.agregarOpcion("Insistirle en ir de una vez a tomar cerveza (Puede que más adelante "
				+ "se arrepienta).");
		
		
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
		
		
		
		//Nodo 1.1.2.2.1 No llueve
		Nodo n11221 = new Nodo(5,"Morita y Catalina salen a comer bonice, tienen una buena charla y disfrutan el momento." + 
				"Se dirigen de nuevo a la universidad, pero Morita está decidido a hacerle una invitación " + 
				"porque siente que tuvieron buena química. Si lo hace en ese momento, puede que no sea " + 
				"apropiado, pero si lo hace antes de despedirse, puede que se acobarde");
		n11221.setTipo(n11221.DECISION);
		n11221.agregarOpcion("Pedirle en ese momento una cita.");
		n11221.agregarOpcion("Esperar a la hora de despedirse para pedirle la cita.");
		
		
		//Nodo 1.1.2.2.2 Llueve
		Nodo n11222 = new Nodo(5, "Al ver que llueve, Morita le propone ir a comer empanadita de 1000, ya que no cuenta con presupuesto para invitarla para algo mas caro. El espera que ella acepte su invitación");
		n11222.setTipo(n11222.PROBABILIDAD);
		n11222.agregarOpcion("Catalina acepta su invitación");
		n11222.agregarOpcion("Catalina dice que no, que mejor hacen el plan otro día.");
		
		
		//Nodo 1.1.2.2.1.1 Pedirle la cita en ese momento
		Nodo n112211 = new Nodo(6,"En ese momento Morita mira a Catalina a los ojos y le dice que pasó una " + 
				"excelente tarde a su lado. Que desea volver a salir con ella, pero no para devolverle " + 
				"un favor de amigos sino como algo más. X algo sonrojada le dice que si." + 
				"El sueño de Morita se hace realidad, por primera vez en su vida una chica aceptó su invitación.");
		n112211.setTipo(n112211.TERMINAL);
		n112211.agregarOpcion("ERES ES TODO UN TÍMIDO CONQUISTADOR.");
		
		
		//Nodo 1.1.2.2.1.2 Pedirle la cita al final
		Nodo n112212 = new Nodo(6,"Mientras se dirigían a la universidad, en el semáforo de carrera 13, Morita sintió que algo le cayó en el brazo. Era popó de paloma. Justo se había puesto debajo de los cables de electricidad donde las palomas se ubican siempre. Tuvo que ir corriendo a la universidad a limpiarse. A penas pudo despedirse de Catalina. Perdió la oportunidad de hacerle una nueva invitación.");
		n112212.setTipo(n112212.TERMINAL);
		n112212.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE.");
		
		
		//Nodo 1.1.2.2.2.1 Acepta ir a comer empanada
		Nodo n112221 = new Nodo(6,"Catalina no pone problema y se dirigen a la tienda donde venden empanaditas de mil. Se sientan a hablar. Morita disfruta muchísimo de la charla y considera que hay muy buena química entre los dos. Piden otra ronda de empanadas y esta vez le ofrecen salsa de ajo para aderezar. Morita no puede resistirse a su salsa favorita. ");
		n112221.setTipo(n112221.PROBABILIDAD);
		n112221.agregarOpcion("Morita le echa salsa de ajo a la empanada.");
		n112221.agregarOpcion("Morita decide no aderezar la empenada con salsa de ajo.");
		
		
		
		//Nodo 1.1.2.2.2.2 Espera a otro día
		Nodo n112222 = new Nodo(6,"Durante el mes, en Bogotá no dejó de llover. Morita se quedó esperando...");
		n112222.setTipo(n112222.TERMINAL);
		n112222.agregarOpcion("ERES UN CONQUISTADOR CON MUY MALA SUERTE.");
		

		//Nodo 1.1.2.2.2.1.1 Le hecha salsa de ajo
		Nodo n1122211 = new Nodo(7,"Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Cuando llega el momento en que Catalina se acerca para darle un beso, se aleja de nuevo. Al parecer el olor de salsa de ajo no le agradó. La situación se tornó algo incómoda, por lo que terminaron la conversación, se despidieron y nada mas volvió a suceder.");
		n1122211.setTipo(n1122211.TERMINAL);
		n1122211.agregarOpcion("ERES UN CONQUISTADOR ALGO DESPISTADO");
		
		
		//Nodo 1.1.2.2.2.1.2 No usa la salsa de ajo
		Nodo n1122212 = new Nodo(7, "Morita y Catalina continuan hablando y coqueteando por un rato, tienen una gran conexión. Antes de despedirse, Catalina, muy sonrojada le dice a Morita que la pasó muy bien a su lado. Que desearía volver a salir con el, ya que le pareció alguien divertido. Le da un beso en la mejilla y se aleja muy apenada.");
		n1122212.setTipo(n1122212.TERMINAL);
		n1122212.agregarOpcion("ERES UN CONQUISTADOR CON BUENA CONVERSACIÓN");
		
		
		//Nodo 1.2 Ofrecer ayuda con la tarea
		Nodo n12 = new Nodo(2, "Ella acepta ser ayudada. Al parecer tenía problemas en resolver el"
				+ " problema. Morita se toma su tiempo para explicarle el ejercicio y que pueda "
				+ "terminarlo. Finalmente llega la hora de que empiece la clase, por lo que aprovecha"
				+ " y le pregunta su nombre a lo que ella responde: Catalina. Esperemos que la ayuda haya"
				+ " sido suficiente para causar reacción en ella.");
		n12.setTipo(n12.PROBABILIDAD);
		n12.agregarOpcion("Catalina Le agradece.");
		n12.agregarOpcion("Catalina le agradece y le promete invitarle a algo por su ayuda.");
		
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
		n1221222.agregarOpcion("USTED NO APRENDE, ¿VERDAD?.");
		
		//Inicio historia de Camilo
		Nodo n0 = new Nodo(0,"En ese momento Morita se da cuenta que una de las chicas se queda mirandolo fijamente, ¿qué debería hacer?");
		n0.setTipo(n0.DECISION);
		n0.agregarOpcion("Ir directamente a hablarle y pedirle ayuda con su investigación.");
		n0.agregarOpcion("Ir a casa a preparar una conversación para hablar en otra ocasión con ella");
		
		//Nodo 2.1 Le hablas a la chica
		Nodo n21 = new Nodo(2,"La chica le pregunta cuál investigación, a lo que morita responde que su investigación ayudara a muchos chicos en la 40,"
				+ " pero como tal ya está en la fase experimental y quiere que ella haga parte de ese experimento, "
				+ "si él la hace reír, ella tendría que salir con él. "
				+ "Ella se ríe y accede a salir con él. ¿qué debe hacer ahora?");
		n21.setTipo(n21.DECISION);
		n21.agregarOpcion("Decirle que se vean el viernes a la salida en creps and waffles para comer un helado");
		n21.agregarOpcion("Pedirle el número para por medio de un mensaje o llamada le diga cuándo salir");
		
		//Nodo 2.1.1 Ella accede salir con él
		Nodo n211 = new Nodo(3,"Ella acepta verse ese día con él, sin necesidad de hablar por redes sociales, parece que le gusta más la idea de conocerse a la antigua, pero Morita se percató de una cosa, nunca le pregunto cómo se llamaba y le daba muchísima pena preguntarle su nombre en la cita, tendrá que hacer de alguna forma ella diga su nombre sin que parezca grosero, ya que no sabe si ella ya se lo había dicho antes.\n" + 
				"El viernes, Morita está muy nervioso no sabe de qué hablar y tiene miedo de que ella no aparezca, quiere impresionarla así que:");
		n211.setTipo(n211.DECISION);
		n211.agregarOpcion("Morita decide ir bien arreglado pero sin mucho formalismo");
		n211.agregarOpcion("Morita decide ir en traje de gala y de paso le compra rosas");
		
		//Nodo 2.1.2 Elle le da su número de celular
		Nodo n212 = new Nodo(3, "La conversación fluye y Morita aprovecha para pedirle el número a la chica que tanto le llamo la atención. Ella acepta con una sonrisa, luego de darle su número, se despiden con un beso en la mejilla.\n" + 
				"Morita está muy feliz, orgulloso y demasiado emocionado por escribirle, tiene que pensar muy bien que decirle, no quiere que ella piense que está desesperado.\n" + 
				"");
		n212.setTipo(n212.DECISION);
		n212.agregarOpcion("Escribirle de una vez.");
		n212.agregarOpcion("Decide no escribirle por ahora, piensa que lo mejor es hacerse el interesante y deja pasar algunos días.");
		
		//Nodo 2.1.1.1 Decide ir formal
		Nodo n2111 = new Nodo(4,"Pasada media hora de donde habían quedado donde verse, se percata que la chica no llega, a lo cual morita se desanima, ya que piensa que no va a llegar, pero al  menos no gató dinero\n" + 
				"Cuando está a punto de irse la chica llega con una cara de pena por el tiempo de retraso, le explico que estaba en clase y se quedó hablando con su amiga. Él sonríe y le dice que no hay problema,"
				+ " que pensaba que no iba a venir, pero ya he le había hecho tarde para irse, (debe ir a recoger a su hermana al colegio), así que no sabe qué hacer.\n" + 
				"");
		n2111.setTipo(n2111.DECISION);
		n2111.agregarOpcion("Quedarse en la heladería y salir como estaba planeado para conocerse");
		n2111.agregarOpcion("Aplazar la cita ya que debe recoger a su hermana");
		
		
		//Nodo 2.1.1.2 Decide irse elegante
		Nodo n2112 = new Nodo(4,"La chica piensa que está desesperado por ella, viendo que le trajo rosas, pero también piensa que es tierno su gesto. Aun así se le hace muy refinado el hecho de ir en traje de gala,"
				+ " la idea era comer helado, a lo que ella le dice que está ocupada que si pueden salir otro día.");
		n2112.setTipo(n2112.DECISION);
		n2112.agregarOpcion("Insistirle en salir en ese momento");
		n2112.agregarOpcion("Aceptar verse otro día");
		
		//Nodo 2.1.2.1 Decide hablarle de una vez
		Nodo n2121 = new Nodo(4,"Daniela piensa que está desesperado por ella por ende no le responde de una,"
				+ " lo deja esperando varios días, él por su lado se desanima,"
				+ " ya que al pasar varios días piensa que ella no está interesado por él,"
				+ " así que decide borrar su número, y no volverle a hablar, sabe que ser rechazado no es malo como lo decía en el libro,"
				+ " \"cada rechazo es una oportunidad de aprender a mejorar en cómo no hacerlo\"");
		n2121.setTipo(n2121.TERMINAL);
		n2121.agregarOpcion("Eres un coquistador muy intenso.");
		
		//Nodo 2.1.2.2 Decide dejar pasar unos días
		Nodo n2122 = new Nodo(4,"Han pasado 4 días desde aquella conversación, eran las 2:30 de la tarde y envía un Hola. Ella no está en línea pero Morita no puede despegar los ojos de su conversación. Pasan dos horas desde ese mensaje, por la cabeza de Morita pasan mil cosas, quizá lo vio pero no le interesa responderle, quizá le dio un numero equivocado, quizá lo anoto mal…\n" + 
				"Y cuando menos lo espera, su celular suena. Dejo pasar 10 minutos y respondió, la conversación fue lenta pero siempre hubo interés de parte y parte. Pasaron algunos días de conversaciones largas por Whatsapp hasta la madrugada, así que Morita decide:\n" + 
				"");
		n2122.setTipo(n2122.DECISION);
		n2122.agregarOpcion("Invitarla a salir.");
		n2122.agregarOpcion("Pedirle ser su novia.");
		
		
		//Nodo 2.1.1.1.1 Decide no ir por su hermana
		Nodo n21111 = new Nodo(5,"Cada uno compra su helado, aunque el preferia gastarle para hacerse pasar por caballero\n" + 
				"en la cita ella le pregunta el nombre de el, a lo cual el se relaja ya que no se le habia ocurrido nada aun de como preguntarle\n" + 
				"el nombre a ella, El le responde: -Morita ¿Y tú?, Ella le responde que se llama Daniela.\n" + 
				"Pasaron los minutos volando a lo cual morita llama a su mama para decirle que no puede recoger a su hermana,\n" + 
				"la madre le dice que bueno, que ella va por ella. A lo cual se relaja por su hermana y puede disfrutar mas la cita con Daniela.\n" + 
				"El aplica conceptos del libro donde sabe que en la primera cita poner un tema de conversacion y que ella hable,\n" + 
				"la idea es que sienta que uno la esta escuchando para asi poder dar una segunda cita, si ella se interesa en el\n" + 
				"en la segunda si podes preguntar cosas mas de su vida y en esa si darse a conocer, asi que en toda la cita, hablan\n" + 
				"de historias, amores, cosas de terror algo distinto a una cita, al finalizar la cita el decide:\n" + 
				"1.1.1.1.1 Acompañarla hasta que llegue a la casa para asegurarse que llegue bien\n" + 
				"1.1.1.1.2 Acompañarla al transporte que ella coja y decirle que espera verse en otra ocasion");
		n21111.setTipo(n21111.DECISION);
		n21111.agregarOpcion("Acompañarla hasta que llegue a la casa para asegurarse que llegue bien.");
		n21111.agregarOpcion("Acompañarla al transporte que ella coja y decirle que espera verse en otra ocasión.");
		
		//Nodo 2.1.1.1.2 Decide cancelar la cita
		Nodo n21112 = new Nodo(5,"Daniela acepta y deciden verse al otro día, en lo cual ambos estaban vestido informalmente, esta vez no fueron a comer helado fueron a escuchar cuenteros, en la tarde ambos la pasan súper bien, Daniela se sintió bien al estar con él, morita la invita a caminar un rato para conocerse en el trayecto él le pregunta que si tiene  novio,\n" + 
				"Ella dice que no, que hace poco salió de una relación y decidió no volver a tener novio por el momento\n" + 
				"Morita se desanima por lo último pero también se da alientos para intentarlo, así que morita decide:\n" + 
				"");
		n21112.setTipo(n21112.DECISION);
		n21112.agregarOpcion("Ser solamente amigos.");
		n21112.agregarOpcion("Intentar conquistarla.");
		
		//Nodo 2.1.1.2.1 Insiste en salir
		Nodo n21121 = new Nodo(5, "Él le dice que no hay problema, que salgan así, que la idea es que quiere mostrarle lo caballero que puede ser,"
				+ " ella admite que le da mucha pena ya que ella no esa vestida o igual para una ocasión así,"
				+ " él sonríe y le dice que no hay problema, que pensaba que no iba a venir pero analizando la situación es mejor divertirse,"
				+ " aunque ya se le hizo tarde para irse, "
				+ "(debe ir a recoger a su hermana al colegio), así que no sabe qué hacer, el decide:");
		n21121.setTipo(n21121.DECISION);
		n21121.agregarOpcion("Quedarse en la heladería y salir como estaba planeado para conocerse");
		n21121.agregarOpcion("Aplazar la cita ya que debe recoger a su hermana");
		
		//Nodo 2.1.1.2.2 Morita se enoja
		Nodo n21122 = new Nodo(5,"Morita acepto verse otro dia, pero le parecio una falta de respeto que ese dia no salierran\n" + 
				"ya que el se vistio asi para ella, por ende decide no volverse a ver con la chica, ya que sabe que\n" + 
				"no lo valorara, y morita debe hacerse valorar");
		n21122.setTipo(n21122.TERMINAL);
		n21122.agregarOpcion("ERES UN CONQUISTADOR MUUY ORGULLOSO.");
		
		
		
		
		//Nodo 2.1.2.2.1 invitarla a salir
		Nodo n21221 = new Nodo(5,"Le pregunto una tarde por sus planes de ese día, ella estaba libre, así que sin más temor Morita la invito a un café luego de la clase, ella acepto.\n" + 
				"Se vieron a las 5:30 en un café cerca de la universidad, la conversación fluyo, todo fue risas hasta que se hicieron las 10 de la noche.\n" + 
				"Morita acompaño a la chica a tomar el transporte, en el momento de despedirse, estaba muy nervioso, no sabía si sería atrevido darle un beso en la primera cita. \n" + 
				"Decidió no hacerlo, pero para su sorpresa ella lo hizo, un beso rápido y se fue.\n" + 
				"");
		n21221.setTipo(n21221.TERMINAL);
		n21221.agregarOpcion("ERES UN CONQUISTADOR MUY EFICIENTE");
		
		
		//NOdo 2.1.2.2.2 Pedirle ser su novia
		Nodo n21222 = new Nodo(5,"Daniela le dice que no, ya que no se conocen y que le parece que es muy rápido,"
				+ " morita se decepciona ya que no era la respuesta que esperaba así que morita decide:");
		n21222.setTipo(n21222.DECISION);
		n21222.agregarOpcion("Pedirle disculpas y dejarle de hablar por un tiempo");
		n21222.agregarOpcion("Decirle que eso se puede arreglar, entonces la invita a salir a un bar");
		
			
		
		//Nodo 2.2 ERES UN COBARDe
		Nodo n22 = new Nodo(2,"No volvió a ver a la chica sino una semana después, tomada de la mano de un chico joven,"
				+ " se sintió decepcionado, pero se alegró de no ser rechazado.");
		n22.setTipo(n22.TERMINAL);
		n22.agregarOpcion("En verdad eres muy cobarde.");
		
		
		//Nodo 2.1.1.1.1.1 Acompañarla a casa
		Nodo n211111 = new Nodo(6,"Al ir a la casa, se conocen más y morita se siente bien con la chica, ambos empiezan a sentir un gusto mutuo se dan la oportunidad de compartir sus sueños y ambos le queda gustando.\n" + 
				"Antes de irse él le pide su número, para seguir en contacto. A lo que ella acepta y parece que continuaran saliendo\n" + 
				"Él toma la decisión de:\n" + 
				"");
		n211111.setTipo(n211111.DECISION);
		n211111.agregarOpcion("Hablarle de una vez");
		n211111.agregarOpcion("Esperar unos días y hablarle");
		
		//Nodo 2.1.1.1.1.2 Acompañarla a coger bus
		Nodo n211112 = new Nodo(6,"Morita sintió que la pasaron  bien y que se gustaron, ahora debe seguir haciéndolo, "
				+ "pero al ella irse nunca supo cómo hablarle, así que la buscaba en la universidad."
				+ " Pasaron semanas y no se volvieron a ver, para cuando se toparon, fue el subiendo al quinto piso y ella saliendo del baño,"
				+ " él con la pena de que jamás se volvieron a hablar, no sabía que hacer:");
		n211112.setTipo(n211112.DECISION);
		n211112.agregarOpcion("Decide ignorarla y seguir subiendo");
		n211112.agregarOpcion("Decide hablarle y explicarle porqué no se habian hablado antes");
				
		//Nodo 2.1.1.1.2.1 Ser solamente amigos
		Nodo n211121 = new Nodo(6,"Salen pero como amigos de ahí en adelante hay chispas pero ambos deciden no intentarlo,"
				+ " ya que Daniela está saliendo con alguien más y morita está inseguro de lo que siente por ella,"
				+ " así que decide dejarla como una amiga más de la Universidad.");
		n211121.setTipo(n211121.TERMINAL);
		n211121.agregarOpcion("ERES UN CONQUISTADOR CON MALA SUERTE.");
		
		
		//Nodo 2.1.1.1.2.2 Decide conquistarla
		Nodo n211122 = new Nodo(6,"Empiezan a chatear cada vez más seguido hasta que logra conquistarla por medio de citas y salidas.");
		n211122.setTipo(n211122.TERMINAL);
		n211122.agregarOpcion("GRANDE TIGRE, ERES TODO UN CONQUISTADOR.");
		
		//Nodo 2.1.1.2.1.1 Continuar con la cita
		Nodo n211211 = new Nodo(6,"Cada uno compra su helado, aunque el prefería gastarle para hacerse pasar por caballero, ella le pregunta por su nombre, él le responde: -Morita ¿Y tú?, Ella le dice que se llama Daniela.\n" + 
				"Pasaron los minutos volando a lo cual morita llama a su mama para decirle que no puede recoger a su hermana, la madre le dice que bueno, que ella va por ella. Ahora puede disfrutar más con Daniela.\n" + 
				"Hablan de historias, amores, cosas de terror algo distinto a una cita, al finalizar la cita el decide:\n" + 
				"");
		n211211.setTipo(n211211.DECISION);
		n211211.agregarOpcion("Acompañarla hasta que llegue a la casa para asegurarse que llegue bie");
		n211211.agregarOpcion("Acompañarla al transporte que ella coja y decirle que espera verse en otra ocasion");
		
		//Nodo 2.1.1.2.1.2 Salir otro día
		Nodo n211212 = new Nodo(6,"Daniela acepta y deciden verse al otro día, en lo cual ambos estaban vestido informalmente, esta vez no fueron a comer helado fueron a escuchar cuenteros, en la tarde ambos la pasan muy bien, ella se sintió cómoda Morita la invita a caminar un rato para conocerse en el trayecto él le pregunta que si tiene  novio, Ella dice que no, que hace poco salió de una relación y decidió no volver a tener novio por el momento\n" + 
				"Morita se desanima por lo último pero también se da alientos para intentarlo, así que morita decide:\n" + 
				"");
		n211212.setTipo(n211212.DECISION);
		n211212.agregarOpcion("Ser solamente amigos");
		n211212.agregarOpcion("Intentar conquistarla");
		
		//Nodo 2.1.2.2.2.1 Decide dejarle de hablar
		Nodo n212221 = new Nodo(6,"Le pide disculpas, que estaba confundido y sintió que debió hacerlo, "
				+ "ella le dice que no hay problema pero la conversación deja de fluir como estaba esperado el decide dejarle de hablar por unos días y"
				+ "  se desanima, ya que al pasar varios días piensa que ella no está interesado por él, así que decide borrar su número, y no volverle a hablar, sabe que ser rechazado no es malo cómo lo decía en el libro, "
				+ "\"cada rechazo es una oportunidad de aprender a mejorar en cómo no hacerlo\"");
		n212221.setTipo(n212221.TERMINAL);
		n212221.agregarOpcion("ERES UN CONQUISTADOR CON MALA SUERTE.");
		
		
		//Nodo 2.1.2.2.2.2 Invitarla al bar
		Nodo n212222 = new Nodo(6,"Salen al bar, empiezan a tomar y bailar al rato se sientan a hablar, "
				+ "de lo ebrios que estaban, Daniela lo besa morita se siente feliz, pensando que logro conquistarla, "
				+ "luego al día siguiente aún se denota el sentimiento de Daniela hacia él, salen a escondidas, "
				+ "pero morita quería que fuese su novia, así que la presiona como tal para serlo con el tiempo Daniela empieza ver como morita la cela sin necesidad y empieza aburrirse de morita, un día lo para y le dice que no más ya que él es muy toxico y controlador, le dice que dejara de hablarle Morita se siente destruido pero aprendió a que hay que darle tiempo al tiempo.");
		n212222.setTipo(n212222.TERMINAL);
		n212222.agregarOpcion("!PELIGRO¡ PERSONA TÓXICA FRENTE A LA PANTALLA");
		
		//Nodo 2.1.1.1.1.1.2 eSCRIBIRLE DESPUES
		Nodo n2111112 = new Nodo(7,"Ella cree que a el no le gusto la cita y por eso no le escribio, con el tiempo de los dias ella pierde el interes por el\n" + 
				"y cuando morita le escribe, ella ya no quiere nada con el, solamente se siguen conociendo y prefiere ser una amiga de la universidad\n" + 
				"con el tiempo ella le da consejos de comó salir con chicas como ella, para que no pierda una oportunidad como la que perdio con ella");
		n2111112.setTipo(n2111112.TERMINAL);
		n2111112.agregarOpcion("LO SIENTO, ASÍ NO LE INTERESAS A NADIE.");
		
		//Nodo 2.1.1.1.1.1.1 Escribirle de una
		Nodo n2111111 = new Nodo(7,"Empiezan a chatear cada vez más seguido hasta que logra conquistarla por medio de citas y salidas.");
		n2111111.setTipo(n2111111.TERMINAL);
		n2111111.agregarOpcion("GRANDE TIGRE, ERES TODO UN CONQUISTADOR.");
		
		
		//Nodo 2.1.1.1.1.2.1 Decide ignorarla
		Nodo n2111121 = new Nodo(7,"Daniela se enoja y decide no volver a hablarle ya que se sintió mal cuando él la ignoró");
		n2111121.setTipo(n2111121.DECISION);
		n2111121.agregarOpcion("ES INCREIBLE PERO ESTO NO ES LO TUYO.");
		
		
		//Nodo 2.1.1.1.1.2.2 Saludarla
		Nodo n2111122 = new Nodo(7,"Él le explica que no la encontró en las redes con solo su nombre, la buscó en la U y tampoco la encontró. "
				+ "Le pregunta cómo está, y hablan un rato, pasado el tiempo, salen pero como amigos de ahí en adelante hay chispas pero ambos deciden no intentarlo,"
				+ " ya que Daniela está  saliendo con alguien más y morita está inseguro de lo que siente por ella,");
		n2111122.setTipo(n2111122.TERMINAL);
		n2111122.agregarOpcion("ERES UN CONQUISTADOR CON MALA SUERTE.");
		
		//Nodo 2.1.1.2.1.1.1 La acompaña a la casa
		Nodo n2112111 = new Nodo(7,"Al ir a la casa, se conocen mejor y morita se siente cómodo con la chica, ambos sienten atracción por el otro,  se dan la oportunidad de compartir sus sueños y ambos le queda gustando.\n" + 
				"Antes de irse él le pide su número, para seguir en contacto. A lo que ella acepta y parece que continuaran saliendo\n" + 
				"");
		n2112111.setTipo(n2112111.DECISION);
		n2112111.agregarOpcion("Escribirle de una vez.");
		n2112111.agregarOpcion("Esperar unos días y hablarle");
		
		//Nodo 2.1.1.2.1.1.2 La acompaña al bus
		Nodo n2112112 = new Nodo(7,"Morita sintió que la pasaron  bien y que se gustaron, ahora debe seguir haciéndolo, "
				+ "pero al ella irse nunca supo cómo hablarle, así que la buscaba en la universidad."
				+ " Pasaron semanas y no se volvieron a ver, para cuando se toparon, fue el subiendo al quinto piso y ella saliendo del baño,"
				+ " él con la pena de que jamás se volvieron a hablar, no sabía que hacer:");
		n2112112.setTipo(n2112112.DECISION);
		n2112112.agregarOpcion("Decide ignorarla y seguir subiendo");
		n2112112.agregarOpcion("Decide hablarle y explicarle por qué no se habían hablado antes");
		
		//Nodo 2.1.1.2.1.2.1 Salen como amigos
		Nodo n2112121 = new Nodo(7,"Salen pero como amigos de ahí en adelante hay chispas pero ambos deciden no intentarlo,\"\n" + 
				"				+ \" ya que Daniela está saliendo con alguien más y morita está inseguro de lo que siente por ella,\"\n" + 
				"				+ \" así que decide dejarla como una amiga más de la Universidad.");
		n2112121.setTipo(n2112121.TERMINAL);
		n2112121.agregarOpcion("BIENVENIDO A LA FRIENDZONE");
		
		//NODO 2.1.1.2.1.2.2 decide conquistarla
		Nodo n2112122 = new Nodo(7,"Empiezan a chatear cada vez más seguido hasta que logra conquistarla por medio de citas y salidas.");
		n2112122.setTipo(n2112122.TERMINAL);
		n2112122.agregarOpcion("GRANDE TIGRE, ERES TODO UN CONQUISTADOR.");
		
		//Nodo 2.1.1.2.1.1.1.1 Escribirle de una vez
		Nodo n21121111 = new Nodo(8,"Empiezan a chatear cada vez más seguido hasta que logra conquistarla por medio de citas y salidas.");
		n21121111.setTipo(n21121111.TERMINAL);
		n21121111.agregarOpcion("GRANDE TIGRE, ERES TODO UN CONQUISTADOR.");
		
		//Nodo 2.1.1.2.1.1.1.2 Escribirle despues
		Nodo n21121112 = new Nodo(8,"Ella cree que a el no le gusto la cita y por eso no le escribio, con el tiempo de los dias ella pierde el interes por el\n" + 
				"y cuando morita le escribe, ella ya no quiere nada con el, solamente se siguen conociendo y prefiere ser una amiga de la universidad\n" + 
				"con el tiempo ella le da consejos de comó salir con chicas como ella, para que no pierda una oportunidad como la que perdio con ella");
		n21121112.setTipo(n21121112.TERMINAL);
		n21121112.agregarOpcion("LO SIENTO, ASÍ NO LE INTERESAS A NADIE.");
		
		//Nodo 2.1.1.2.1.1.2.1 ignorarla
		Nodo n21121121= new Nodo(8,"Daniela se enoja y decide no volver a hablarle ya que se sintió mal cuando él la ignoró");
		n21121121.setTipo(n21121121.DECISION);
		n21121121.agregarOpcion("ES INCREIBLE PERO ESTO NO ES LO TUYO.");
		
		//Nodo 2.1.1.2.1.1.2.2 Saludarla
		Nodo n21121122 = new Nodo(7,"Él le explica que no la encontró en las redes con solo su nombre, la buscó en la U y tampoco la encontró. "
				+ "Le pregunta cómo está, y hablan un rato, pasado el tiempo, salen pero como amigos de ahí en adelante hay chispas pero ambos deciden no intentarlo,"
				+ " ya que Daniela está  saliendo con alguien más y morita está inseguro de lo que siente por ella,");
		n21121122.setTipo(n21121122.TERMINAL);
		n21121122.agregarOpcion("¡BIENVENIDO A LA FRIENDZONE!");
		
		n2112112.addpart(n21121121);
		n2112112.addpart(n21121122);
		
		n2112111.addpart(n21121111);
		n2112111.addpart(n21121112);
		
		n211212.addpart(n2112121);
		n211212.addpart(n2112122);
		
		n211211.addpart(n2112111);
		n211211.addpart(n2112112);
		
		n211112.addpart(n2111121);
		n211112.addpart(n2111122);
		
		n211111.addpart(n2111111);
		n211111.addpart(n2111112);
		
		n21222.addpart(n212221);
		n21222.addpart(n212222);
		
		n21121.addpart(n211211);
		n21121.addpart(n211212);
		
		n21112.addpart(n211121);
		n21112.addpart(n211122);
		
		n21111.addpart(n211111);
		n21111.addpart(n211112);
		
		n2122.addpart(n21221);
		n2122.addpart(n21222);
		
		n2111.addpart(n21111);
		n2111.addpart(n21112);
		
		n2112.addpart(n21121);
		n2112.addpart(n21122);
		n211.addpart(n2111);
		n211.addpart(n2112);
		
		n212.addpart(n2121);
		n212.addpart(n2122);
		
		n21.addpart(n211);
		n21.addpart(n212);
		
		n0.addpart(n21);
		n0.addpart(n22);
		
		
		n112112121.addpart(n1121121211);
		n112112121.addpart(n1121121212);
		
		n11211212.addpart(n112112121);
		n11211212.addpart(n112112122);
		
		n11211211.addpart(n112112111);
		n11211211.addpart(n112112112);
		
		n1121121.addpart(n11211211);
		n1121121.addpart(n11211212);
		
		n1121122.addpart(n11211221);
		n1121122.addpart(n11211222);
		
		n112112.addpart(n1121122);
		n112112.addpart(n1121121);
		
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
		
		n.addpart(n1);
		
		nodo.addpart(n);
		nodo.addpart(n0);
		System.out.println(nodo.getPartes().get(0).getEnunciado());
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
