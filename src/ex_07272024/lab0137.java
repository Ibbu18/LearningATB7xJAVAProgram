package ex_07272024;

public class lab0137 {
    public static void main(String[] args) {
        int [] salaries = {17,8,25,22,9,7,4,6,20};
        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i<salaries.length; i++){
            if(salaries[i]>max){
                max = salaries[i];
            }
            if(min > salaries[i]){
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
