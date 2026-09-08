import java.util.*;

public class MyString {
    public static void main(String[] args) {
        

      String text = "{()}";

      for(char c : text.toCharArray()){
        if (c == '}') {
            System.out.println("Found");
        }
        System.out.println(c);
      }


      Map<Number, Character> list = new HashMap<>();

      list.put(1, 'D');
      list.put(2, 'I');
      list.put(3, 'S');

      System.out.println(list.containsKey(2));

      System.out.println(list.get(4));
      System.out.println(list.get('D'));

    }
}
