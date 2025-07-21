import java.util.*;
public class _07_Valid_Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter first string (s): ");
        String s = scanner.nextLine().toLowerCase(); // to ensure lowercase

        System.out.print("Enter second string (t): ");
        String t = scanner.nextLine().toLowerCase(); // to ensure lowercase

        // Call isAnagram method
        boolean result = isAnagram(s, t);

        // Print output
        System.out.println("Output: " + result);

        scanner.close();

    }
}
