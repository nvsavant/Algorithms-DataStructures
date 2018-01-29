package stack;

import java.util.LinkedList;

public class Stack {
	private LinkedList<Integer> LL;

	public Stack() {
		this.LL = new LinkedList<Integer>();
	}

	public void push(int data) {
		this.LL.addFirst(data);
	}

	public int pop() {
		if (this.LL.isEmpty())
			return -1;
		return this.LL.removeFirst();
	}

	public int peek() {
		if (this.LL.isEmpty())
			return -1;
		return this.LL.getFirst();
	}

	public int size() {
		return this.LL.size();
	}

	public void traverseStack() {
		for (Integer item : LL) {
			System.out.print(item + "-->");
		}
		System.out.println("NULL");
	}

}
