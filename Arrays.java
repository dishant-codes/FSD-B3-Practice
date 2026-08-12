import java.util.ArrayList;

class Arrays{
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list.get(3));


        System.out.println("Size of Array "+list.size());
        list.remove(2);
        System.out.println("Size of Array "+list.size());
    }
}