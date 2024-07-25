package ex_07202024;

public class lab0087 {
    public static void main(String[] args) {
        int itemcode  = 005;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default:
                System.out.println("None");

        }

    }
}
