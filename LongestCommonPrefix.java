import java.io.*;
import java.util.*;
import java.lang.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"geeksforgeeks", "geeks", "geek", "geezer"};
              String res = findLongestPrefixString(s);
       System.out.println(res);
    }

    public static String findLongestPrefixString(String[] strs) {
        String prefitStr = "";
        for(int i=0;i<strs[0].length();i++){//outer loop run 0 to each word's length
            for(int j=0;j<strs.length;j++){ // runs 0 to whole string array length
                if(!strs[j].startsWith(prefitStr + strs[0].charAt(i))){
                    return prefitStr;
                }
            }
           prefitStr = prefitStr + strs[0].charAt(i);
        }
        return prefitStr;
    }
}