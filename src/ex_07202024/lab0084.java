package ex_07202024;


import java.util.Scanner;

public class lab0084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day= sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fry");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, What day its");
                break;
        }
        System.out.println("________=====Out side the Switch loop==== _____");
        }
    }

