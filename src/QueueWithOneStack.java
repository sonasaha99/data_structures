import java.util.Stack;

public class QueueWithOneStack {
    private Stack<Integer> stack;

    // Constructor of queue
    QueueWithOneStack() {
        stack = new Stack<Integer>();
    }

    // insert method of queue
    public void insert(int data) {
        System.out.println("Insert " + data);
        stack.push(data);
    }

    // front method of queue
    public Integer front() {
        int x;
        int res = 0;
        if(stack.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        } else if(stack.size() == 1) {
            int elem = stack.pop();
            System.out.println("The front element of queue is " + elem);
            return elem;
        } else {
            x = stack.pop();
            res = front();
            stack.push(x);
            return res;
        }
        return 0;
    }
}
