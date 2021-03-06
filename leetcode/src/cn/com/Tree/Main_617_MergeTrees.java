package cn.com.Tree;

/**
 * @author lvxinran
 * @date 2020/1/17
 * @discribe 617. 合并二叉树
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 *
 * 示例 1:
 *
 * 输入:
 * 	Tree 1                     Tree 2
 *           1                         2
 *          / \                       / \
 *         3   2                     1   3
 *        /                           \   \
 *       5                             4   7
 * 输出:
 * 合并后的树:
 * 	     3
 * 	    / \
 * 	   4   5
 * 	  / \   \
 * 	 5   4   7
 */
public class Main_617_MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if(t1==null&&t2==null) {
//            return null;
//        }
//        if (t1 == null) {
//            t1 = new TreeNode(0);
//        }if(t2==null){
//            t2 = new TreeNode(0);
//        }
//        TreeNode node = new TreeNode(t1.val+t2.val);
//
//        node.left = mergeTrees(t1.left,t2.left);
//
//        node.right = mergeTrees(t1.right,t2.right);
//
//        return t1;

        if(null==t1){
            return t2;
        }
        if(null==t2){
            return t1;
        }
        t1.val = t1.val+t2.val;
        t1.right=mergeTrees(t1.right,t2.right);
        t1.left=mergeTrees(t1.left,t2.left);
        return t1;
    }
}
