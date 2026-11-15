class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        for(int num : nums){
            int count = 0;
            for(int i = 0;i<n;i++){
                if(nums[i]==num){
                    count++;
                }
            }

            if(count>n/2){
                return num;
            }
        }
        return -1;
    }
}