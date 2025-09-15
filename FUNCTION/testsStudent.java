class Student{
    String name ;
    int age ;

    void diplayDetails(){
        System.out.println("name "+ name+ ",age "+age);
    }
}

public class testsStudent{

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "hardik";
        s1.age =  22;

        s1.diplayDetails();
        
    }
}
