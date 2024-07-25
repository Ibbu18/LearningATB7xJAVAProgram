package ex_07202024;

import java.util.Scanner;

public class lab0086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char , i will tel you , if it is vowel or not");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel, its consonant");
        }
        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel , it is consonant");


        }

    }
}
