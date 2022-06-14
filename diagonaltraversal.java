import java.io.*;
import java.util.*;

class diagonaltraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int sumLeft = 0;
        int sumRight = 0;
        int[][] squareMatrix= new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                squareMatrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i==j)
                    sumLeft = sumLeft + squareMatrix[i][j];//for left diagonal.

            }
        }
        System.out.print(sumLeft + " ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                // Condition for right diagonal
                if ((i + j) == (N - 1)) {
                    sumRight = sumRight + squareMatrix[i][j];
                }
            }
        }
        System.out.print(sumRight);
    }
}