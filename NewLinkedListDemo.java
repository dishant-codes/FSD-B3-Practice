import java.util.LinkedList;


class NewLinkedListDemo{


    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);

        list.display();

    }

}