import java.util.Scanner;

class firstday {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String user_input = sc.next();
    if(user_input.equals("+")){
        System.out.println(a+b);
    } 
    else if(user_input.equals("-")){
        System.out.println(a-b);
    } 
    else if(user_input.equals("*")){
        System.out.println(a*b);
    } 
    else if(user_input.equals("/")){
        if(b == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }
        System.out.println(a/b);
    } 
    else {
        System.out.println("Invalid operation");
    }


    // ==================== Assignment 1 ====================
// 1. Write a program to take two integers and an operator as input from the user  

    









}
}







