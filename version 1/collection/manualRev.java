package collection;


//Question 4: Manual Reverse (Ulta Pulta)
//Scenario: Interviewer ne bola: "Collections.reverse() use mat karna.
// Khud ka logic likho list ko ulta karne ka."
//
//Input List: ["A", "B", "C", "D"]
////Task: Ek Nayi List banao.
//Purani list ko Piche se (Last index se 0 tak) iterate karo.
//Jo element mile, usse nayi list mein add karte jao.
//(Hint: for (int i = size-1; i >= 0; i--))
//Print: Reversed List.

import java.util.ArrayList;

public class manualRev {

    public static void main(String[] args) {

        ArrayList<String> oldList=new ArrayList<>();
        oldList.add("A");
        oldList.add("B");
        oldList.add("C");
        oldList.add("D");

        ArrayList<String> revList=new ArrayList<>();

        int n=oldList.size();
        for(int i=n-1;i>=0;i--){
            revList.add(oldList.get(i));
        }

        System.out.println(oldList);
        System.out.println(revList);

    }

}
