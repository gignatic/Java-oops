package collection;

import java.util.*;

public class ListPrac {

    public static void main(String[] args) {

        //arraylist

        List<Integer> arrList= new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);

        arrList.add(1,100);

        System.out.println(arrList);
        System.out.println(arrList.get(2));

        //Asliyat: remove(int index) method call hoga.
        // Ye Index 1 (jo ki value 10 hai) ko uda dega!
        //
        //Solution: Value remove karne ke liye Object banana padega:
        // list.remove(Integer.valueOf(1));

        //Java ke paas remove ke 2 methods hain:
        //
        //remove(int index) -> Index number se udao.
        //remove(Object obj) -> Value dhund ke udao.

        //remove index
        arrList.remove(1);
        System.out.println(arrList);


        //remove value
        arrList.remove(Integer.valueOf(30));
        System.out.println(arrList);





        //Linked list

        List<Integer> llist = new LinkedList<>();

        llist.add(101);
        llist.add(201);
        llist.add(301);
        llist.add(401);

        System.out.println(llist);

        llist.remove(1);

        System.out.println(llist);
        //ArrayList<int> list = new ArrayList<>()

    }
}
