/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    二叉树层遍历
    */
    
    /*
    解决思路：
    使用队列先进先出的特性
    */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        TreeNode node = null;
        while(!queue.isEmpty()){
            node = queue.poll();
            list.add(node.val);
            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);
        }
        return list;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}