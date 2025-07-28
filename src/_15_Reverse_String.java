import java.util.*;
public class _15_Reverse_String {
    public void reverseString(char[] s){
        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        _15_Reverse_String solution = new _15_Reverse_String();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);

        // Print the reversed array
        System.out.println("Output: " + Arrays.toString(s));  // Optional: for debugging
        // OR print as a word:
        System.out.print("Reversed string: ");
        for (char c : s) {
            System.out.print(c);
        }

    }
}
