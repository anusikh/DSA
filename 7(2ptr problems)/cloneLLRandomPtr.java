// Create a clone of LinkedlIst with Random pointer and next pointer

import java.io.*;

class Node{
    int data;
    Node next, random;
    Node(){}
    Node(int data){
        this.data = data;
        next = null;
        random = null;
    }
}

class LinkedList{
    Node head;
    
    void cloneLL(Node h){
        Node q = null;
        Node p = h;
        
        // Creates a copy adjacent to the nodes
        while(p!=null){
            q = p;
            p = p.next;
            Node temp = new Node(q.data);
            q.next = temp;
            temp.next = p;
        }
        
       q = null;
       p = h;
        
        // Assign random pointers to them
        while(p!=null){
            q = p;
            p = p.next;
            if(p!=null && q.data == p.data ){
                p.random = q.random.next;
            }
        }
        
        Node head2;
        
        
        
    }
    
    void printLL(Node n){
        while(n!=null){
            System.out.println(n.data+" "+n.random.data+"; ");
            n = n.next;
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        
        ll.head.random = ll.head.next.next;
        ll.head.next.random = ll.head;
        ll.head.next.next.random = ll.head.next;
        
        ll.cloneLL(ll.head);
        // ll.printLL(ll.head);
    }
}