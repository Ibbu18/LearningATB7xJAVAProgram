package ex_07202024;

import java.util.Scanner;

public class lab0093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
         
        if(num>0) {
            System.out.println("Number is Positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("zero");
            
        }
    }
    }

