class StackUsingArray{

    private int top;
    private int[] stackArray;
    private int maxSize;


    public StackUsingArray(int size){
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int value){

        if (isFull()) {
            System.out.println("Stack is overflow, cannot push "+value);
            return;
        }
        stackArray[++top] = value;        
    }

    public int pop(){
        
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }
    

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1); // false
    }


    public void display(){
        
        for(int x : stackArray){
            System.out.println(x);
        }
    }

}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


class StackUsingLinkedList{

    private Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public boolean isEmpty(){
        return top == null;
    }


    public int pop(){

        if (isEmpty()) {
            System.out.println("Stack is Empty. cannot pop");
            return -1;
        }

        int temp = top.data;
        top = top.next;

        // top = 10 -> 20 -> 30 -> null
        // top.next = 20 -> 30 -> null

        // 10 -> 20 -> 30 -> null
        // 20 -> 30 -> null

        return temp;
    }


    public int peek(){
        return top.data;
    }
    

}

class StackImp{

    public static void main(String[] args) {
        
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("old peek = "+stack.peek());

        // stack.push(60);

        System.out.println("removed = "+stack.pop());

        System.out.println("new peek = "+stack.peek());


        stack.pop();
        stack.pop();

        stack.push(54);
        stack.push(56);
        stack.push(57);

        stack.display();





        // Stack using Linkedlist


        // StackUsingLinkedList stack = new StackUsingLinkedList();


        // stack.push(50);
        // stack.push(60);
        // stack.push(70);
        // stack.push(80);
        // stack.push(90);
        // stack.push(100);
        // stack.push(110);
        // stack.push(120);

        // System.out.println(stack.pop()+" is popped from stack");

        // System.out.println(stack.peek()+ " is peek");

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();

    }
}