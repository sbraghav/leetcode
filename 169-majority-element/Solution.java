class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int freq = 0;
        for(int num : nums){
            if(freq == 0){
                element = num;
            }
            if(num == element){
                freq++;
            }else{
                freq--;
            }
        }
        return element;
    }
}