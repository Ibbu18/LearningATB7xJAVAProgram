package ex_07202024;

import java.util.Scanner;

public class lab0095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);
        //char ch = 'a';
        if (user_input == 'a' || user_input == 'e' || user_input == 'i' || user_input == 'o' || user_input == 'u'){
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");

        }
    }
}



