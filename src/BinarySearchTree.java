import java.util.Scanner;

public class BinarySearchTree {
    private int data;
    private BinarySearchTree left;
    private BinarySearchTree right;

    BinarySearchTree() {

    }

    BinarySearchTree(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }

    BinarySearchTree insert(BinarySearchTree root, int val) {
        if (root == null) {
            return new BinarySearchTree(val);
        } else {
            if (val < root.data) {
                root.left = insert(root.left, val);
            } else if (val > root.data) {
                root.right = insert(root.right, val);
            }
        }
        return root;
    }

    BinarySearchTree search(BinarySearchTree root, int val) {
        if (root == null)
            return root;
        if (root.data == val) {
            return root;
        } else if (val > root.data) {
            return search(root.right, val);
        } else if (val < root.data) {
            return search(root.left, val);
        }
        return null;
    }

    // BinarySearchTree delete(BinarySearchTree root, int val) {

    // }

    void inorder(BinarySearchTree root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BinarySearchTree root = null;
        BinarySearchTree b = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            root = b.insert(root, x);
        }
        b.inorder(root);
        System.out.print("\nNhap vao nut muon tim trong cay: ");
        int k = scan.nextInt();
        BinarySearchTree result = b.search(root, k);
        System.out.println(result != null ? "Yes" : "No");
    }
}
