import java.io.*;
import java.util.*;
/*
Given a string S, you have to find the length of the longest substring of S containing all unique characters, i.e, no character is repeating within that substring.
For example, for input string S = "abca", the output is 3 as "abc" is the longest substring with all distinct characters. */

public class LongestDistinctcharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-- > 0) {
        String S = in.next();
        System.out.println(longestDistinctStringLen(S));
            }                 
	}
    public static int longestDistinctStringLen(String S) {
        HashMap<Character, Integer> substr = new HashMap<>();
        int l=0, max=0;
        for (int i = 0; i <S.length() ; i++) {
            char c = S.charAt(i);
            if(substr.containsKey(c)) {
                l= Math.max(l,substr.get(c)+1);
            }
            substr.put(c,i);
            max = Math.max(max, (i-l+1));
        }
        return max; 
    }
}