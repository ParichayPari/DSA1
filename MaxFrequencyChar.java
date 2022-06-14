import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequencyChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();// this only takes
        // the nextLine() takes string including the spaces in-between.
        HashMap<Character, Integer> map= new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                int of= map.get(ch);
                int nf = of +1;
                map.put(ch, nf);//updating hashmap with current frequency of the character.
            } else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

         char mfc = s.charAt(0);
         for(Character key: map.keySet()) {
             if(map.get(key) > map.get(mfc)) mfc = key;
         }
         System.out.println(mfc);
    }
}

