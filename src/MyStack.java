public class MyStack {
    private char arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    MyStack(int size) {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    // push method
    public void push(char elem) {
        if(isFull()) {
            System.out.println("The stack is already full");
            System.exit(1);
        }
        System.out.println("Inserting " + elem);
        arr[++top] = elem;
    }

    // pop method
    public char pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(1);
        }

        System.out.println("Removing " + peek());
        // Decrease the size of stack and return the popped element
        return arr[top--];
    }

    // peek method: returns top element of the stack
    public char peek() {
        if(!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }
        return '*';
    }

    // size method
    public int size() {
        return top + 1;
    }

    // isEmpty method: checks if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull method: checks if the stack is full or not
    public boolean isFull() {
        return capacity == top + 1;
    }
}
