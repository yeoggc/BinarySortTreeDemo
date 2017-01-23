package 二叉排序树Proj;

public class 二叉排序树Test {

	public static void main(String[] args) {
		二叉排序树 tree = new 二叉排序树();
		tree.insertBSTBy循环(50);
		tree.insertBSTBy循环(80);
		tree.insertBSTBy循环(20);
		tree.insertBSTBy循环(60);
		tree.insertBSTBy循环(10);
		tree.insertBSTBy循环(10);
		tree.insertBSTBy递归(30);
		tree.insertBSTBy递归(70);
		tree.insertBSTBy递归(90);
		tree.insertBSTBy递归(100);
		tree.insertBSTBy递归(40);
		System.out.println("==============================" + "采用递归的前序遍历" + "==============================");
		树排序工具类.前序遍历By递归(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用循环的前序遍历" + "==============================");
		树排序工具类.前序遍历ByStack(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用递归的后序遍历" + "==============================");
		树排序工具类.后序遍历By递归(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用循环的后序遍历" + "==============================");
		树排序工具类.后序遍历ByStack(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用递归的中序遍历" + "==============================");
		树排序工具类.中序遍历By递归(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用循环的中序遍历" + "==============================");
		树排序工具类.中序遍历ByStack(tree.root);
		System.out.println();
		System.out.println("==============================" + "采用循环找到某结点" + "==============================");
		TreeNode findTreeNode1 = tree.findTreeNodeBy循环(tree.root, 20);
		System.out.println(findTreeNode1);
		System.out.println("==============================" + "采用递归找到某结点" + "==============================");
		TreeNode findTreeNode2 = tree.findTreeNodeBy递归(tree.root, 20);
		System.out.println(findTreeNode2);
	}

}
