class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: both trees are empty
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one tree is empty
        if (p == null || q == null) {
            return false;
        }

        // Case 3: values don't match
        if (p.val != q.val) {
            return false;
        }

        // Case 4: check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
