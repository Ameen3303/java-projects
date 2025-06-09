package java_with_DSA;

class TreeNode {
    String name;
    TreeNode left, right;
    TreeNode(String name) {
    	this.name = name; 
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("mom");
        root.left = new TreeNode("dad");
        root.right = new TreeNode("you");

        System.out.println("Root: " + root.name);
        System.out.println("Left: " + root.left.name);
        System.out.println("Right: " + root.right.name);

        System.out.print("Top to bottom: ");
        preOrder(root);
        System.out.println();

        System.out.println("Total nodes: " + count(root));
        System.out.println("Leaf nodes: " + countLeaves(root));

        System.out.print("Left to right: ");
        inOrder(root);
        System.out.println();

        mirror(root);
        System.out.print("After mirror: ");
        inOrder(root);
        System.out.println();

        System.out.println("All paths:");
        printPaths(root, "");
    }

    static void preOrder(TreeNode n) {
        if (n != null) {
            System.out.print(n.name + " ");
            preOrder(n.left);
            preOrder(n.right);
        }
    }

    static void inOrder(TreeNode n) {
        if (n != null) {
            inOrder(n.left);
            System.out.print(n.name + " ");
            inOrder(n.right);
        }
    }

    static int count(TreeNode n) {
        return n == null ? 0 : 1 + count(n.left) + count(n.right);
    }

    static int countLeaves(TreeNode n) {
        if (n == null) return 0;
        if (n.left == null && n.right == null) return 1;
        return countLeaves(n.left) + countLeaves(n.right);
    }

    static void mirror(TreeNode n) {
        if (n != null) {
            TreeNode temp = n.left;
            n.left = n.right;
            n.right = temp;
            mirror(n.left);
            mirror(n.right);
        }
    }

    static void printPaths(TreeNode n, String path) {
        if (n == null) return;
        path += n.name + " ";
        if (n.left == null && n.right == null)
            System.out.println(path);
        printPaths(n.left, path);
        printPaths(n.right, path);
    }
}