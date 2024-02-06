public class ListStackNode { // Class representing a node in the linked list used for ListStack.
    double value; // Field to hold the value of the node.
    ListStackNode next; // Reference to the next node in the linked list.

		// Constructor to initialize the node with a given value that is passed through.
    public ListStackNode(double value) {
        this.value = value; // Set the current value of the node.
        this.next = null; // Initialize the next node reference to null as we aren't there yet until the next iteration.
    }
}
