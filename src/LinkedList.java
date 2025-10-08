class LinkedListException extends RuntimeException{    
	public LinkedListException(String err) {
		super(err);
	}
}


public class LinkedList {

	private class Node {
		private int value;
		private Node nextNode;

		public Node(int i) {
			value = i;
			nextNode = null; 
		}

		// returns the value stored in the node
		public int getValue() {
			return value;
		}

		// sets the value stored in the node
		public void setValue(int i) {
			value = i;
		}

		// Returns the Node that this Node links to
		// Note this may return null
		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}

		// adds Node n to the tail of the list
		public void addNodeAtTail(Node n) {
			if (this.nextNode == null) {
				this.nextNode = n;
			} else {
				this.nextNode.addNodeAtTail(n);
			}
		}

		public Node removeAtTail(Node valueAtTail) {
			if (this.nextNode == null) { // if this is the last node
				valueAtTail.setValue(this.getValue()); // copy out the value
				return null; // return null
			} else { // move onto the next Node
				this.nextNode = this.nextNode.removeAtTail(valueAtTail);
				return this;
			}

		}
	} // End of Node Class implementation

	private Node headNode; // Holds a reference to the head of the list

	public LinkedList() {
		headNode = null;
	}

	public void addAtHead(int i) {
		Node newNode = new Node(i); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}

	public void addAtTail(int i) {
		Node newNode = new Node(i);
		if (headNode == null) { 
			headNode = newNode;
		} else {
			headNode.addNodeAtTail(newNode);
		}
	}

	/*
	 * removes and returns the value at the head of the list
	 */ 
	public int removeAtHead() throws LinkedListException {
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the head of an empty linked list");
		} else {
			Node returnedNode = headNode;
			headNode = headNode.getNextNode();
			return returnedNode.getValue();
		}
	}

	/*
	 * See https://web.microsoftstream.com/video/5a15e714-bf98-4bf6-9124-573638723795
	 */
	public int removeAtTail() throws LinkedListException {
		if (headNode == null) {
			throw new LinkedListException("Cannot remove from the tail of an empty linked list");
		} else {
			Node returnedNode = new Node(-1);
			headNode = headNode.removeAtTail(returnedNode);
			return returnedNode.getValue();
		}
	}

	/*
	 * PART 2: complete the following methods
	 */

	/** The number of nodes in the linked list, and 0 for an empty linked list.
	 * 
	 *  Where N is the length of linked list the complexity is:
	 *
	 * O(N)
	 * 
	 * Because: The while loop will iterate for the number of nodes in the linked list. If there are a lot of nodes in the linked list then it will
	 * take more steps to complete and thus it will take longer to compile (in other words the more inputs the longer it will take to run). 
	 * 
	 * @return the number of nodes in the linked list
	 */
	public int size(){
		
		if (headNode == null) {
			//If the headNode is null then there are no nodes in the linked list.
			return 0;
		}
		//This if statement is a base case to ensure the linked list is not empty. If the linked list is empty it will return o;
		
		int numberOfNodes = 0;
		//Creating a new variable which will store a count of the number of nodes in the linked list.
		Node currentNode = headNode;
		//Creating a new variable with the same address as the headNode.
		
		while (currentNode != null) {
			numberOfNodes++;
			//The line above will add 1 to the variable numberOfNodes every time the while loop iterates, this will track the number of nodes in the linked list.
			currentNode = currentNode.getNextNode();
			//currentNode will be set to the next node in the linked list.
		}
		/*
		 * The while loop will continue to loop until the currentNode variable is pointing towards null. It will cycle through each node and add 1
		 * every time it iterates (which shows how many nodes are in the list.
		 */
		
		return numberOfNodes;
		//This will return the number of nodes in the linked list.
	}
	
	
	/** The sum of all integer nodes in the linked list, and 0 for an empty linked list.
	 *
	 * TODO Where N is the length of linked list the complexity is:
	 *
	 * O(N)
	 * 
	 * Similarly to before in the method size(); Depending on the number of nodes in the linked list it will affect the time the code takes to compile and
	 * calculate the sum. MEaning if there is a larger number of nodes/a larger input then it will take a longer amount of time to calculate.
	 * 
	 * @return the sum of all nodes in the linked list
	 */
	public int total(){ 
		
		if (headNode == null) {
			//If the headNode is null then there are no nodes in the linked list.
			return 0;
		}
		//Similar to the if statement in the size() method, this is a base case which checks if the linked list is empty and if so it will return 0.
		
		int sumOfNodes = 0;
		//Creating a new variable which will store the sum of every integer node in the linked list.
		Node currentNode = headNode;
		//Similar to the currentNode in the method size(), a new variable with the same address as the headNode.
		
		while (currentNode != null) {
			sumOfNodes = sumOfNodes + currentNode.getValue();
			//sumOfNodes variable is set to the value of itself and the current value in the next integer node of the linked list.
			currentNode = currentNode.getNextNode();
			//Similar to before in the size() method, currentNode will be set to the next node in the linked list.
		}
		
		return sumOfNodes;
		//This will return the sum of all integer nodes in the linked list.
		
	}

	/*
	 * Optional: reverse the linked lists so that the first element becomes
	 * the last, the second becomes the second last, and so on.
	 */
	public void reverse(){
			
	}

}
