package cn.com.Tree;

/**
 * @author lvxinran
 * @date 2020/1/17
 * @discribe 226. 翻转二叉树
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 */
public class Main_226_InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.right==null&&root.left==null){
            return root;
        }
        TreeNode tmpNod;
        tmpNod = root.left;
        root.left = root.right;
        root.right = tmpNod;
        if(root.right!=null){
            invertTree(root.right);
        }
        if(root.left!=null){
            invertTree(root.left);
        }
        return root;
    }
}
