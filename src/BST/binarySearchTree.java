package BST;

public class binarySearchTree {
	private Node root;

	public binarySearchTree() {
		this.root = null;
	}

	public void insert(int data) {
		if(root == null) {
			root = new Node(data);
			return;
		}
		insertData(data, root);
	}

	private Node insertData(int data, Node node) {
		if (node == null) {
			Node newNode = new Node(data);
			node = newNode;
			return node;
		}

		if (data > node.getData()) {
			node.setRightChild(insertData(data, node.getRightChild()));
			return node;
		} else {
			node.setLeftChild(insertData(data, node.getLeftChild()));
			return node;
		}

	}

	public void inOrderTraversal() {
		System.out.println("Inorder traversal");
		inOrderTraversalData(this.root);
		System.out.println();
		System.out.println();
	}

	private void inOrderTraversalData(Node node) {
		if (node == null) {
			return;
		}

		inOrderTraversalData(node.getLeftChild());		
		System.out.print(node.getData() + "-->");
		inOrderTraversalData(node.getRightChild());
	}
	
	public void preOrderTraversal() {
		System.out.println("Preorder traversal");
		preOrderTraversalData(this.root);
		System.out.println();
		System.out.println();
	}

	private void preOrderTraversalData(Node node) {
		if (node == null)
			return;

		System.out.print(node.getData() + "-->");
		preOrderTraversalData(node.getLeftChild());
		preOrderTraversalData(node.getRightChild());
	}
	
	public void postOrderTraversal() {
		System.out.println("Postorder traversal");
		postOrderTraversalData(this.root);
		System.out.println();
		System.out.println();
	}

	private void postOrderTraversalData(Node node) {
		if (node == null)
			return;

		postOrderTraversalData(node.getLeftChild());
		postOrderTraversalData(node.getRightChild());
		System.out.print(node.getData() + "-->");
	}
	
	public int getMax() {
		if(this.root == null)
			return -1;
		Node node = this.root;
		while(node.getRightChild()!=null) {
			node = node.getRightChild();
		}
		return node.getData();
	}
	
	public int getMin() {
		if(this.root == null)
			return -1;
		Node node = this.root;
		while(node.getLeftChild()!=null) {
			node = node.getLeftChild();
		}
		return node.getData();
	}

}
