
public class Main {

	public static void main(String[] args) {
		/**
		 *  create binary tree
		 */
		TreeNode treeHead1 = new TreeNode(1);
		treeHead1.setRight(2);
		treeHead1.setLeft(2);
		treeHead1.getRightNode().setRight(3);
		treeHead1.getRightNode().setLeft(4);
		treeHead1.getLeftNode().setRight(4);
		treeHead1.getLeftNode().setLeft(3);
		
		/**
		 *  print and compare
		 */
		treeHead1.preorder(treeHead1);
		System.out.println();
		treeHead1.inorder(treeHead1);
		System.out.println();
		System.out.println(treeHead1.isSymmetric(treeHead1));
		
		
	}
}
