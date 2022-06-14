package DSA_Interview_Questions.Tree;

import java.util.*;

class Solution {
	public TreeNode deleteNode(TreeNode root, int key) {
	   if(root == null) return null;
	   
	   if(key > root.val) root.right =  deleteNode(root.right , key);
	  else if(key < root.val) root.left = deleteNode(root.left , key);
	  else {
		if(root.right == null) return root.left;
		
		else if (root.left == null) return root.right;
		
		root.val = minValue(root.right);
		root.right = deleteNode(root.right , root.val);
	  }
	  return root;
	 }
   static int minValue(TreeNode root) {
	 int minV = root.val;
	 while(root.left != null) {
	   minV = root.left.val;
	   root = root.left;
	 }
	 return minV;
   }
 }
