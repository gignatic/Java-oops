package collection;


//Question 2: The Browser History (LinkedList Special) 🌐
//Scenario: Browser history maintain karni hai jahan hum aksar "Sabse Pehle"
// aur "Sabse Aakhri" page dekhte hain.
//
//Ek LinkedList banao Strings ki.
//Usme add karo: "google.com", "youtube.com".
//Task A: "facebook.com" ko list ke sabse start (index 0) mein add karo.
//(Hint: LinkedList ka special method use karna jo O(1) ho).
//Task B: "instagram.com" ko list ke sabse end mein add karo.
//Loop chala ke print karo: "Visited: [URL]".

import java.util.LinkedList;
import java.util.List;

public class browerhist {

    public static void main(String[] args) {
        LinkedList<String> history=new LinkedList<>();

        history.add("google.com");
        history.add("youtube.com");

        history.addFirst("facebook.com");

        history.addLast("instagram.com");

        for(String x:history){
            System.out.println(x);
        }
    }
}















