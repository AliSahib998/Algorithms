package LongestSubstring;

/**
 *
 * @author Ali Sahib
 */

public class Main {

    public static void main(String[] args) {
        String s = "abcabca";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        String eq ="";
        int result = 0;

        for(int i=0;i<s.length();i++) {
            char symbol = s.charAt(i);
            if(!eq.contains(""+symbol)) {
                eq+=symbol;
                if(eq.length()>result) {
                    result = eq.length();
                }
            }
            else {
                int first = eq.indexOf(symbol);
                eq = eq.substring(first+1);
                eq+=symbol;
            }
        }
        return result;
    }


}
