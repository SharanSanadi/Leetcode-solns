class Solution {
    int tilt = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return tilt;
    }

    private int postOrder(TreeNode node) {
        if (node == null) return 0;

        int leftSum = postOrder(node.left);
        int rightSum = postOrder(node.right);

        tilt += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + node.val;
    }
}
