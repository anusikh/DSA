// Find the loop point in a LL

import java.util.*;

class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList{
    Node head;
    
    void removeLoop(Node slow, Node head){
        for (Node curr = head; curr != null; curr = curr.next)
        {
            Node ptr = slow;
            while (ptr.next != slow && ptr.next != curr) {
                ptr = ptr.next;
            }

            if (ptr.next == curr)
            {
                System.out.println(ptr.next.data);
                return;
            }
        }
    }
    
    void detectLoop(Node head){
        Node p = head;
        Node q = head;
        
        while(p!=null && q!=null &&p.next!=null){
            q = q.next;
            p = p.next.next;
            
            if(p == q){
                removeLoop(q, head);
                break;
            }
        }
    }
   
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(5);
        ll.head.next.next.next = new Node(7);
        ll.head.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next = ll.head.next;
        
        
        
        // ll.mergeSortedLL(res.head, ll.head, ll2.head);
        ll.detectLoop(ll.head);
    
    }
}