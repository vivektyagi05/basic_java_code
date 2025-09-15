
import java.util.Scanner;

public class details{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  ==================== NAME ====================
        System.out.print("name ->");
        String name = sc.next();

        // ==================== AGE ====================
        System.out.print("age ->");
        int age = sc.nextInt();
    
        // ==================== CGPA ====================
        System.out.print("CGPA -> ");
        float CGPA = sc.nextFloat();

        // ==================== GRADE ====================
        System.out.print("Grade -> ");
        char grade = sc.next().charAt(0);
        
        System.out.println("my name is = > " + name);
        System.out.println("Age = > "+ age);
        System.out.println("My CGPA = > " + CGPA);
        System.out.println("My garde = > " + grade);




    }
}
