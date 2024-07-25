package ex_07202024;

import java.util.Scanner;

public class lab0079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int user_input=sc.nextInt();

        System.out.println(user_input);

        if(user_input%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
