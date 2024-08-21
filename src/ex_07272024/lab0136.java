package ex_07272024;

import java.util.Scanner;

public class lab0136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextFloat();

        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of sub " + (i + 1) + ": " + marks[i]);
        }
        float avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Avg is->" + avg);

        int j = 0;
        while (j < marks.length) {
            System.out.println(marks[j]);
            j++;
        }
        sc.close();
    }
}
