import java.util.EmptyStackException;

public class ListStack implements BKStack {
    //Time complexity O(1)
    // Inner class Node representing each element in the linked list.
    private class Node { // Private class as it doesn't NEED to be public
        double data;   // The data part of the node.
        Node next;     // Reference to the next node in the list.
        
				// Constructor initializes the node with given previous data.
        public Node(double data) {
            this.data = data;
            next = null;
        }
    }
    
    private Node top;    // Reference to the top of the stack.
    private int size;    // Variable to keep track of the number of elements in the stack.

		// Constructor initializes an empty ListStack.
		// Sets list size to 0 as there exists a stack, but it has no size.
		// The top of the stack is set to null as it was just initialized. The actual increase/decrease of the top of the stack happens in the push/pop functions. 
    public ListStack() { //Time complexity O(1)
        top = null;
        size = 0;
    }

	  // Method to check if the stack is empty.
    // Returns true if the stack is empty, otherwise false.
    //Time complexity O(1)
		@Override
    public boolean isEmpty() {
        return top == null;
    }

		// Method to get the number of elements in the stack.
		// Returns the list size of the stack variable that we have been keeping track of.
    //Time complexity O(1)
		@Override
    public int count() {
        return size;
    }

		// Method to add an element to the top of the stack.
    // Creates a new node and sets the new node becomes the top of the stack.
		// Increases list size variable by 1. //Time complexity O(1)
		@Override
    public void push(double d) {
        Node newNode = new Node(d);
        newNode.next = top;
        top = newNode;
        size++;
    }

	  // Method to remove and return the top element of the stack.
    // Throws an EmptyStackException if the stack is empty.
		// Decreases list size variable by 1. //Time complexity O(1)
    @Override
    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        double data = top.data;
        top = top.next;
        size--;
        return data;
    }

	  // Method to return the top element of the stack without removing it.
    // Throws an EmptyStackException if the stack is empty.
		// This function is READS only. //Time complexity O(1)
    @Override
    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
