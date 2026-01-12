class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int n=nums.length;
        // xor all numbers from 1 to n 
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        //xor all ele in the array
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}
