
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class NewLinkedList {
    Node head;

    public NewLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtBeginning(){
        head = head.next;
    }

    public void deleteByKey(int key){
        Node current = head;

        if (current.data == key) {
            head = head.next;
            return;
        }
        
        while (current != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        } 
    }

    public void displayList() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data + " -> ");
            current = current.next;

        }
        System.out.print("null");

    }


    public void reverseList(){

        Node current = head;
        Node prev = null;

        while (current != null) {
            Node newNode = current.next;
            current.next = prev;
            prev = current;
            current = newNode;
        }



        while (prev != null) {
            System.out.print(prev.data + " -> ");
            prev = prev.next;
        }
        
    }

    public static void main(String[] args) {
        NewLinkedList ll = new NewLinkedList();

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);
        ll.insertAtBeginning(40);

        // ll.displayList();

        // ll.deleteAtBeginning();
        // ll.deleteByKey(13);

        // System.out.println();
        ll.displayList();
        
        System.out.println();

        ll.reverseList();

        /// current = 40 -> 30 -> 20 -> 10 - > null current = 30 -> 20 -> 10 - > null
    }

}