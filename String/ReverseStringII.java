class Solution {
    public String reverseStr(String s, int k) {

        // Convert string to character array because
        // strings in Java are immutable
        char[] arr = s.toCharArray();

        // Traverse the array in steps of 2k
        for (int i = 0; i < arr.length; i += 2 * k) {

            // Left pointer starts at current index
            int left = i;

            // Right pointer is the end of first k characters
            // Math.min is used to avoid index out of bounds
            int right = Math.min(i + k - 1, arr.length - 1);

            // Reverse the first k characters using two pointers
            while (left < right) {

                // Swap characters at left and right pointers
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                // Move pointers towards center
                left++;
                right--;
            }
        }

        // Convert character array back to string and return
        return new String(arr);
    }
}
