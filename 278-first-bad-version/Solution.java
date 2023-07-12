public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        while(start <= end){
            mid = start + ( start - end  )/ 2;
            if(isBadVersion(mid)){
                end  = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}