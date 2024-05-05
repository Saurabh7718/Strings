public class Subsequence {
    static boolean isSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int j = 0;

        // Traverse str2 and check if characters of str1 are present in str2 in the same order
        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }

        // If all characters of str1 were found in str2 in the same order
        return j == m;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        if (isSubsequence(str1, str2)) {
            System.out.println(str1 + " is a subsequence of " + str2);
        } else {
            System.out.println(str1 + " is not a subsequence of " + str2);
        }
    }
}
