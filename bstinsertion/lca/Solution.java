package lca;
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        this.left=this.right=null;
    }
}
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(p.val > root.val && q.val > root.val){
            
            return lowestCommonAncestor(root.right,p,q);

        }
        return root;
    }
public static void main(String args[]){
    TreeNode root = new TreeNode(6);
    root.left=new TreeNode(2);
    root.right=new TreeNode(8);
    root.left.left=new TreeNode(0);
    root.left.right=new TreeNode(4);
    root.left.right.left=new TreeNode(3);
    root.left.right.right=new TreeNode(5);
    root.right.left=new TreeNode(7);
    root.right.right=new TreeNode(9);
    Solution lca=new Solution();
    TreeNode p=root.left.left;//dependin on the value of p and q the lca will change
    TreeNode q=root.left.right.right;
    TreeNode res=lca.lowestCommonAncestor(root,p,q);
    System.out.println("lca of"+ p.val+ "and" + q.val + " is:"+ res.val);
}
}
