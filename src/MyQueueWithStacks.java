import java.util.Stack;

public class MyQueueWithStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor of queue
    MyQueueWithStacks() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    // insert method of queue
    public void insert(int data) {
        System.out.println("Insert " + data);
        stack1.push(data);
    }

    // front method of queue
    public Integer front() {
        int x;
        if(stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                x = stack1.pop();
                stack2.push(x);
            }
        }
        x = stack2.pop();;
        System.out.println("The front element of queue is " + x);
        return x;
    }
}
