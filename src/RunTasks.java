import java.util.SortedMap;

public class RunTasks {

    public static void main(String[] args) {

        // Run queue with 2 stacks task
        System.out.println("Run queue with 2 stacks task");
        MyQueueWithStacks myQueueWithStacks = new MyQueueWithStacks();
        myQueueWithStacks.insert(1);
        myQueueWithStacks.insert(2);
        myQueueWithStacks.insert(104);
        myQueueWithStacks.insert(35);
        myQueueWithStacks.insert(19);
        myQueueWithStacks.insert(29);
        myQueueWithStacks.insert(8);
        myQueueWithStacks.front();
        myQueueWithStacks.front();
        myQueueWithStacks.insert(15);
        myQueueWithStacks.front();

        // Run queue with 1 stack
        System.out.println("\nRun queue with 1 stack");
        QueueWithOneStack queueWithOneStack = new QueueWithOneStack();
        queueWithOneStack.insert(5);
        queueWithOneStack.insert(16);
        queueWithOneStack.insert(8);
        queueWithOneStack.insert(162);
        queueWithOneStack.insert(23);
        queueWithOneStack.front();
        queueWithOneStack.front();
        queueWithOneStack.insert(96);
        queueWithOneStack.front();

        // Run quotes checker task
        System.out.println("\nRun quotes checker task");
        QuotesChecker quotesChecker = new QuotesChecker("(1+2)+((5)*6)");
        System.out.println(quotesChecker.checkQuotes());

    }
}
