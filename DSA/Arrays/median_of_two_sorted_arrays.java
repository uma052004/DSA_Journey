// Java program for median of two sorted arrays 

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int T=m+n;
        int ind2=T/2;
        int ind1=ind2-1;
        int count=0;
        int ind1ele=-1,ind2ele=-1;
        int i=0,j=0;
        while(i<m && j<n)
        { 
           if(nums1[i]<nums2[j])
           {   
            if(count==ind1) ind1ele=nums1[i];
            if(count==ind2) ind2ele=nums1[i];
            count++;
            i++;
           }
           else
           {
            if(count==ind1) ind1ele=nums2[j];
            if(count==ind2) ind2ele=nums2[j];
            count++;
            j++;
           }
        }
        while(i<m)
        {
            if(count==ind1) ind1ele=nums1[i];
            if(count==ind2) ind2ele=nums1[i];
            count++;
            i++;
        }
        while(j<n)
        {
            if(count==ind1) ind1ele=nums2[j];
            if(count==ind2) ind2ele=nums2[j];
            count++;
            j++;
        }
        
       if(T%2==1)
       {
        return (double) ind2ele;
       }
       return (double) ((double)(ind1ele+ind2ele))/2.0;
    }
}
