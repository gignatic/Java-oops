public class Employee {


    private int salary;

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        if(salary>0){
            this.salary=salary;
        }
        else {
            System.out.println("Invalid");
        }

    }

    public  static void main(String[] args){

        Employee e=new Employee();

        e.setSalary(500);
        System.out.println("Current Balance: " + e.getSalary());
    }

}
//Variable: private int salary.
//
//        Method: setSalary(int s) banao.
//
//        Condition: Agar salary < 0 hai, to print karo "Invalid Salary".
//
//        Agar salary > 0 hai, to set kar do.
//
//        Method: getSalary() banao jo salary return kare.
//
//        Main method mein salary ko -100 set karne ki koshish kar aur dekh kya hota hai.