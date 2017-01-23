package 二叉排序树Proj;

import java.util.Stack;

/**
 * 前、中、后遍历
 * 
 * @author yeoggc
 *
 */
public class 树排序工具类 {

	/**
	 * 递归实现前序遍历
	 * 
	 * @author linbingwen
	 * @since 2015年8月29日
	 * @param treeNode
	 */
	public static void 前序遍历By递归(TreeNode treeNode) {
		if (null != treeNode) {
			System.out.print(treeNode.data + " ");
			if (null != treeNode.left) {
				前序遍历By递归(treeNode.left);
			}
			if (null != treeNode.right) {
				前序遍历By递归(treeNode.right);

			}
		}
	}

	/**
	 * 循环实现前序遍历
	 * 
	 * @param treeNode
	 */
	public static void 前序遍历ByStack(TreeNode treeNode) {
		if (null != treeNode) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.push(treeNode);
			while (!stack.isEmpty()) {
				TreeNode tempNode = stack.pop();
				System.out.print(tempNode.data + " ");
				// 右子节点不为null,先把右子节点放进去
				if (null != tempNode.right) {
					stack.push(tempNode.right);
				}
				// 放完右子节点放左子节点，下次先取
				if (null != tempNode.left) {
					stack.push(tempNode.left);
				}
			}
		}
	}

	/**
	 * 递归实现中序遍历
	 * 
	 * @param treeNode
	 */
	public static void 中序遍历By递归(TreeNode treeNode) {
		if (null != treeNode) {
			if (null != treeNode.left) {
				中序遍历By递归(treeNode.left);
			}
			System.out.print(treeNode.data + " ");
			if (null != treeNode.right) {
				中序遍历By递归(treeNode.right);
			}
		}

	}

	/**
	 * 循环实现中序遍历
	 * 
	 * @param treeNode
	 */
	public static void 中序遍历ByStack(TreeNode treeNode) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = treeNode;
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			if (!stack.isEmpty()) {
				current = stack.pop();
				System.out.print(current.data + " ");
				current = current.right;
			}
		}
	}

	/**
	 * 递归实现后序遍历
	 * 
	 * @param treeNode
	 */
	public static void 后序遍历By递归(TreeNode treeNode) {
		if (null != treeNode) {
			if (null != treeNode.left) {
				后序遍历By递归(treeNode.left);
			}
			if (null != treeNode.right) {
				后序遍历By递归(treeNode.right);
			}
			System.out.print(treeNode.data + " ");
		}

	}

	/**
	 * 循环实现后序遍历
	 * 
	 * @param treeNode
	 */
	public static void 后序遍历ByStack(TreeNode treeNode) {
		if (null != treeNode) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode current = treeNode;
			TreeNode rightNode = null;
			while (current != null || !stack.isEmpty()) {
				while (current != null) {
					stack.push(current);
					current = current.left;
				}
				current = stack.pop();
				while (current != null && (current.right == null || current.right == rightNode)) {
					System.out.print(current.data + " ");
					rightNode = current;
					if (stack.isEmpty()) {
						System.out.println();
						return;
					}
					current = stack.pop();
				}
				stack.push(current);
				current = current.right;
			}

		}
	}

}
