import java.io.*;
import java.util.*;
//Palindrome using recursion.

  class palindrome {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
  System.out.println(isPalindrome(str));

      }
      static boolean isPalindrome(String str) {
          if(str.length() == 0 || str.length() == 1) {
              return true;
          }
          if(str.charAt(0) == str.charAt(str.length()-1)) {
              return isPalindrome(str.substring(1, str.length()-1));
          }
          return false;
      }

  }