package cn.com.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lvxinran
 * @date 2020/3/26
 * @discribe
 */
public class OrderIterative {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        new OrderIterative().floorOrder(t1);
    }
    void preOrder(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            System.out.print(pop.val+" ");
            if(pop.right!=null){
                stack.push(pop.right);
            }
            if(pop.left!=null){
                stack.push(pop.left);
            }
        }
    }
    void postOrder(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> postStack = new Stack<>();
        stack.push(head);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            postStack.push(pop);
            if(pop.left!=null){
                stack.push(pop.left);
            }
            if(pop.right!=null){
                stack.push(pop.right);
            }
        }
        while(!postStack.isEmpty()){
            System.out.print(postStack.pop().val+" ");
        }
    }
    void inOrder(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty()||head!=null){
            if(head!=null){
                stack.push(head);
                head = head.left;
            }
            else{
                head = stack.pop();
                System.out.print(head.val+" ");
                head = head.right;
            }
        }
    }
    void floorOrder(TreeNode head){
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(head);
        while(!queue.isEmpty()){
            for(int i = 0 ; i <queue.size();i++){
                TreeNode node = queue.poll();
                System.out.print(node.val+" ");
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
    }

}
