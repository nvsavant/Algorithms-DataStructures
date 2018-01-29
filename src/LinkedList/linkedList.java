package LinkedList;

public class linkedList {

	private Node root;
	private int sizeOfList;
	
	public linkedList() {
		root = null;
		sizeOfList = 0;
	}

	public void insert(int data) {
		this.sizeOfList++;
		if (this.root == null) {
			this.root = new Node(data);
		} else {
			insertAtBeginning(data);
		}

	}

	private void insertAtEnd(int data, Node node) {
		while (node.getNextPtr() != null) {
			node = node.getNextPtr();
		}
		Node newNode = new Node(data);
		node.setNextPtr(newNode);
	}

	private void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.setNextPtr(this.root);
		this.root = newNode;
	}

	public void remove() {
		if (this.root == null) {
			return;
		} else {
			this.sizeOfList--;
			this.root = this.root.getNextPtr();
		}

	}

	public void traverseList() {
		if (isEmpyty()) {
			return;
		}
		Node actualNode = this.root;
		while (actualNode != null) {
			System.out.print(actualNode.getData()+"-->");
			actualNode = actualNode.getNextPtr();
		}
		System.out.println("NULL");
	}

	public int size() {
		return this.sizeOfList;

	}

	private boolean isEmpyty() {
		return this.root == null;
	}

}
