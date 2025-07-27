package OnlineCode;

public class LC236 {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        TreeNode tmp = lowestCommonFun(root ,root.left,  root.left.right.right);
        System.out.println(tmp.val);
    }

    private static TreeNode lowestCommonFun(TreeNode root,TreeNode p ,TreeNode q) {
        if(root==null)return root;
        if(root ==p ||root==q)return root;
        TreeNode left= lowestCommonFun(root.left ,p ,q);
        TreeNode right =lowestCommonFun(root.right ,p,q);

        //if(left!=null && right!=null)
        //    return root;
        if(left==null && right==null)return null;
        if(left==null && right!=null)
            return right;
        if(right==null&& left!=null)
            return left;
        return root;

    }
}
