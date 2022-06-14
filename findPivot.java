public class findPivot {
    public static void main(String[] args) {
        int[] array = {1,2,3};

       int ans = findpivotpoint(array);
       System.out.println(ans);
    }

    public static int findpivotpoint(int[] array) {
        int tsum = 0, pivot =0;
        for (int i = 0; i < array.length; i++) {
            tsum += array[i];
        }
        int lsum = 0, rsum=0;
        for (int i = 0; i < array.length; i++) {
            lsum += array[i];
            
            if(rsum == tsum-lsum) {
                pivot =array[i];
                break;
            }
        }
        if(pivot ==0) return -1;
        return pivot;
    } 
}