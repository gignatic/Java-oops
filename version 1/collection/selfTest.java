package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class selfTest {

    public static void main(String[] args){

        List<Integer> arr=new ArrayList<>();

        arr.add(90);
        arr.add(50);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr,(a,b)-> b-a);
        System.out.println(arr);



        Collections.reverse(arr);
        System.out.println(arr);

        int mx=Collections.max(arr);
        int mn=Collections.min(arr);

        System.out.println("max "+mx+ " min "+ mn);


    }
}
