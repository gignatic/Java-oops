package collection;

//Problem: List ko sort mat karo, bas ek loop mein batao sabse bada aur sabse chhota number kaunsa hai.
//
//Input List: [15, 3, 90, 4, 2]
//Logic:
//Do variables banao: min = list.get(0), max = list.get(0).
//Loop chalao (Index 1 se end tak).
//Agar currentValue < min -> min update karo.
//Agar currentValue > max -> max update karo.
//Print: "Min: 2, Max: 90".

import java.util.ArrayList;

public class maxminfind {
    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(15);
        originalList.add(3);
        originalList.add(90);
        originalList.add(4);
        originalList.add(2);

        int min=99;
        int max=0;


        for(Integer x:originalList){
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
        }

        System.out.println(min);

        System.out.println(max);

    }
}
