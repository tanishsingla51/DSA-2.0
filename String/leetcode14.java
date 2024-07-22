// good thinking

package String;

public class leetcode14 {

    public static String longestCommonPreffix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Start with the first string as the initial prefix
        String prefix = strs[0];

        // Iterate through the remaining strings
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix to the common part with the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
        
    }

    public static void main(String[] args) {
        
        String[] s = { "flower", "flow", "flight" };

        System.out.println(longestCommonPreffix(s));
    }
}
