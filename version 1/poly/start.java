package poly;

public class start {

    public static void main(String[] args){
        Bank b=new Bank();
        System.out.println("R Bank "+b.getInterestRate());

        SBI s=new SBI();
        System.out.println("SBI "+s.getInterestRate());

        HDFC hd=new HDFC();
        System.out.println("HDFC "+hd.getInterestRate());
    }
}
