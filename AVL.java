

class Node {
    int item, height;
    Node left, right;
    
    Node(int value) {
        item = value;
        height = 1;
    }
}

class AVLTree {
    Node root;
    
   
    int height(Node node) {
        if (node == null) return 0;
        return node.height;
    }
    
   
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        
        
        y.left = x;
        x.right = T2;
        
       
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        
        return y;
    }
    
    // Insert a node
    void insert(int item) {
        root = insert(root, item);
    }
    
    Node insert(Node node, int item) {
      
        if (node == null) return new Node(item);
        
        if (item < node.item)
            node.left = insert(node.left, item);
        else if (item > node.item)
            node.right = insert(node.right, item);
        else 
            return node;
            
        node.height = 1 + Math.max(height(node.left), height(node.right));
        
        int balance = height(node.left) - height(node.right);
        
        if (balance < -1 && item > node.right.item) {
            return leftRotate(node);
        }
        
        return node;
    }
    void printTree() {
        printInOrder(root);
    }
    
    void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.item + " ");
            printInOrder(node.right);
        }
    }
    
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);  
        
        System.out.println("In-order traversal of AVL tree:");
        tree.printTree();

    }
}