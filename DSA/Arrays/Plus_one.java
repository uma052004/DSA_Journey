// Java Program for Plus one

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit to handle carry
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Just increment and return if no carry is needed
                return digits;
            }
            digits[i] = 0; // Set current digit to 0 and continue loop
        }

        // If all digits were 9, we need a new array with extra space
        int[] result = new int[n + 1];
        result[0] = 1; // First digit becomes 1 (e.g., 999 → 1000)
        return result;
    }
}
