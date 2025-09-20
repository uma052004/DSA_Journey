// Java Program to remove duplicates elements from sorted array 

import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
      int i=0;
      for(int j=1;j<nums.length;j++)
      {
        if(nums[j]!=nums[i])
        {
            nums[i+1]=nums[j];
            i++;
        }
      }
      return (i+1);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

    }
}