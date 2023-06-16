package ss10_dsa.arraylist;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Object[] elements;

    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    MyList(int capacity){
        elements = new Object[capacity];
    }
   public void add(int index, E element){
//        ensureCapacity(elements.length);
        ensureCapacity();
        for (int i = index+1; i < size; i++) {
            elements[i + 1] = elements[i];
        }
        elements[index]=element;
        size++;
    }

    E remove(int index){
        for(int i = index; i<size-1; i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return (E) elements[index];
    }
    int size(){
        return size;
    }
    boolean contains(E o){
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }

    int indexOf(E o){
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }
//    boolean add(E o){
//        ensureCapacity(size + 1);  // Increments modCount!!
//        elements[size++] = o;
//        return true;
//    }


//    void ensureCapacity(int minCapacity){
//        if(size>= elements.length){
//            minCapacity=size*2;
//            E[] newElements = (E[]) (new Object[minCapacity]);
//            Arrays.copyOf(elements, minCapacity);
//            elements=newElements;
//        }
//        else minCapacity= elements.length;
//    }

    void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    E get(int i){
        return (E) elements[i];
    }
    void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size=0;
    }
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }
        return result.toString() + "]";
    }
}
