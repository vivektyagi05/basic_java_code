
import java.util.Scanner;

public class prime {
    
    
    void checkprime(int n){
        boolean result = true;
        if (n <= 1) {
            result  = false;
        } 
        for (int i = 2; i < n; i++) {
            if( n % i ==0){
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime chech = new prime();
        chech.checkprime(num);
        
    }
}
