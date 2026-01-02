public class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void checkPass() {
        if (this.marks > 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }


        public static void main(String[] args) {
            Student s=new Student("karan",34);
            s.checkPass();

            Student s2=new Student("rishav",100);
            s.checkPass();
        }
    }

//}

