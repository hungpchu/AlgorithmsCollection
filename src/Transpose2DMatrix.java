public class Transpose2DMatrix {

    public static void main(String[] args){

        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);

        int[][] a = new int[row][col];

        int val = 1;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                a[i][j] = val;
                val++;
            }
        }

        for( int i = 0; i < col; i++){
            for( int j = 0; j  < row; j++){
                System.out.print(a[j][i]);
            }
            System.out.println();
        }

    }
}
