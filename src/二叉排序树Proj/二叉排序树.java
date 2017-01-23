package 二叉排序树Proj;

/**
 * 二叉排序树类定义
 */
public class 二叉排序树 {

	// 根节点
	public TreeNode root;

	// 二叉树中节点的数量
	public long size;

	/**
	 * 往树中加节点
	 * 
	 * @param data
	 * @return Boolean 插入成功返回true
	 */
	public Boolean insertBSTBy递归(Integer data) {

		// 生成最顶层根节点
		if (null == root) {
			root = new TreeNode(data);
			System.out.println("数据成功插入到二叉查找树中");
			return true;
		}

		return insertBSTBy递归(root, data);

	}

	/**
	 * 递归方式向二叉排序树插入数据
	 * 
	 * @param node
	 * @param data
	 * @return
	 */
	private boolean insertBSTBy递归(TreeNode node, Integer data) {
		if (data < node.data) {
			if (node.left == null) {
				TreeNode treeNode = new TreeNode(data);
				node.left = treeNode;
				return true;
			} else {
				insertBSTBy递归(node.left, data);
			}
		} else if (data > node.data) {
			if (node.right == null) {
				TreeNode treeNode = new TreeNode(data);
				node.right = treeNode;
				return true;
			} else {
				insertBSTBy递归(node.right, data);
			}
		}

		return false;
	}

	/**
	 * 循环方式向二叉排序树插入数据
	 * 
	 * @param key
	 */
	public void insertBSTBy循环(int key) {
		TreeNode node = root;
		/** 记录查找结点的前一个结点 */
		TreeNode parent = null;
		/** 一直查找下去，直到到达满足条件的结点位置 */
		while (node != null) {
			parent = node;
			if (key < node.data)
				node = node.left;
			else if (key > node.data)
				node = node.right;
			else
				return;
		}
		
		TreeNode treeNode = new TreeNode(key);
		if (root == null)
			root = treeNode;
		else if (key < parent.data) {
			parent.left = treeNode;
		} else{
			parent.right = treeNode;
		}
	}

	/**
	 * 根据给定值，从最顶层树根节点循环遍历地开始查找某结点
	 * 
	 * @param node
	 *            最顶层树根节点
	 * @param data
	 *            需要进行查找的值
	 * @return 如果找到则返回对应TreeNode对象，否则返回null
	 */
	public TreeNode findTreeNodeBy循环(TreeNode node, Integer data) {
		while (node != null) {
			if (node.data > data) {
				node = node.left;
			} else if (node.data < data) {
				node = node.right;
			} else {
				return node;
			}

		}
		return null;
	}

	/**
	 * 根据给定值，从最顶层树根节点递归地开始查找某结点
	 * 
	 * @param node
	 *            最顶层树根节点
	 * @param data
	 *            需要进行查找的值
	 * @return 如果找到则返回对应TreeNode对象，否则返回null
	 */
	public TreeNode findTreeNodeBy递归(TreeNode node, Integer data) {

		if ((node == null) || node.data == data) {
			return node;
		} else if (node.data > data) {
			return findTreeNodeBy递归(node.left, data);
		} else {
			return findTreeNodeBy递归(node.right, data);
		}

	}

	



}
