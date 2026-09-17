
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



    public static Node insertionSort(Node head){

        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node curr = head;

        while (curr != null || curr.next != null) {
            
            if (curr.data <= curr.next.data) {
                    curr = curr.next;
            }
            else{


                Node toInsert = curr.next;

                //  2 , 3 , 1, 5
                // toinsert = 1
                // curr.next = 5
                //  2, 3, 5 - > null

                // 1

                // dummy -  0 -> 2 -> 3 -> 1 -> 5

                curr.next = toInsert.next;

                Node prev = dummy;


                while (prev.next.data < toInsert.data) {
                    prev = prev.next;
                }


                // 1 -> null


                // prev = 0 -> 2 -> 3 -> 1 -> 5


                // toInsert = 1 -> 2 -> 3 -> 1 -> 5
                // prev = 0 -> 1 -> 2 -> 3 -> 1 -> 5

                toInsert.next = prev.next;
                prev.next = toInsert;

            }
            
        }

        

        return dummy.next;

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

        ll.insertAtBeginning(20);
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(40);
        ll.insertAtBeginning(30);

        // ll.displayList();

        // ll.deleteAtBeginning();
        // ll.deleteByKey(13);

        // System.out.println();
        ll.displayList();
        
        System.out.println();

        ll.reverseList();

        Node sortedList = insertionSort(ll.head);


        Node curr = sortedList;
        while (curr != null) {
            System.out.print(curr.data+ "-> ");
            curr = curr.next;
        }
        System.out.print("Null");

        /// current = 40 -> 30 -> 20 -> 10 - > null current = 30 -> 20 -> 10 - > null
    }

}