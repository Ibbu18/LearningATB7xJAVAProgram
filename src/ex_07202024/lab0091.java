package ex_07202024;

import java.util.Scanner;

public class lab0091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter you salary");
        double salary = sc.nextDouble();
        System.out.println("your details are" +name);
        System.out.println("your details are" +age);
        System.out.println("your details are" +salary);
        sc.close();

    }
}
