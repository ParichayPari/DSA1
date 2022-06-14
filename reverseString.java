import java.util.Scanner;
// String reversal using recursion.
public class reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(stringReverse(s));
    }
    static String stringReverse(String str) {
        if(str.equals("")) return "";
        return stringReverse(str.substring(1)) + str.charAt(0);
    }
}
