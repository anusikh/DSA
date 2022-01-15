// Reverse a LL in groups of K

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
    
    Node reverseInGrpsK(Node h, int k){
        
        Node curr = h;
        Node next =null;
        Node prev = null;
        
        int count = 0;
        
        while(count<k && curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(next!=null){
            h.next = reverseInGrpsK(next, k);
        }
        
        return prev;
    }
    
    void printLL(Node h){
        while(h!=null){
            System.out.println(h.data+" ");
            h = h.next;
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = new Node(1);
        
        ll.head = ll.reverseInGrpsK(ll.head, 2);
        ll.printLL(ll.head);
    }
}