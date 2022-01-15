//Find middle A linked list

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    Node(){}
}

public class LinkedList{
    Node head;
        
   void findMiddle(Node node){
        Stack<Node> st = new Stack<Node>();
        while(node!=null){
            st.push(node);
            node = node.next;
        }
       
        int i = 0;
        
        while(i < (st.size()/2)){
            st.pop();
            i++;
        }
        
        System.out.println(st.peek().data);
   }
    
    void printLL(Node node){
        while(node!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(85);
        ll.head.next = new Node(15);
        ll.head.next.next = new Node(4);
        ll.head.next.next.next = new Node(20);
        // ll.head.next.next.next.next = new Node(30);
        
        ll.printLL(ll.head);
        
        // ll.head = ll.Reverse(ll.head);
        ll.findMiddle(ll.head);
    }
}