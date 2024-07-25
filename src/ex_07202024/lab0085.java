package ex_07202024;

import java.util.Scanner;

public class lab0085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser name !!, Where you want to execute the program!");
        String browserName=sc.next();
        browserName=browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "fire fox":
                System.out.println("Starting the fire fox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser it is");
                break;
        }
    }
}
