package collection;


import java.util.ArrayList;

//Problem: Interviewer ne bola: "Set interface use karna allowed NAHI hai.
// ArrayList se duplicates hatao."
//
//Input List: [10, 20, 10, 30, 20, 40]
//Logic:
//Ek nayi khali list banao uniqueList.
//Original list pe loop chalao.
//Check karo: Agar item uniqueList mein NAHI hai (!uniqueList.contains(item)), tabhi add karo.
//Result: [10, 20, 30, 40]
public class removeDuplicate {

    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(10);
        originalList.add(30);
        originalList.add(20);
        originalList.add(40);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for(Integer x:originalList){
            if(!uniqueList.contains(x)){
                uniqueList.add(x);
            }
        }

        System.out.println(originalList);

        System.out.println(uniqueList);

    }
}
