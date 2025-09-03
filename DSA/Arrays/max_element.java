class Solution {
    public int largestElement(int[] nums) {
       int maxi=Integer.MIN_VALUE;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
          maxi=Math.max(maxi,nums[i]);
       }
       return maxi;
    }
}
