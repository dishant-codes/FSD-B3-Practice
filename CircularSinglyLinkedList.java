class CSNode{
    public int data;
    public CSNode next;

    public CSNode(int data){
        this.data = data;
    }
}

public class CircularSinglyLinkedList {
    
    CSNode head;


    void insertAtEnd(int data){
        CSNode newNode = new CSNode(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        CSNode curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head; 
    }

    
    void display(){

        CSNode curr = head;

        if (curr.next == head) {
            System.out.print(curr.data+ " -> ");
        }

        while (curr.next != head) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }

        System.out.print("head");

    }


}
