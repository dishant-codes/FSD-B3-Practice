
public class MyCode{

    public static void main(String[] args) {
        
        MyHashMap map = new MyHashMap(10);

        map.put(21, 150);
        map.put(32, 200);
        map.put(43, 300);
        map.put(23, 500);
        map.put(41, 100);
        map.put(44, 800);

        System.out.println(map.get(21));
    }

}