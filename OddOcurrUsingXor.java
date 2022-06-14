public class OddOcurrUsingXor {
    public static int findOddOccuring(int[] nums)
    {
        int xor = 0;
        for (int i: nums) {
            xor = xor ^ i;
        }
 
        return xor;
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 2, 2, 1, 1, 3, 3, 2, 2, 4, 4, 3, 1, 1 };
 
        System.out.println("The odd occurring element is " + findOddOccuring(nums));
    }
}