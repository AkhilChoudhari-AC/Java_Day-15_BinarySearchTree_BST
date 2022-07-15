package Com.BridgeLabz.BinarySearchTree;

class Node {
    int data;
    Node left;
    Node right;

}
public class BinaryTree {
    public Node insert(Node root, int val) {
        if (root == null) {
            return craeteNewNode(val);
        }
        /*
         * 2. condition second if value is lesser then root data value then it will
         * inserting a root value to the left side
         */
        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        /*
         * 3. condition third if value is greater then root data value then it will
         * inserting a root value to the right side
         */
        else if (val > root.data) {

            root.right = insert(root.right, val);
        }
        return root;

    }


    public Node craeteNewNode(int k) {
        Node bst = new Node();
        bst.data = k;
        /*
         * both left and right root data's are null
         */
        bst.left = null;
        bst.right = null;
        return bst;
    }

    /**
     * creating method print to print the data values
     *
     * @param root- parameter is root
     */
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);

    }

}
