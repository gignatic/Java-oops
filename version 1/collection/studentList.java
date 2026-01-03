package collection;


//Ek ArrayList banao Integers ki.
//
//Usme ye Roll Numbers add karo: 101, 102, 103, 104, 105.
//Task A: Roll Number 103 absent hai, usse list se remove karo.
//(Hint: Dhyan rakhna remove index se na ho jaye!)
//Task B: Roll Number 102 (Index 1) galti se likh diya tha, usse update karke 200 kar do.
//Final list print karo.

import java.util.ArrayList;
import java.util.List;

public class studentList {

    public static void main(String[] args) {

        List<Integer> rollNo=new ArrayList<>();
        rollNo.add(101);
        rollNo.add(102);
        rollNo.add(103);
        rollNo.add(104);
        rollNo.add(105);


        rollNo.remove(Integer.valueOf(103));

//        rollNo.remove(1);
//        rollNo.add(1,200);
        rollNo.set(1,202);

        System.out.println(rollNo);


    }
}












