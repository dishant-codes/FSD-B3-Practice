class CircularQueue{
    int[] arrayQueue;
    int capacity;
    int size;
    int front;
    int rear;

    public CircularQueue(int capacity){
        this.arrayQueue = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.front = 0;
        this.rear = -1; 
    }

    public void enQueue (int data){
        if (isFull()) {
            System.out.println("Queue is Full");
        }
        rear = (rear+1) % capacity;
        arrayQueue[rear] = data;
        size++;
    }

    public int deQueue(){

        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }

        int result = arrayQueue[front];

        front = (front+1) % capacity;
        size--;
        return result;
    }


    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    public static void main(String[] args) {
        
        CircularQueue cQueue = new CircularQueue(4);

        cQueue.enQueue(5);
        cQueue.enQueue(6);
        cQueue.enQueue(2);
        cQueue.enQueue(7);
        cQueue.deQueue();
        cQueue.enQueue(8);

    }
}