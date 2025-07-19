public class _05_Valid_Palindrome {
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while (left<right){
            while (left<right&& !Character.isLetterOrDigit(s.charAt(left))){
                //condition becomes right if the character is NOT a letter or digit from left.
                left++;
            }
            while (left<right&& !Character.isLetterOrDigit(s.charAt(right))){
                //condition becomes right if the character is NOT a letter or digit from left.
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                //run  if character from left and right side comes different
                return false;
            }

            //move left and right position
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        _05_Valid_Palindrome solution = new _05_Valid_Palindrome();

        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solution.isPalindrome("race a car"));                     // false
        System.out.println(solution.isPalindrome(" "));                              // true

    }
}
