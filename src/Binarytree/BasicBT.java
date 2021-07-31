
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
 class basicBT {
    Node root;
    basicBT(int key){
        root=new Node(key);
    }
    basicBT(){
        root=null;
    }

        public static void main(String[] args) {
        basicBT tree =  new basicBT();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
            System.out.println("hi");
        }
}