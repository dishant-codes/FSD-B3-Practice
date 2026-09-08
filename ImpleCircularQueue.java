public class ImpleCircularQueue {
    public static void main(String[] args) {
        CircularQueue cQueue = new CircularQueue(4);

        cQueue.enQueue(5);
        cQueue.enQueue(6);
        cQueue.enQueue(2);
        cQueue.enQueue(7);
    }
}
