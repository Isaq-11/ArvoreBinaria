package tree;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Random random = new Random();

        final int qtde = 100_000;

        //bt.add(5);
        //bt.add(3);
        //bt.add(6);
        //bt.printInOrder();

        bt.treeSearch(5);

    }
}