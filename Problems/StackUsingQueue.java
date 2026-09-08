import java.util.*;

public class StackUsingQueue {

    Deque<Integer> q = new ArrayDeque<>();


    public void push(int data){
        q.offer(data);
        for (int i = 0; i < q.size()-1; i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        return q.remove();
    }

    public int peek(){
        return q.peek();
    }

    public boolean isEmpty(){
        return q.isEmpty();
    }

    static void main(String[] args) {

        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        System.out.println("Removed element is "+stack.pop());


    }

}
