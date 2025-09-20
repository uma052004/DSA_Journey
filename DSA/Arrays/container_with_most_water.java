//Java Program for Container with most water

class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int left=0;
        int right=height.length-1;
        
      
            while(left<right)
            {
                 int w=Math.abs(right-left);
                 int h=Math.min(height[left],height[right]);
                 int area=w*h;
                 if(area>max_area)
                 {
                    max_area=area;
                 }
                 if(height[left]<height[right])
                 {
                    left++;
                 }
                 else
                 {
                    right--;
                 }
            }
           
        
        return max_area;
    }
}
