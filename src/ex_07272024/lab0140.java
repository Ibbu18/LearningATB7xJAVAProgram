package ex_07272024;

public class lab0140 {
    public static void main(String[] args) {
        int[][] array_2d ={
                {1,2,},
                {3,4,},
                {5,6,}
        };
        // R- 3 - i->0 to 1
        // C -2 - j->0 to 1
        for (int i = 0; i < array_2d.length; i++){
            for(int j =0; j<array_2d[i].length;j++){
                System.out.print(array_2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}


