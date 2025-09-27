package tree;

import java.util.Random;

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

    public void printInOrder(){
        printInOrder(root);
    }

    private void printInOrder(Node root){
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.println(root.value);
        printInOrder(root.right);
    }
    public void printPreOrder(){
        printPreOrder(root);
    }

    private void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

    public void printPosOrder(){
        printPosOrder(root);
    }

    private void printPosOrder(Node root){
        if(root == null){
            return;
        }
        printPosOrder(root.left);
        printPosOrder(root.right);
        System.out.println(root.value);
    }

    public void shuffle(int array[], Random random){
        for(int x = array.length -1; x> 0; x--){
            int j = random.nextInt(x);
            int temp = array[x];
            array[x] = array[j];
            array[j] = temp;
        }
    }

    public boolean linearSearch(int array[], int value){
        for(int v:array){
            if(v == value) return true;
        }
        return false;
    }

    public boolean treeSearch(int value){
        Node root = this.root;
        while (root!=null){
            if(root.value == value) return true;
            root = value < root.value ? root.left : root.right;
        }
        return false;
    }

    public int[] queryGenerator(int quantity, int arrayLength, Random random){
        int array[] = new int[quantity];

        for(int x=0; x<quantity; x++){
            if((x&0) ==0){
                array[x] = x;
            }else{
                array[x] = arrayLength + random.nextInt(quantity);
            }
        }
        return array;
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
