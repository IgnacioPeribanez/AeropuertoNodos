package aeropuerto;

public class Stack {
	private NodePasajero last;
	private int size;
	
	public Stack () {
		this.last = null;
		this.size = 0;
	}
	
	public Stack (NodePasajero last, int size) {
		this.last = last;
		this.size = 1;
	}

	public NodePasajero getLast() {
		return last;
	}

	public void setLast(NodePasajero last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Stack [last=" + last + ", size=" + size + "]";
	}
	
	/**
	 * pre: --- 
	 * Post: Este metodo mete un nodo en la cola en la primera posicion
	 */
	public boolean push(NodePasajero node) {
		try {
			if(isEmpty()) last = node;
			else {
				node.setNext(last);
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
	 * Post: Este metodo saca el ultimo nodo de la cola
	 */
	public NodePasajero pop() {
		try {
			if(!isEmpty()) { 
				NodePasajero p = last;
				last = last.getNext();
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
		NodePasajero p = last;
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent().getNombre());
			p = p.getNext();
		}
	}

}
