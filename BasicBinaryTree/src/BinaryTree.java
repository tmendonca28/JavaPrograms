public class BinaryTree {

    private TNode root;

    private class TNode{
        private TNode left;
        private TNode right;
        private int data; // Generic type

        private TNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TNode first = new TNode(1);
        TNode second = new TNode(2);
        TNode third = new TNode(3);
        TNode fourth = new TNode(4);
        TNode fifth = new TNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public static void main(String[] args) {
    }
}
