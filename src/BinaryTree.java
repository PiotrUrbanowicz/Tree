public class BinaryTree {

    private Node node;

    public void add(int value) {
        if (this.node == null) {
            node = new Node(value);
        } else if (this.node.getValue() > value && this.node.getLeft() == null) {
            this.node.setLeft(new Node(value));
        } else if (this.node.getValue() < value && this.node.getRight() == null) {
            this.node.setRight(new Node(value));
        } else if (this.node.getValue() > value && this.node.getLeft() != null) {
            addToTree(this.node.getLeft(), value);
        } else if (this.node.getValue() < value && this.node.getRight() != null) {
            addToTree(this.node.getRight(), value);
        }
    }

    private void addToTree(Node childNode, int value) {
        if (childNode.getValue() > value && childNode.getLeft() == null) {
            childNode.setLeft(new Node(value));
        } else if (childNode.getValue() < value && childNode.getRight() == null) {
            childNode.setRight(new Node(value));
        } else if (childNode.getValue() > value && childNode.getLeft() != null) {
            addToTree(childNode.getLeft(), value);
        } else if (childNode.getValue() < value && childNode.getRight() != null) {
            addToTree(childNode.getRight(), value);
        }
    }

    public int min() {
        return minNode(this.node);
    }

    private int minNode(Node childNode) {
            if (childNode.getLeft() == null) {
                return childNode.getValue();
            } else {
                return minNode(childNode.getLeft());
            }
    }

    public int max() {
        return maxNode(this.node);
    }

    private int maxNode(Node childNode) {
        if (childNode.getRight() == null) {
            return childNode.getValue();
        } else {
            return maxNode(childNode.getRight());
        }
    }

    public boolean contains(int value) {
            return containsNode(this.node, value);
        }


    private boolean containsNode(Node childNode, int value) {
        if(childNode==null){
            return false;
        }
        if (childNode.getValue() == value) {
            return true;
        } else if (childNode.getValue() > value) {
            return containsNode(childNode.getLeft(), value);
        } else{
            return containsNode(childNode.getRight(), value);
        }
    }
}











