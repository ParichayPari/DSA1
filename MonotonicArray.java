import java.util.Scanner;
public class MonotonicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= in.nextInt();
        }
     boolean res = checkIfMonotonous(a);
        if(res ==true) System.out.println("Monotonous");
        else System.out.println("Not monotonous");

    }
    static boolean checkIfMonotonous(int[] a) {
        int j =0;
        boolean inc = true, dec= true;
        ;
        for (int i = 0; i <a.length-1 ; i++) {
            j=i+1;
            if(a[i]>a[j]) {
                inc = false;
            }
        }
        for (int i = 0; i <a.length-1 ; i++) {
            j =i+1;
            if(a[i]<a[j]) dec = false;
        }
        return inc || dec;
    }
}
