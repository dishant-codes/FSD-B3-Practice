import org.w3c.dom.Node;

public class MyHashMap {
    
    class Node{

        int key;
        int value;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }

    }

    // 0=[key,value]
    // 1=[key,value]
    // [key,value]
    // [key,value]
    // [key,value]
    // [key,value]

    private Node[] buckets;
    private int size;

    public MyHashMap(int size){
        this.size = size;
        this.buckets = new Node[size];
    }


    private int hash(int key){
        return key % size;
    }

    public void put(int key, int value){

        int index = hash(key);

        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }



    public int get(int key){
        int index = hash(key);
        
        Node head = buckets[index];

        while (head != null) {            
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1;
    }




    public static void main(String[] args) {
        
        MyHashMap map = new MyHashMap(10);

        map.put(21, 150);
        map.put(32, 200);
        map.put(43, 300);
        map.put(23, 500);
        map.put(41, 100);
        map.put(44, 800);

        System.out.println(map.get(41));

    }

}
