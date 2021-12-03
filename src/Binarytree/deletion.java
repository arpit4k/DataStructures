public class deletion {
    static class Node{
        int key;
        Node left, right;
    }
    static Node newNode(int item){
        Node temp = new Node();
        temp.key = item;
        temp.left = temp.right = null;
        return temp;
    }
    //Do INORDER traversal
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    static Node insert(Node node, int key){
        if(node==null){
            return newNode(key);
        }
        else if(key<node.key){
            node.left = insert(node.left, key);
        }
        else if(key>node.key){
            node.right = insert(node.right, key);
        }
        return node;
    }
    //When provided with a key, this method will find and delete the key while returning the new root
    static Node deleteKey(Node root, int k){
        if(root==null){
            return root;
        }
        else if(root.key>k){
            root.left = deleteKey(root.left, k);
            return root;
        }
        else if(root.key<k){
            root.right = deleteKey(root.right, k);
            return root;
        }
        // Now we have reached the point where root is the node to be deleted
        //If one of the children is empty, return the other child as root
        if(root.left==null){
            Node temp = root.right;
            return temp;
        }
        else if(root.right == null){
            Node temp = root.left;
            return temp;
        }
        //If both children are present
        else{
            Node succParent = root;
            Node succ = root.right;
            while(succ.left != null){
                succParent = succ;
                succ = succ.left;
            }
            if(succParent!=root){
                succParent.left = succ.right;
            }
            else{
                succParent.right = succ.right;
            }
            root.key = succ.key;
            return root;
        }
    }
    public static void main(String args[])
{
     
    /* Let us create following BST
          50
        /     \
       30     70
      / \    / \
     20 40  60 80 */
    Node root = null;
    root = insert(root, 50);
    root = insert(root, 30);
    root = insert(root, 20);
    root = insert(root, 40);
    root = insert(root, 70);
    root = insert(root, 60);
    root = insert(root, 80);
 
    System.out.println("Inorder traversal of the " +
                       "given tree");
    inorder(root);
 
    System.out.println("\nDelete 20\n");
    root = deleteKey(root, 20);
    System.out.println("Inorder traversal of the " +
                       "modified tree");
    inorder(root);
 
    System.out.println("\nDelete 30\n");
    root = deleteKey(root, 30);
    System.out.println("Inorder traversal of the " +
                       "modified tree");
    inorder(root);
 
    System.out.println("\nDelete 50\n");
    root = deleteKey(root, 50);
    System.out.println("Inorder traversal of the " +
                       "modified tree");
    inorder(root);
}
}
