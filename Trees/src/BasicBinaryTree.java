public class BasicBinaryTree<X extends Comparable<X>> {
    private Node root;
    private int size;

    public BasicBinaryTree() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public void add(X item) {
        Node node = new Node(item);

        // If it's an empty tree set it as root
        if(root == null) {
            this.root = node;
            System.out.println("Set root: " + node.getItem());
            this.size++;
        }
        else {
            insert(this.root, node);
        }
    }

    private void insert(Node parent, Node child) {
        // If the child is less than the parent it goes on the left
        // The compareTo method return a number less than 0 if less than
        // 0 if equal to
        // greater than 0 if greater than
        if(child.getItem().compareTo(parent.getItem()) < 0) {
            // if the left node is null, we've found the spot
            if(parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                this.size++;
            }
            // otherwise we need to call insert again and test for left or right
            else {
                insert(parent.getLeft(), child);
            }
        }
        // if the child is greater than the parent, it goes on the right
        else if(child.getItem().compareTo(parent.getItem()) > 0) {
            // if the right node is null, we put it there
            if(parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                this.size++;
            }
            // otherwise we need to call insert again and test for left or right recursively
            else {
                insert(parent.getRight(), child);
            }
        }
        // if parent and child are equal we don't do anything
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private X item;

        public Node(X item) {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }
}
