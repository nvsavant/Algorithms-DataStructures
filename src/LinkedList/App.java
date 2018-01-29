package LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList LL = new linkedList();
		
		LL.insert(10);
		LL.insert(20);
		LL.insert(30);
		LL.insert(40);
		LL.insert(50);
		LL.traverseList();
		System.out.println("Size of Linked list:"+LL.size());
		
		
		
		LL.remove();
		LL.remove();
		LL.remove();
		LL.traverseList();
		System.out.println("Size of Linked list:"+LL.size());
		
	}

}
