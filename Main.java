package aeropuerto;

public class Main {
	
	/**
	 * pre: --- 
	 * Post: Este metodo genera un pasajero con los datos que le mandemos.
	 */
	public static Pasajero crearPasajero(String nombre, String dni, int vuelo) {
		Pasajero pasajero = new Pasajero(nombre, dni, vuelo);
		return pasajero;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo genera un avion con los datos que le mandemos.
	 */
	public static Avion crearAvion(int id) {
		Avion avion = new Avion(id);
		return avion;
	}
	
	public static void main(String[] args) {
		System.out.println("BIENVENIDO AL AEROPUERTO ADOLFO SUAREZ!");
		System.out.println("----------------------------------------");
		Aeropuerto aeropuerto = new Aeropuerto();
		// Creamos los aviones y los introducimos en un NodeAvion
		NodeAvion nodeAvion1 = new NodeAvion(crearAvion(123), null);
		NodeAvion nodeAvion2 = new NodeAvion(crearAvion(23), null);
		// Creamos los pasajeros y los introducimos en un nodo
		NodePasajero pasajero1 = new NodePasajero(crearPasajero("Luis", "123123123-H", 123), null);
		NodePasajero pasajero2 = new NodePasajero(crearPasajero("Elena", "321321321-D", 23), null);
		NodePasajero pasajero3 = new NodePasajero(crearPasajero("Carmen", "17799874-X", 123), null);
		NodePasajero pasajero4 = new NodePasajero(crearPasajero("Manuel", "22669988-D", 123), null);
		// Añadimos los aviones al aeropuerto
		aeropuerto.getAviones().add(nodeAvion1);
		aeropuerto.getAviones().add(nodeAvion2);
		// Entran los pasajeros al aeropuerto
		System.out.println();
		aeropuerto.entrarPasajero(pasajero1);
		aeropuerto.entrarPasajero(pasajero2);
		aeropuerto.entrarPasajero(pasajero3);
		aeropuerto.entrarPasajero(pasajero4);
		System.out.println();
		System.out.println("---------------------COLA-------------------");
		aeropuerto.getCola().show();
		System.out.println("---------------------PILA-------------------");
		aeropuerto.getPila().show();
		System.out.println("--------------------------------------------");
		System.out.println();
		// Entrega documentacion
		aeropuerto.accederAvion();
		// Entrega documentacion
		aeropuerto.accederAvion();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		for (int i = 0; i < aeropuerto.getAviones().getSize(); i++) {
			System.out.println("Avion " + aeropuerto.getAviones().get(i).getContent().getIdAvion());
			for (int j = 0; j < aeropuerto.getAviones().get(i).getContent().getPasajeros().size(); j++) {
				System.out.println(aeropuerto.getAviones().get(i).getContent().getPasajeros().get(j));
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println();
		// Entrega documentacion
		aeropuerto.accederAvion();
		System.out.println();
		System.out.println("---------------------COLA-------------------");
		aeropuerto.getCola().show();
		System.out.println("---------------------PILA-------------------");
		aeropuerto.getPila().show();
		System.out.println("--------------------------------------------");
		System.out.println();
		for (int i = 0; i < aeropuerto.getAviones().getSize(); i++) {
			System.out.println("Avion " + aeropuerto.getAviones().get(i).getContent().getIdAvion());
			for (int j = 0; j < aeropuerto.getAviones().get(i).getContent().getPasajeros().size(); j++) {
				System.out.println(aeropuerto.getAviones().get(i).getContent().getPasajeros().get(j));
			}
		}
		
	}
	
}
