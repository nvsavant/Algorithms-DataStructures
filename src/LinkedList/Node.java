package LinkedList;

public class Node {
	private int data;
	private Node nextPtr;

	public Node(int data) {
		this.data = data;
		this.nextPtr = null;
	}

	@Override
	public String toString() {
		return Integer.toString(this.data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextPtr() {
		return nextPtr;
	}

	public void setNextPtr(Node nextPtr) {
		this.nextPtr = nextPtr;
	}
}
