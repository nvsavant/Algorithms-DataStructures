package stack;

public class App {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.traverseStack();
		
		System.out.println();
		System.out.println("After popping");
//		s1.pop();
		s1.pop();
//		s1.pop();
		s1.traverseStack();
		
		System.out.println(s1.peek());
		System.out.println(s1.peek());
	}

}
