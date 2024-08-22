package ex_07272024;

public class lab0141 {
    public static void main(String[] args) {
        int[][] array_2d ={
                {32,12,10,20},
                {24,11,9, 22},
                {44,13,8, 30}
        };
        // R- 3 - i->0 to 2
        // C -4 - j->0 to 3
        for (int i = 0; i < array_2d.length; i++){
            for(int j =0; j<array_2d[i].length;j++){
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}


