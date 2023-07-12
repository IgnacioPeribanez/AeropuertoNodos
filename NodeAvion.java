package aeropuerto;

public class NodeAvion {
	private Avion content;
	private NodeAvion next;
	
	public NodeAvion (Avion content, NodeAvion next) {
		this.content = content;
		this.next = next;
	}

	public Avion getContent() {
		return content;
	}

	public void setContent(Avion content) {
		this.content = content;
	}

	public NodeAvion getNext() {
		return next;
	}

	public void setNext(NodeAvion next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + ", next=" + next + "]";
	}
	
}
