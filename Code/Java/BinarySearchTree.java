public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;
    private class Node<T extends Comparable<T>>{
        T data;
        Node<T> left, right;

        public Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    public BinarySearchTree() {
        root = null;
    }
    public void insert(T key) {
        if(root == null) {
            root = new Node<T>(key);
            return;
        }
        Node<T> node = root;
        while(node != null) {
            int cmp = key.compareTo(node.data);
            if(cmp == 0) return;
            if(cmp < 0) {
                node = node.left;
                if(node == null) {
                    node = new Node<T>(key);
                    return;
                }
            }
            else {
                node = node.right;
                if(node == null) {
                    node = new Node<T>(key);
                    return;
                }
            }
        }
    }
    public boolean delete(Node<T> root, T key) {
        return true;
    }
    public Node<T> findParent(Node<T> root, T key) {
        Node<T> parent;
        while(root != null) {
            parent = root;
            int cmp = key.compareTo(root.data);
            if(cmp == 0) return parent;
            if(cmp < 0) root = root.left;
            else root = root.right;
        }
        return null;
    }
    public Node<T> search(Node<T> root, T key) {
        while(root != null) {
            int cmp = key.compareTo(root.data);
            if(cmp == 0) return root;
            if(cmp < 0) root = root.left;
            else root = root.right;
        }
        return null;
    }
    public Node<T> findMax(Node<T> root) {
        if(root == null) return null;
        while(root.right != null)
            root = root.right;
        return root;
    }
    public Node<T> findMix(Node<T> root) {
        if(root == null) return null;
        while(root.left != null)
            root = root.left;
        return root;
    }
    public void preOrder(Node<T> root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree<Integer> t = new BinarySearchTree();
        t.insert(1);
        t.insert(2);
        t.preOrder(t.root);
    }
}
