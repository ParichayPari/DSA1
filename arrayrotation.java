import java.util.Scanner;
//problem asked in the medium level test. rotate the given array clockwise k times
public class arrayrotation {
    //    1 2 3 4 5
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = in.nextInt();

//        calling the
        RotateArray(array, k);
    }
    static void RotateArray(int[] a, int k) {
        int n = a.length;
        k=k%n;

        for(int i = 0; i < n; i++)
        {
            if(i<k)
            {
                System.out.print(a[n + i - k] + " ");
            }
            else
            {
                System.out.print(a[i - k] + " ");
            }
        }
        System.out.println();
    }
}
