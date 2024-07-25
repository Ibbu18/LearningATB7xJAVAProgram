package ex_07202024;

public class lab0088 {
    public static void main(String[] args) {
        int itemCode =005;
        switch (itemCode){
            case 001 -> System.out.println("Its a loptop");
            case 002 -> System.out.println("Its a Desk top");
            case 003,004 -> System.out.println("Its a mobile phone!");
            default -> System.out.println("Hello !");
        }
    }
}
