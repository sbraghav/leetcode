import java.util.HashMap;

class Scratch {
    public static HashMap<Character, Integer> getCharMap(String s){
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c : s.toCharArray()){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }else {
                charMap.put(c, 1);
            }
        }
        return charMap;
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charMap1 = getCharMap(s);
        HashMap<Character, Integer> charMap2 = getCharMap(t);
        return charMap1.equals(charMap2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}