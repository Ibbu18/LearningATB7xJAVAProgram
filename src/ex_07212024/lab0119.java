package ex_07212024;

import java.util.Scanner;

public class lab0119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number , will print factorial");
        int n = sc.nextInt();

        int fact =1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
        }
    }

