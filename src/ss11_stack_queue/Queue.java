package ss11_stack_queue;
import java.util.*;

public class Queue {
    Node front;
    Node rear;
    private class Node{
        int data;
        Node link;
    }
    void enQueue(int value){
        Node node = new Node();
        node.data = value;
        if(front==null){
            front = node;
        }else {
            rear.link = node;
            node.link=front;
        }
        rear = node;
        rear.link = front;
    }
    void deQueue(){
        if(front==null){
            System.out.println("Queue is empty!");
        }
        else if(front==rear){
            front = rear = null;
        }else{
            front = front.link;
            rear.link = front;
        }
    }
    void displayQueue(){
        if(front==null){
            System.out.println("Queue is empty!");
        }else {
            Node node = front;
            while(node.link != front){
                System.out.println(node.data + " ");
                node = node.link;
            }
            System.out.println(rear.data);
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.deQueue();
        queue.displayQueue();
    }
}
