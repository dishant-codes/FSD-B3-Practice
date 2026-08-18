public class MyArrayList {
    
    private Object[] elements;
    private int size;

    // default constructor
    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    // parameterized constructor
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elements = new Object[initialCapacity];
        size = 0;
    }


    public void add(Object element){

        if (size == elements.length) {
            resize();
        }

        elements[size] = element;
        size++;
    }

    public Object get(int index){
        
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }


        return elements[index];
    }



    public Object remove(int index){
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException("Invalid Index");
        }

        Object removedElement = elements[index];

        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i+1];
        }

        elements[size - 1] = null;
        size--;

        return removedElement;
    }

    public int size(){
        return size;
    }


    public void resize(){

        Object[] newArray = new Object[elements.length * 2];


        for(int i=0; i< elements.length; i++){
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

}
