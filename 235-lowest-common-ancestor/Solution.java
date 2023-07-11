import java.util.*;
 class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


class Solution {
    public TreeNode findRoot(List<TreeNode> parents1, List<TreeNode> parents2){
        for(int i = 1; i < parents1.size(); i++){
            if(i >= parents2.size()){
                return parents2.get(parents2.size() - 1);
            }
            if(parents1.get(i) != parents2.get(i)){
                return parents1.get(i - 1);
            }
        }
        return parents1.get(parents1.size() - 1);
    }
    public static List<TreeNode> findParents(TreeNode n, TreeNode root){
        List<TreeNode> parents = new ArrayList<>();
        parents.add(root);
        TreeNode node = root;
        while(node != null){
            if(node.val == n.val){
                return parents;
            }
            else if(n.val < node.val){
                parents.add(node.left);
                node = node.left;
            }
            else {
                parents.add(node.right);
                node = node.right;
            }
        }
        return  parents;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> parent1 = findParents(p, root);
        List<TreeNode> parent2 = findParents(q, root);
        return findRoot(parent1, parent2);
    }
}