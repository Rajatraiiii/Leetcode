class Solution {
    
    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }

    // returns {sum of subtree, number of nodes in subtree}
    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        // Get information from left subtree
        int[] left = dfs(root.left);

        // Get information from right subtree
        int[] right = dfs(root.right);

        // Calculate current subtree
        int sum = root.val + left[0] + right[0];
        int nodes = 1 + left[1] + right[1];

        // Average rounded down
        int average = sum / nodes;

        if (root.val == average) {
            count++;
        }

        return new int[]{sum, nodes};
    }
}