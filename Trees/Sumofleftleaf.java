class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;

        // check left child
        if (root.left != null) {
            // left leaf condition
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            } else {
                sum += sumOfLeftLeaves(root.left);
            }
        }

        // always check right subtree
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
