
public class TreeNode {

	private int val;
	private TreeNode right = null, left = null;

	public TreeNode(int x) {
		val = x;
	}

	public void setRight(int v) {
		this.right = new TreeNode(v);
	}

	public void setLeft(int v) {
		this.left = new TreeNode(v);
	}

	public TreeNode getRightNode() {
		return this.right;
	}

	public TreeNode getLeftNode() {
		return this.left;
	}

	public int getVal() {
		return val;
	}

	public void preorder(TreeNode t) {
		if (t == null)
			return;
		System.out.print(t.getVal());
		preorder(t.getLeftNode());
		preorder(t.getRightNode());
	}

	public void inorder(TreeNode t) {
		if (t == null)
			return;
		preorder(t.getLeftNode());
		System.out.print(t.getVal());
		preorder(t.getRightNode());
	}

	public boolean isEqual(TreeNode t1, TreeNode t2) {
		if((t1 == null) ^ (t2 == null)) {
			return false;
		}
		if(t1 == null) {
			return true;
		}
		if(t1.getVal() != t2.getVal()) {
			return false;
		}
		return isEqual(t1.getLeftNode(), t2.getLeftNode()) &
				isEqual(t1.getRightNode(), t2.getRightNode());
		
	}
}
