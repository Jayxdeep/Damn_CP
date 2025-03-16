package search;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        this.left=this.right=null;
    }
}
public class Solution {
    public TreeNode searchBST(TreeNode root,int val){
        while(root!=null && root.val!=val){
          if(val<root.val){
            root=root.left;
          }
          else{
            root=root.right;
          }
        }
        return root;
}
public static void main(String args[]){
    TreeNode root=new TreeNode(4);//
    root.left=new TreeNode(2);
    root.right=new TreeNode(7);
    root.left.left=new TreeNode(1);
    root.left.right=new TreeNode(3);
    Solution solun =new Solution();
    TreeNode res= solun.searchBST(root, 5);
    if(res!=null){
        System.out.println(res.val);
    }
    else{
        System.out.println("value not found");
    }
    /*   4
        / \
       2  7
       /\
       1 3
       */
}
}
   
