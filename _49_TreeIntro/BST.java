package DsaProgress._49_TreeIntro;

public class BST {

    private class Node{
        private Node left;
        private Node right;
        private int value;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    public BST(){

    }

    //root node
    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void populate(int[] arr){
        for(int num : arr){
            this.insert(num);
        }
    }

    // populate using sorted array
    public void populateSorted(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start +(end - start)/2;

        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid+1, end);
    }

    // to check tree is balanced or not
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}


class Check{
    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = {1, 5, 2, 3, 9, 4};
        tree.populate(arr);
        tree.display();

    }
}