class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
       for(int i=0;i<nums.size()-1;i++)
       {
        if(nums.get(i)>nums.get(i+1))
        {
            return false;
        }
       }
       
       return true;
    }
}
