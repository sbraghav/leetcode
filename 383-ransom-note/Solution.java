class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //get charecter count maps of ransomnote and magazine
        HashMap<Character, Integer> ransomCharMap = getCharCountMap(ransomNote);
        HashMap<Character, Integer> magazineCharMap = getCharCountMap(magazine);
        //iterate over the ransomNote keyset and check whether the count of each charecter is less than
        //what is present in the magazine charecter map
        Set<Map.Entry<Character, Integer>> ransomCharSet = ransomCharMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = ransomCharSet.iterator();
        while(it.hasNext()){
            Map.Entry<Character, Integer> entry = it.next();
            Character c = entry.getKey();
            if(!magazineCharMap.containsKey(c) || magazineCharMap.get(c) < entry.getValue()){
                return false;
            }
            
        }
        return true;
    }

        public HashMap<Character, Integer> getCharCountMap(String s){
            HashMap<Character, Integer> charMap = new HashMap<>();
            for(char c : s.toCharArray()){
                if(charMap.containsKey(c)){
                    charMap.put(c, charMap.get(c) + 1);
                }else {
                    charMap.put(c, 1);
                }
            }
            return charMap;
    }
}