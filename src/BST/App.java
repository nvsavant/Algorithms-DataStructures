package BST;

public class App {

	public static void main(String[] args) {
		binarySearchTree bst = new binarySearchTree();
		
		bst.insert(10);
		bst.insert(-1);
		bst.insert(1);
		bst.insert(0);
		bst.insert(1000);
		bst.insert(-22);

		bst.inOrderTraversal();
		bst.preOrderTraversal();
		bst.postOrderTraversal();
		
//		System.out.println("Min: "+bst.getMin());
//		System.out.println("Max: "+bst.getMax());
		
	}

}
