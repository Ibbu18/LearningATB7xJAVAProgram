package ex_07272024;

import java.util.Scanner;

public class lab0128 {
    public static void main(String[] args) {
        //2nd method of creating array
        int [] marks = new int[6];
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        Scanner sc = new Scanner(System.in);
        marks [0]= sc.nextInt();

        marks[1] =89;
        marks[2] =80;
        marks[3] =75;
        marks[4] =92;
        marks[5] =72;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);



    }
}
