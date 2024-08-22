package ex_07272024;

public class lab0142 {
    public static void main(String[] args) {
        // String is - Imutable in nature
        // StingBuilder and StringBuffer are mutable in nature

        String s1 = "Ibrahim";
        s1 = "Shaikh";

        StringBuffer stringBuffer =new StringBuffer("Ibrahim");
        //Change the value of string buffer
        stringBuffer.append("Shaikh"); //IbrahimShaikh
        stringBuffer.append("JI");//IbrahimshaikhJJ

        StringBuilder stringBuilder = new StringBuilder("Fatima");
        stringBuilder.append("Shaikh");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse().toString());


    }
}
