package poly;

public class Bank {

    public int getInterestRate(){
        return 5;
    }
}
//
//    Apne purane code mein modification kar:
//
//        Bank class bana (Parent).
//
//        Method: getInterestRate() jo return kare 5.
//
//        SBI class bana (Child of Bank).
//
//        Ye getInterestRate() ko Override kare aur return kare 7.
//
//        HDFC class bana (Child of Bank).
//
//        Ye getInterestRate() ko Override kare aur return kare 9.

   //     Main method mein teeno ka object bana aur rate print kar.