import java.io.*;
import java.util.*;

class zigzag {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int M,N;
        M=sc.nextInt();
        N=sc.nextInt();
        int[][] matrix = new int[M][N];
        //values insertion into the matrix.
        for(int i=0; i<M; i++)
            for(int j=0; j<N; j++)
                matrix[i][j] = sc.nextInt();
//calling method for zigzag traversal
        zigzagTraversal(matrix, M, N);

    }

    public static void zigzagTraversal(int arr[][], int m, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(n+m-1);
        for(int i = 0; i < n + m - 1; i++)
        {
            ans.add(new ArrayList<Integer>());
        }
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++) {
                (ans.get(i+j)).add(arr[i][j]);
            }
        }
        for (int i = 0; i < ans.size(); i++)
        {
            for (int j = ans.get(i).size() - 1; j >= 0; j--)
            {    System.out.print(ans.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }

}