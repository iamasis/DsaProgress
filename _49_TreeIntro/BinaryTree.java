package DsaProgress._49_TreeIntro;
import java.util.Scanner;

public class BinaryTree {

    public static class Node{
        private int value;
        private Node right;
        private Node left;

        public Node(int value){
            this.value = value;
        }

    }

    private Node root;

    //to insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter root node value : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert left of : "+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert right of : "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // to display
    public void PrettyDisplay(){
        display(root, 0);
    }
    private void display(Node node, int level){
        if (node == null) {
            return;
        }

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
}


class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.PrettyDisplay();
    }
}
