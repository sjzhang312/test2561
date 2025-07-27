package OnlineCode;

public class LC124 {

    private  static int ans=Integer.MIN_VALUE;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        maxPathSum(root);
        System.out.println(ans);
    }

    private static int maxPathSum(TreeNode root) {

        return postOrder(root);

    }
    private static int postOrder(TreeNode root) {
        if(root==null)return 0;
        int left=postOrder(root.left);
        int right=postOrder(root.right);
        ans=Math.max(left+right+root.val,ans);
        return Math.max(left+root.val,right+root.val);

    }
}
