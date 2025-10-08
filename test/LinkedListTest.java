import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class LinkedListTest {

	LinkedList l;
	
	@Before
	public void setup(){
		l = new LinkedList();
	}
	/*
	 * Part 1: implement these methods
	 */
	@Test
	public void testSizeEmpty() {
		// test l.size() for an empty linked list
		assertEquals("The linked list is empty", 0, l.size());
		//The assertEquals will check if l.size() is equal to 0, if it is then it is an empty linked list.
	}

	@Test
	public void testSizeMany() {
		// test l.size() after adding some numbers to the linked list
		l.addAtHead(1);
		//l.addAtHead will add the integer 1 to the head of the linked list l.
		l.addAtHead(2);
		//l.addAtHead will add the integer 2 to the head of the linked list l.
		l.addAtHead(3);
		//l.addAtHead will add the integer 3 to the head of the linked list l.
		
		assertEquals("The sum of the integer nodes in the linked list", 3, l.size());
		//The assertEquals will check if the number of nodes in the linked list is equal to 3.
	}
	
	@Test
	public void testSizeTwice() {
		// test l.size() twice after adding some numbers to the linked list
		l.addAtHead(1);
		//l.addAtHead will add the integer 1 to the head of the linked list l.
		l.addAtHead(2);
		//l.addAtHead will add the integer 2 to the head of the linked list l.
		l.addAtHead(3);
		//l.addAtHead will add the integer 3 to the head of the linked list l.
		
		assertEquals("The sum of the integer nodes in the linked list", 3, l.size());
		//The assertEquals will check if the number of nodes in the linked list is equal to 3.
		
		assertEquals("The sum of the integer nodes in the linked list", 3, l.size());
		//The assertEquals should still check if the number of nodes in the linked list is equal to 3.
	}

	@Test
	public void testTotalEmpty() {
		// test l.total() for an empty linked list
		assertEquals("The linked list is empty", 0, l.total());
		//The assertEquals will check if l.total() is equal to 0, if it is then it is an empty linked list.
	}

	@Test
	public void testTotalMany() {
		// test l.total() after adding some numbers to the linked list
		l.addAtHead(1);
		//l.addAtHead will add the integer 1 to the head of the linked list l.
		l.addAtHead(2);
		//l.addAtHead will add the integer 2 to the head of the linked list l.
		l.addAtHead(3);
		//l.addAtHead will add the integer 3 to the head of the linked list l.
		
		assertEquals("The sum of the integer nodes in the linked list", 6, l.size());
		//The assertEquals will check the sum of all the integers in the linked list is equal to 6.
	}
	
	@Test
	public void testTotalTwice() {
		// test l.total() twice after adding some numbers to the linked list
		l.addAtHead(1);
		//l.addAtHead will add the integer 1 to the head of the linked list l.
		l.addAtHead(2);
		//l.addAtHead will add the integer 2 to the head of the linked list l.
		
		l.addAtHead(3);
		//l.addAtHead will add the integer 3 to the head of the linked list l.
		
		assertEquals("The sum of the integer nodes in the linked list", 6, l.size());
		//The assertEquals will check the sum of all the integers in the linked list is equal to 6.
		
		assertEquals("The sum of the integer nodes in the linked list", 6, l.size());
		//The assertEquals should again check the sum of all the integers in the linked list is equal to 6.
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtHeadEmpty() throws Exception {
		l.removeAtHead();
		
		throw new Exception("LinkedListException");
		//The throw new exception will prevent any errors from occurring when the user tries to remove from the head of a empty linked list.
	}
	
	@Test(expected=LinkedListException.class)
	public void testRemoveAtTailEmpty() throws Exception {
		l.removeAtTail();
		
		throw new Exception("LinkedListException");
		//The throw new exception will prevent any errors from occurring when the user tries to remove from the tail of a empty linked list.
	}
	
	/*
	 * Optional part
	 */
	
//	@Test
//	public void testReverse() {
//		l.addAtHead(5);
//		l.addAtHead(2);
//		l.addAtHead(10);
//		l.reverse();
//		assertEquals(5, l.removeAtHead());
//		assertEquals(2, l.removeAtHead());	
//		assertEquals(10, l.removeAtHead());	
//	}

}
