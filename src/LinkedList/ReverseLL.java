//ITERATIIVE METHOD
class ReverseLL{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node= node.next;
        }
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(20);
        list.head.next = new Node(21);
        list.head.next.next = new Node(22);
        System.out.println("Given LL is: ");
        list.printList(head);
        System.out.println("");
        
        System.out.println("Reverse LL is: ");
        head = list.reverse(head);
        list.printList(head);
        
    }
}
