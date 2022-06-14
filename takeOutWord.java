import java.io.*;
import java.util.*;

public class takeOutWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String findStr = in.next();

        String str1 = String.join("", str);
        System.out.println(str1);
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = str1.indexOf(findStr,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
    }
}
