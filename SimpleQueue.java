public class SimpleQueue {
    
    private int capacity;
    private int[] array;
    private int front;
    private int rear;
    private int currentSize;

    public SimpleQueue(int size){
        this.capacity = size;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }


    //   front = 0
    //   front = front + 1;


    //    rear = -1;
    //    item = 50;

    //   
    //    rear = rear + 1;
    //                 F      3       4
    //  | 10 |  20  |  30  |  40  |  50  |
    // 


    public void enqueue(int item){
        //  rear = -1,  ++rear = 0
        array[++rear] = item;
    }

    public int dequeue(){
        return array[front++];
    }

    // public void enqueue(int item){
    //     rear = (rear + 1) % capacity;  // 10 
    //     array[rear] = item;
    //     currentSize++;
    //     System.out.println("Enqueued: "+item);
    // }

    // public int dequeue(){
    //     int item = array[front];
    //     front = (front+1)% capacity;
    //     currentSize--;
    //     return item;
    // }


}
