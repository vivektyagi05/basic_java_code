
import java.util.Scanner;

public class second_day {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String user_input = sc.next();

        if(user_input.equals("add"))
        {
            b += a;
            System.out.println(b);
        }
        else if(user_input.equals("sub"))
        {
            b -= a;
            System.out.println(b);
        }
        else if(user_input.equals("mul"))
        {
            b *= a;
            System.out.println(b);
        }
        else if(user_input.equals("div"))
        {
            if(a == 0) {
                System.out.println("Division by zero is not allowed");
                return;
            }
            b /= a;
            System.out.println(b);
        }
        else
        {
            System.out.println("Invalid operation");
        }
        
    }
}
