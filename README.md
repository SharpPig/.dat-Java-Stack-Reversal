### .dat-Java-Stack-Reversal
This project includes a utility program called BackMasking, which reads a .dat file, reverses its contents, and writes the reversed data to another file.

## File Descriptions

### 1. ArrayStack.java

- **Description:** Implements a stack using an array-based approach.
- **Functionality:**
  - Pushes elements onto the stack.
  - Pops elements from the stack.
  - Peeks at the top element without removing it.
  - Checks if the stack is empty.
  - Returns the number of elements in the stack.
- **Usage:** Use this class to create a stack using an array-based implementation.
- **Dependencies:** None
- **Note:** ArrayStack class provides O(1) time complexity for push, pop, peek, isEmpty, and count operations.

### 2. ListStack.java

- **Description:** Implements a stack using a linked list-based approach.
- **Functionality:**
  - Pushes elements onto the stack.
  - Pops elements from the stack.
  - Peeks at the top element without removing it.
  - Checks if the stack is empty.
  - Returns the number of elements in the stack.
- **Usage:** Use this class to create a stack using a linked list-based implementation.
- **Dependencies:** ListStackNode.java
- **Note:** ListStack class provides O(1) time complexity for push, pop, peek, isEmpty, and count operations.

### 3. ListStackNode.java

- **Description:** Represents a node in the linked list used by ListStack.
- **Functionality:**
  - Holds a value.
  - References the next node in the linked list.
- **Usage:** Used internally by ListStack.java to create nodes in the linked list.
- **Dependencies:** None
- **Note:** This class is not intended for standalone usage.

### 4. BKStack.java

- **Description:** Defines the interface for stack operations.
- **Functionality:**
  - Specifies methods for push, pop, peek, isEmpty, and count operations.
- **Usage:** Implement this interface to create custom stack classes.
- **Dependencies:** None
- **Note:** BKStack interface provides the blueprint for implementing stack operations.

### 5. BackMasking.java

- **Description:** Reads a .dat file, reverses its contents, and writes the reversed data to another file.
- **Functionality:**
  - Parses command-line arguments to determine stack type, input file, and output file.
  - Reads data from the input .dat file and stores it in a stack (ListStack or ArrayStack).
  - Reverses the order of data stored in the stack.
  - Writes the reversed data to the output file.
- **Usage:** Run the program with appropriate command-line arguments to reverse the data in a .dat file.
- **Dependencies:** ListStack.java, ArrayStack.java
- **Note:** This program assumes a specific format for the input .dat file.

Feel free to explore each file for detailed implementation and documentation of stack operations.

For any questions or issues, please contact [your_email@example.com].
