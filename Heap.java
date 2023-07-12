package aeropuerto;

public class Heap {
	private NodePasajero first;
	private NodePasajero last;
	private int size;
	
	public Heap () {
		this.first = null;
		this.last = null;
		this.size = 0;
	}
	
	public Heap (NodePasajero first, NodePasajero last, int size) {
		this.first = first;
		this.last = last;
		this.size = 1;
	}
	
	public NodePasajero getFirst() {
		return first;
	}

	public void setFirst(NodePasajero first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Heap [first=" + first + ", last=" + last + ", size=" + size + "]";
	}

	/**
	 * pre: --- 
	 * Post: Este metodo mete un nodo en la cola en la ultima posicion
	 */
	public boolean push(NodePasajero node) {
		try {
				if(isEmpty()) {
					first = node;
					last = node;
				} else {
					last.setNext(node);
					last = node;
				} size++; return true;
		} catch(Exception e) { System.out.println(e); }
		return false;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo comprueba si la cola esta vacia o no.
	 */
	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo saca el primer nodo de la cola
	 */
	public NodePasajero pop() {
		try {
			if(!isEmpty()) { 
				NodePasajero p = first;
				first = first.getNext();
				size--;
				return p;
			}
		} catch(Exception e) { System.out.println(e); } 
		return null;
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo muestra por pantalla la cola de forma ordenada.
	 */
	public void show() {
		NodePasajero p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent().getNombre());
			p = p.getNext();
		}
	}
	
}
