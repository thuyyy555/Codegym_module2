package ss10_dsa.arraylist;

import java.util.*;

public class MyListTest{
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);
        myList.add(4, 5);
        myList.add(5, 6);
        myList.add(6, 7);
        myList.add(7, 8);
        myList.add(8, 9);
        myList.add(9, 10);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(10, 11);
        System.out.println(myList);
        System.out.println(myList.size());
    }

}
