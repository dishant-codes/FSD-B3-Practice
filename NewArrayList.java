public class NewArrayList {
    
    private int[] array;
    private int size;
    private int capacity;


    public NewArrayList(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = -1;
    }


    public void add(int value){
        if (size == array.length - 1) {
            resize();
        }
        array[++size] = value;
    }

    public void resize(){
        int[] newArray = new int[array.length * 2];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int remove(){
        return array[size--];
    }

    public void display(){
        
        for(int i = 0; i <= size; i++){
            System.out.println(array[i]);
        }


    }

    public static void main(String[] args) {
        
        NewArrayList list = new NewArrayList(5);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        list.display();

    }

}
