package Queue;


public class queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int numberItems;
    
    
    public queue(int Size) {
        maxSize = Size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        numberItems = 0;
    }
    public void insertData(int data) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        else {
            queueArray[++rear] = data;
            numberItems++;
        }
    }
    public int removeData() {
        int temporary = queueArray[front--];
        if (front == maxSize) {
            System.out.println("QUEUE IS EMPTY.");
            front = 0;
        }
        numberItems++;
        return temporary;
    }
    public int peekRear() {
        if (!isEmpty()) {
            System.out.println("REAR: ");
            return queueArray[rear];
        }
        else {
            System.out.println("QUEUE IS EMPTY.");
            return -1;
        }
    }
    public void queueLoop() {
        if (isEmpty()) {
            System.out.println("QUEUE IS EMPTY.");
        }
        else {
            System.out.println("QUEUE: ");
            for (int i = 0; i <= numberItems; i++) {
                System.out.println(queueArray[i]);
            }
        }
    }
    public int peekFront() {
        if (!isEmpty()) {
            System.out.println("FRONT: ");
            return queueArray[front];
        }
        else {
            System.out.println("QUEUE IS EMPTY.");
            return -1;
        }
    }
    public boolean isEmpty() {
        return rear ==  - 1;
    }
}
