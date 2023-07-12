class Solution {
    HashMap<Integer, Integer> stepMap = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if( n == 1 || n == 2){
            return n;
        }
        
        if(stepMap.containsKey(n)){
            return stepMap.get(n);
        }else{
            int ways = climbStairs(n - 1) + climbStairs(n - 2);
            stepMap.put(n, ways);
            return ways;
        }
    }
}