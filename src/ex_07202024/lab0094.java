package ex_07202024;

import java.util.Scanner;

public class lab0094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num1");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Num2");
        int num2 = sc.nextInt();
        System.out.println("Enter Your Num3");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3) {
            System.out.println("number 1 is largest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("number 2 is Largest");
        }else {
            System.out.println("number 3 is largest");
            
        }
    }


    }

