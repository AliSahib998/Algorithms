package LongestCommonPrefix;

/**
 *
 * @author Ali Sahib
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String [] array ={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(array));
    }

    private static String longestCommonPrefix(String[] str) {
        if(str.length == 0) return "";
        String first = str[0];
        String result;
        int count = 0;
        for(int i=1;i<str.length;i++) {
            String second = str[i];
            result = "";
            int k = Math.min(first.length(), second.length());
            for (int j=0;j<k;j++) {
                char w = first.charAt(j);
                if(second.charAt(j) == w) {
                    if(count == j) result+=w;
                    count++;
                }
            }
            first = result;
            count = 0;
        }

        return first;
    }




}
