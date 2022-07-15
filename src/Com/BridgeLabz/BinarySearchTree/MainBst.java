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

        /*
         * 3.here printing the root values
         */
        bst.print(root);
    }
}
