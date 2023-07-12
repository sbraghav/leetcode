class Solution {
    public static int longestPalindrome(String s) {
        int palindromeLen = 0;
        boolean midChar = false;
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(Character c : s.toCharArray()){
            int currCharCount = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, currCharCount + 1);
        }
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            int value = (int)entry.getValue();
            if(value % 2 == 0){
                palindromeLen += value;
            }else{
                midChar = true;
                palindromeLen += value - 1;
            }
        }
        return midChar ? palindromeLen + 1 : palindromeLen;
    }
}