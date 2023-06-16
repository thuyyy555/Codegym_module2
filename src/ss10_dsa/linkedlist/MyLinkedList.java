package ss10_dsa.linkedlist;

public class MyLinkedList<E> {
    Node head;
    Node tail;
    int numNodes = 0;
    MyLinkedList(E element){
        head= new Node(element);
    };
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    };
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    };
    public void addLast(E e){
        Node temp = tail;
        tail = new Node(e);
        tail.next = temp;
        numNodes++;
    };
//    public E remove(int index){};
//    public boolean remove(Object e){};
//    public int size(){
//        return size;
//    };
//    public E clone(){};
//    public boolean contains(E o){};
//    public int indexOf(E o){};
//    public boolean add(E e){};
//    public void ensureCapacity(int minCapacity){};
//    public E get(int i){};
//    public E getFirst(){};
//    public E getLast(){};
//    public void clear(){};
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
