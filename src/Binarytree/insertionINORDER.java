//Insertion operation in a binary tree
//while at the end TRAVERSE the tree in INORDER
//INORDER will always give a sorted traversal
class insertionINORDER{
    class Node{
        int key;
        Node right, left;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    insertionINORDER(){
        root=null;
    }
    void insert(int key){
        root = insertRec(root,key);
    }
    Node insertRec(Node root, int key){
        if(root==null){
            root = new Node(key);
            return root;
        }
        if(key<root.key){
            root.left = insertRec(root.left, key);
        }
        else if(key>root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    void inorder(){ //DOnt need this if we only want to insert values and dont need to traverse
        inorderRec(root);
    }
    void inorderRec(Node root){//DOnt need this if we only want to insert values and dont need to traverse
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);
        }
    }
    public static void main(String[] args) {
        insertionINORDER tree = new insertionINORDER();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.print("INORDER Traversal is : ");
        tree.inorder();//DOnt need this if we only want to insert values and dont need to traverse
    }
}