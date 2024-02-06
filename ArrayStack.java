import java.util.EmptyStackException;

public class ArrayStack implements BKStack {
		//Time complexity O(1)
    private static final int INITIAL_CAPACITY = 1000000; // Initial capacity of the stack, make this larger to prevent unncessary cloning for larger files. We want to store this in a private final immutable variable to prevent change. 
    private double[] array; // Array to hold the elements of the stack.
    private int top;  // Index of the top element of the stack. This is important throughout the program as we need to always keep track of the top of the stack as that tells us the size of the stack as well as the current element we are working/looking at.

		// Constructor initializes the array with initial capacity and sets the top index as -1.
    //Time complexity O(N) as we need to create a new array and allocate memory.
		public ArrayS tack() {
        this.array = new double[INITIAL_CAPACITY];
        this.top = -1;
    }
		
		// Method to check whether the stack is empty.
    // Returns true if the stack is empty by looking at the top, otherwise false.
    //Time complexity O(1)
		@Override
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to return the number of elements in the stack. Adds 1 to the top because array index values start at 0.  
		//Time complexity O(1)
    public int count() {
        return top + 1;
    }

		// Method to push a new element onto the stack by looking at the top, uses the variable we have been keeping track of throughout the program execution.
    // If the array is full, it resizes the array before adding the new element. //Worst case time complexity O(N) as it needs to call the resize(), however, O(N) is already counted elsewhere in the program so it's also O(1).
    @Override
    public void push(double d) {
        if (top == array.length - 1) {
            resize();
        }
        array[++top] = d;
    }

		// Method to remove and return the top element of the stack, uses the variable we have been keeping track of throughout the program execution.
    // Throws an EmptyStackException if the stack is empty by looking at the top.
		//Time complexity O(1)
    @Override
    public double pop() {
        if (isEmpty()) throw new EmptyStackException();
        return array[top--];
    }

		// Method to return the top element of the stack without removing it, uses the variable we have been keeping track of throughout the program execution.
    // Throws an EmptyStackException if the stack is empty by looking at the top.
		//Time complexity O(1)
    @Override
    public double peek() {
        if (isEmpty()) throw new EmptyStackException();
        return array[top];
    }
	
		// Private helper method to resize the array when it gets full.
    // It creates a new array of double the size and copies the elements from the old array into the new one.
		// Change the "2" to a larger number to change the scaling factor of the array when increasing the size. Changing the number takes more space complexity, but can save time in the future as there would need to be fewer cloning cycles.
	//Time complexity O(N)
    public void resize() {
        double[] newArray = new double[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
