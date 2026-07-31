public class NewString {
    public static void main(String[] args) {
        
        StringBuilder name = new StringBuilder("Dishant");

        name.append(" Aarak");
        name.append(" ");
        name.append(", Welcome to upGrad");

        name.reverse();

        System.out.println(name);



        String text = "adcd";

        for(int i = 0; i < 1000; i++){
            text += 'z';
        }


        StringBuilder text2 = new StringBuilder("abcd");

        for(int i = 0; i < 1000; i++){
            text2.append('z');
        }
        
    }
}
