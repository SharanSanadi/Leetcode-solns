import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return ans;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ Left → Right
            for (int col = left; col <= right; col++) {
                ans.add(matrix[top][col]);
            }
            top++;

            // 2️⃣ Top → Bottom
            for (int row = top; row <= bottom; row++) {
                ans.add(matrix[row][right]);
            }
            right--;

            // 3️⃣ Right → Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ans.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // 4️⃣ Bottom → Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    ans.add(matrix[row][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
