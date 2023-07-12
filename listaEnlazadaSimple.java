package aeropuerto;

public class listaEnlazadaSimple {
	private NodeAvion first;
	private int size;
	
	public listaEnlazadaSimple () {
		this.first = null;
		this.size = 0;
	}
	
	public listaEnlazadaSimple (NodeAvion first, int size) {
		this.first = first;
		this.size = 1;
	}

	public NodeAvion getFirst() {
		return first;
	}

	public void setFirst(NodeAvion first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean add(NodeAvion node) {
		try {
			if (size == 0) {
				first = node;
			} else {
				NodeAvion p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(node);
			} size++;
			return true;
		} catch (Exception e) {
			System.out.print(e.toString());
			return false;
		}
	}
	
	public boolean add(int position, NodeAvion node) {
		if (position == 0) {
			node.setNext(first);
			first = node;
		} else if (position == size) {
			return add(node);
		} else {
			NodeAvion p = first;
			for (int i = 0; i < (position-1); i++) {
				p = p.getNext();
			} 
			node.setNext(p.getNext());
			p.setNext(node);
			size++;
			return true;
		}
		return false;
	}
	
	public boolean delete(int position) {
		if (position == 0) {
			first = first.getNext();
			size--;
		} else if (position == size) {
			NodeAvion p = first;
			for (int i = 0; i < (position-1); i++) {
				p = p.getNext();
			} 
			p.setNext(null);
			size--;
			return true;
		} else {
			NodeAvion p = first;
			for (int i = 0; i < (position-1); i++) {
				p = p.getNext();
			} 
			p.setNext(p.getNext().getNext());
			size--;
			return true;
		}
		return false;
	}
	
	public NodeAvion get(int position) {
		try {
			if (position > size || position < 0) {
				return null;
			} else {
				NodeAvion p = first;
				for (int i = 0; i < position; i++) {
					p = p.getNext();
				} 
				return p;
			}
		} catch (Exception e) {
			System.out.print(e.toString());
		} return null;
	}
	
	public void show() {
		NodeAvion p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent());
			p = p.getNext();
		}
	}
}
