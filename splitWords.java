import java.io.*;
import java.util.*;
// {"This", "is", "Kolkata"}
public class splitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}