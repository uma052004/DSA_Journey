// Java Program for 4 sum

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();  // Corrected missing variable
        Arrays.sort(nums);  // Sort to handle duplicates easily
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Long> hashset = new HashSet<>();  // Track seen numbers
                
                for (int k = j + 1; k < nums.length; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum;  // Required fourth number
                    
                    if (hashset.contains(fourth)) {  // If fourth number is found
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], (int) fourth);
                        Collections.sort(temp);  // Sort to maintain consistency
                        st.add(temp);  // Add unique quadruplet
                    }
                    hashset.add((long) nums[k]);  // Add current number to set
                }
            }
        }
        
        return new ArrayList<>(st);  // Convert set to list
    }
}
