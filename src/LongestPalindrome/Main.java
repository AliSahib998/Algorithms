package LongestPalindrome;


/**
 *
 * @author Ali Sahib
 */

public class Main {
    public static void main(String[] args) {
        String word = "babies";
        System.out.println(longestPalindrome(word));
    }

    private static String longestPalindrome(String s) {

        String check, result = "";

        if (checkPalindrome(s))
            return s;

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                int k = s.indexOf(symbol, j + 1);
                if (k != -1) {
                    check = s.substring(i, k + 1);
                    j = k - 1;
                } else {
                    break;
                }
                if (checkPalindrome(check)) {
                    if (result.length() < check.length()) {
                        result = check;
                    }
                }
            }
        }
        if (result.isEmpty() && !s.isEmpty()) {
            result = "" + s.charAt(0);
        }
        return result;
    }

    private static boolean checkPalindrome(String word) {

        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }


}
