class MyLinkedList{

    class Node{
        public int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    Node head;

    public void insertAtBegin(int data){        
        Node newNode = new Node(data); // 20->null

         // head = 10 -> 30 -> 40 -> null
         // newNode -> 10 -> 30 -> 40 -> null
         //newNode = 20 -> 10 -> 30 -> 40 -> null
        newNode.next = head;


        // head = 20 -> 10 -> 30 -> 40 -> null
        head = newNode;
    }


    public void deleteNode(int key){

        Node temp = head;
         
        if (temp.data == key) {
            head = temp.next;
            return;
        }


        // temp = 20 -> 10 -> 30 -> 40 -> null
        // key = 30

        while(temp != null){
            
            //  temp-> 10 -> 30 -> 40 -> null 
              // 10 == key

            
            
              //    30 == key
            if (temp.next.data == key) {
                temp.next = temp.next.next;

                // temp -> 10 -> 30 -> 40 -> null  
                // 10 -> 40 -> null
                return;
            }
            
            // temp -> 10 -> 30 -> 40 -> null 
            temp = temp.next;
        }

    }


    public void display(){
        Node current = head;

        while (current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }

        System.out.print("null");

    }

    public static void main(String[] args) {
    
        MyLinkedList list = new MyLinkedList();

        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);
        list.insertAtBegin(60);
        list.insertAtBegin(70);

        list.display();

        list.deleteNode(50);
        System.out.println();

        list.display();
    
    }
}