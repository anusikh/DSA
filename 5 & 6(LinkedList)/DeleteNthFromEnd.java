// Delete Nth from End

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
    
    void deleteNthFromEnd(Node node, int N){
        Node q = null;
        Node p = node;
        Node temp = node;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        
        int indexFromStart = cnt - N;
        
        if(indexFromStart > 0) {
            for(int i=0; i< indexFromStart; i++){
                q = p;
                p = p.next;
            }
            q.next = p.next;
        }else{
            head = head.next;
            p.next = null;
        }
        
    }
    
    void printLL(Node node){
        while(node!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }
    }
    
    public static void main (String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(5);
        ll.head.next.next.next = new Node(7);
        
        
        
        // ll.mergeSortedLL(res.head, ll.head, ll2.head);
        ll.deleteNthFromEnd(ll.head, 4);
        
        ll.printLL(ll.head);
    }
}