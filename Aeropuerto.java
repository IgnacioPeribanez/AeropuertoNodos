package aeropuerto;

public class Aeropuerto {
	private Heap cola;
	private Stack pila;
	private listaEnlazadaSimple aviones;
	
	public Aeropuerto () {
		this.cola = new Heap();
		this.pila = new Stack();
		this.aviones = new listaEnlazadaSimple();
	}

	public Heap getCola() {
		return cola;
	}

	public void setCola(Heap cola) {
		this.cola = cola;
	}

	public Stack getPila() {
		return pila;
	}

	public void setPila(Stack pila) {
		this.pila = pila;
	}

	public listaEnlazadaSimple getAviones() {
		return aviones;
	}

	public void setAviones(listaEnlazadaSimple aviones) {
		this.aviones = aviones;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo mete un pasajero a la cola o la pila siguiendo un 
	 * 		 orden establecido
	 */
	public boolean entrarPasajero(NodePasajero node) {
		try {
			if (cola.getSize() < 2) {
				cola.push(node);
				System.out.println(node.getContent().getNombre() + " ha accedido al aeropuerto");
			} else if (pila.getSize() < 3) {
				pila.push(node);
				System.out.println(node.getContent().getNombre() + " ha accedido al aeropuerto");
			} else {
				System.out.println("Por favor espere su turno " + node.getContent().getNombre() + " , le atenderemos enseguida");
			}
		} catch(Exception e) { System.out.println(e); }
		return false;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo introduce un pasajero en un avion cogiendo primero los pasajeros
	 * 		 de la cola y siguiendo por los de la pila
	 */
	public boolean accederAvion() {
		try {
			if (cola.isEmpty() == false) {
				for (int i = 0; i < aviones.getSize(); i++) {
					if (aviones.get(i).getContent().getIdAvion() == cola.getFirst().getContent().getVuelo()) {
						Pasajero pasajero = cola.pop().getContent();
						aviones.get(i).getContent().getPasajeros().add(pasajero);
						System.out.println(pasajero.getNombre() + " ha accedido al avion");
						break;
					}
				}
			} else if (pila.isEmpty() == false && cola.isEmpty() == true) {
				for (int i = 0; i < aviones.getSize(); i++) {
					if (aviones.get(i).getContent().getIdAvion() == pila.getLast().getContent().getVuelo()) {
						Pasajero pasajero = pila.pop().getContent();
						aviones.get(i).getContent().getPasajeros().add(pasajero);
						System.out.println(pasajero.getNombre() + " ha accedido al avion");
						break;
					}
				}
			} else {
				System.out.println("No hay cola en la fila");
			}
		} catch(Exception e) { System.out.println(e); }
		return false;
	}
}
