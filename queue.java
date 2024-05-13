package number3;
public class QueueUsingStacks {
    int[] stack1;
    int[] stack2;
    int top1;
    int top2;
    int capacity;

    public QueueUsingStacks(int capacity) {
        this.capacity = capacity;
        this.stack1 = new int[capacity];
        this.stack2 = new int[capacity];
        this.top1 = -1;
        this.top2 = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        while (top1 >= 0) {
            stack2[++top2] = stack1
}
