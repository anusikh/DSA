// Check if LL is a palindrome

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
    
    void palindrome(Node node){
       Stack<Integer> st = new Stack<Integer>(); 
        
        Node p = node;
        
        while(p!=null){
            st.push(p.data);
            p = p.next;
        }
        
        Node q = node;
        
        while(q!=null){
            int x = st.peek();
            st.pop();
            if(q.data != x){
                System.out.println("No");
                break;
            }
            q = q.next;
        }
        
        if(st.isEmpty()){
            System.out.println("Yes");
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = new Node(1);
        
        ll.palindrome(ll.head);
    }
}