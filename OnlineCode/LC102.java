package OnlineCode;

import java.util.*;

public class LC102 {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right= new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right= new TreeNode(7);
        System.out.println(levelOrder(root));

        Deque<Integer> deque =new ArrayDeque<>();
        //deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);
        while(!deque.isEmpty()){
            int tmp=deque.remove();
            System.out.println(tmp);

        }



    }

    private static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        if(root==null)return  ans;
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            while(size>0){
                TreeNode tmp =queue.remove();
                list.add(tmp.val);
                if(tmp.left!=null)queue.add(tmp.left);
                if(tmp.right!=null)queue.add(tmp.right);
                size--;
            }
            ans.add(list);
        }
        return ans;
    }
}


