package GenericsPrac;


//🧠 Day 7 Task (Generics Challenge)
//        Tujhe ek Container banana hai jo kisi bhi cheez ko hold kar sake.
//        Ek class bana Container<T>.
//
//        Usme ek variable rakh T content.
//        Ek method showContent() bana jo print kare: "Content is: " + content.
//
//        Main method mein:
//        Ek container banao Integer ke liye (Container<Integer>) aur usme 100 daalo.
//        Ek container banao String ke liye (Container<String>) aur usme "Java Pro" daalo.
//        Dono ka content show karo.
//
//        Hint: Class define karte waqt class Container<T> { ... } likhna.
public class Container<T> {

    T content;

    Container(T content){
        this.content=content;
    }

    void showContent(){
        System.out.println("Content is "+ content);
    }

    public static void main(String[] args){
        Container<Integer> containerInt=new Container<>(100);
        containerInt.showContent();

        Container<String> containerStr=new Container<>("Java Pro");
        containerStr.showContent();

    }


}

















