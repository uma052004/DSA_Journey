class Solution {
    public int secondLargestElement(int[] nums) {
      int slar=Integer.MIN_VALUE;;
      int lar=Integer.MIN_VALUE;
     
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>lar)
        {
            slar=lar;  
            lar=nums[i];
        }
        else if(nums[i]<lar && nums[i]>slar)
        {
            slar=nums[i];
        }
      }
     return slar==Integer.MIN_VALUE?-1:slar;
    }
}
