import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> posMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            posMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int remainder = target - num;
            if (posMap.containsKey(remainder) && posMap.get(remainder) != num) {
                return new int[]{i, posMap.get(remainder)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3, 3}, 6));
    }
}