public class leetcode_nov17_2025 {
    class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int[] indx = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                indx[j++] = i;
            }
        }
        for(int i = 0; i < j-1; i++){
            if((indx[i+1]-indx[i]-1) < k){
                return false;
            }
        }

        return true;
    }
}
}

// improved version (Less time and space complexity)

class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int cnt = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                if(flag){
                    if(cnt < k) {
                        return false;
                    }
                    else{
                        cnt = 0;
                    }
                }
                else{
                    flag = true;
                    cnt = 0;
                }
            }
            else {
                if(flag) cnt++;
            }
        }

        return true;
    }
}
