package Basic;
import java.util.*;

class MyStack {
	List<Integer> myStack = new ArrayList<Integer>();
	/** Push element x onto stack. */
	public void push(int x) {
		myStack.add(x);
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		int removedItem = top();
		int index = myStack.size() - 1;
		myStack.remove(index);
		return removedItem;
	}

	/** Get the top element. */
	public int top() {
		int index = myStack.size() - 1;
		int topItem = myStack.get(index);
		return topItem;
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return myStack.isEmpty();

	}

	public static void main(String args[]) {
		MyStack obj = new MyStack();
		obj.push(2);
		obj.push(1);
		obj.push(3);
		int param_2 = obj.pop();
		System.out.println("Popped:" + param_2);
		int param_3 = obj.top();
		System.out.println("Top:" + param_3);
		boolean param_4 = obj.empty();
		System.out.println("Is empty:" + param_4);
	}
}
