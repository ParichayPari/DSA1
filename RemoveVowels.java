import java.io.*;
import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "asejhkilmPODU";
        remove(s);
    }
    static void remove(String str) {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }
        System.out.println(sb.toString());
    }
}
