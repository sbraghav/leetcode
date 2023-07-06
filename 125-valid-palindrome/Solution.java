class Solution {
    public static boolean validPalindrome(String s){
        if(s.length() < 2){
            return true;
        }
        String left = s.substring(0, s.length()/2);
        String right = s.substring((s.length()+1)/2);
        return left.equals(
                new StringBuilder(right)
                        .reverse().
                        toString()
        );
    }
    public static boolean isPalindrome(String s) {
        String truncated = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return validPalindrome(truncated);
    }

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
