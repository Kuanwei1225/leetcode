
public class Main {

	public static void main(String[] args) {
		/**
		 *  create binary tree
		 */
		TreeNode treeHead1 = new TreeNode(1);
		treeHead1.setRight(2);
		treeHead1.setLeft(3);
		treeHead1.getRightNode().setRight(4);
		treeHead1.getRightNode().setLeft(5);
		treeHead1.getLeftNode().setRight(6);
		treeHead1.getLeftNode().setLeft(7);
		
		TreeNode treeHead2 = new TreeNode(1);
		treeHead2.setRight(2);
		treeHead2.setLeft(3);
		treeHead2.getRightNode().setRight(4);
		treeHead2.getRightNode().setLeft(5);
		treeHead2.getLeftNode().setRight(9);
		treeHead2.getLeftNode().setLeft(7);
		/**
		 *  print and compare
		 */
		treeHead1.preorder(treeHead1);
		System.out.println();
		treeHead2.preorder(treeHead2);
		System.out.println();
		System.out.println(treeHead1.isEqual(treeHead1, treeHead2));
		
		
	}
}
