package collection;

import java.util.ArrayList;
import java.util.List;

//Question 3: The Even Filter (Chun chun ke nikalo) 🧐
//Scenario: Tere paas ek ArrayList hai mixed numbers ki.
// Tujhe usme se Even numbers nikal kar nayi list mein daalne hain.
//Input List: [10, 5, 20, 7, 30, 9]
//Logic: Loop chalao.
//Agar number Even (num % 2 == 0) hai, toh usse evenList naam ki nayi ArrayList mein daal do.
//Print: "Original: ..." aur "Filtered Even: ..."
public class evenFilter {

    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(5);
        originalList.add(20);
        originalList.add(7);
        originalList.add(30);
        originalList.add(9);


        ArrayList<Integer> evenList = new ArrayList<>();

        for(Integer x:originalList){
            if(x%2==0){
                evenList.add(x);
            }
        }

        System.out.println(originalList);

        System.out.println(evenList);


    }

}



















