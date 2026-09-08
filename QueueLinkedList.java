class QLNode{
    int data;
    QLNode next;

    public QLNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class QueueLinkedList {

    private QLNode front;
    private QLNode rear;


    public QueueLinkedList(){
        this.front = null;
        this.rear = null;
    }


    public void enqueue(int value){
        QLNode newNode = new QLNode(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        }else{
            // 10 , 20 , 30,  40,  50, 60, 70

            // newNode = 60
            // rear = 50
            // rear.next = newNode
            // rear = newNode

            // newNode = 70
            // rear = 60
            // rear.next = 70

            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue(){
        front = front.next;
        if (front == null) {
            rear = null;     
        }
    }


}
