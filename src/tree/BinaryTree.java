package tree;

public class BinaryTree {
    private Node root;

    public void add(int value){
        root = add(root, value);
    }

    private Node add(Node node, int value){
        if(node == null){
            node = new Node(value);
        }else{
            if(value < node.value){
                node.left = add(node.left, value);
            }else{
                node.right = add(node.right, value);
            }
        }
        return node;
    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
}
