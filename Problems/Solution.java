import java.util.*;

class Solution{

    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>(); 
        Map<Character, Character> pairs = new HashMap<>();

        pairs.put('}','{');
        pairs.put(')','(');

        // s = "{()}";

        //  s = ['{', '(', ')', '}']
        for(char c : s.toCharArray()){

            if (pairs.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != pairs.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        

        Solution check = new Solution();

        System.out.println(check.isValid("{()}"));


    }
    
}