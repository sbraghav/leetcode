class Solution {
	public static int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			int num = nums[mid];
			if (num == target) {
				return mid;
			} else if (num > target) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}
}