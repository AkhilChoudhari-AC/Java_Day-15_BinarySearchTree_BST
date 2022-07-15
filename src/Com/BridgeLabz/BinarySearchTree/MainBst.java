package Com.BridgeLabz.BinarySearchTree;

public class MainBst {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        /*
         * initial node root will pointing to null here root is empty
         */
        Node root = null;

        /*
         * 2.inserting the values in the root by calling the insert method
         */
        root = bst.insert(root, 56);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);
        /*
         * 3.here printing the root values
         */
        bst.print(root);
    }
}