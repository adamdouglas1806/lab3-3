class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

public class Stack implements StackADT {
	
	private class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element = e;
			next = n;
		}
		
		public int getValue() {
			return element;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
	// this is a reference to the head node of the linked list
	private Node top;
	
	// keep track of the number of elements in the stack
	private int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size; 
	}
	
	// part 3: complete
	/** Adds a new element to the stack
	 * 
	 * Where N is the number of elements in the stack the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: No iteration will take place which means that the number of steps will always remain the same and thus the time to compile the code will always
	 * remain the same.
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o){
		
		Node newNode = new Node(o, top);
		//Creating a new node called newNode.
		newNode.next = top;
		//Setting the reference of newNode to the top/existing head node.
		top = newNode;
		//Setting newNode to be the head node.
		size++;
		//This will increase the size variable by 1 since a new node is being pushed.
	}
	
	// part 3: complete
	/** Removes an element from the top of the stack
	 * 
	 * Where N is the number of elements in the stack the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: Similar to when pushing a new node, there are no iterations which means there is a fixed number of steps and the time taken for the code to
	 * compile will always remain the same.
	 *
	 * @return the integer that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public int pop() throws StackException{
		
		if (isEmpty()) {
			throw new StackException("StackException");
		}
		//This is a base case which will ensure that the list isn't null. If the list is null is will return a stack exception.
		
		int popValue = 0;
		//Creating a variable which will be the popped value;
		
		popValue = top.getValue();
		//The popValue variable will be set to the value at the top of the stack (the value which is about to be popped).
		
		top = top.getNext();
		//top will be set to the next node in the linked list.
		
		size = size -1;
		//The size variable is being reduced by 1 since the top value is popped/removed from the list.
		
		return popValue;
		//This will return the popped value;
		
	}
	
	// part 3: complete
	/** Returns the integer at the top of the stack
	 * 
	 * Where N is the number of elements in the stack the complexity is:
	 *
	 * O(1)
	 * 
	 * Because: Similar to the complexity in the push() and pop() methods; there is no iteration which means that there is a fixed number of sequences
	 * thus the code will always take the same amount of time to compile.
	 * 
	 * @return the integer at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public int top() throws StackException{
		
		if (isEmpty()) {
			throw new StackException("StackException");
		}
		/*
		 * Similar to the base case in the pop() method. This is a base case which will ensure that the list isn't null. If the list is null is will return a 
		 * stack exception.
		 */
		
		int topValue = 0;
		//Creating a variable which will be the top value;
		
		topValue = top.getValue();
		//The topValue variable will be set to the value at the top of the stack.
		
		return topValue;
		//This will return the top value;
		
	}
	
	
	

}
