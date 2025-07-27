package OnlineCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LC199 {


    public static void main(String[] args) {


        TreeNode root=new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.right.right= new TreeNode(4);
        List<Integer>list=rightView(root);
        System.out.println(list);
    }

    private static List<Integer> rightView(TreeNode root) {
        List<Integer>ans =new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root==null)return ans;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size>0){

                TreeNode tmp = queue.remove();
                if(size==1)ans.add(tmp.val);
                if(tmp.left!=null)queue.add(tmp.left);
                if(tmp.right!=null)queue.add(tmp.right);
                size--;
            }
        }
        return ans;
    }
}
