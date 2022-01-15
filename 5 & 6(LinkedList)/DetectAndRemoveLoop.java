// Detect and Remove Loop

import java.util.HashSet;

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
    
    void removeLoop(Node slow, Node head){
        for (Node curr = head; curr != null; curr = curr.next)
        {
            Node ptr = slow;
            while (ptr.next != slow && ptr.next != curr) {
                ptr = ptr.next;
            }

            if (ptr.next == curr)
            {
                ptr.next = null;
                return;
            }
        }
    }
    
    void detectLoop(Node h){
        Node p = h;
        Node q = h;
        
        while(p!=null && q!=null && p.next!=null){
            q= q.next;
            p = p.next.next;
            
            if(p == q){
                System.out.println("Yes");
                removeLoop(q,h);
                break;
            }
        }
    }
    
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
        ll.head.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next = ll.head.next;
        
        
        
        // ll.mergeSortedLL(res.head, ll.head, ll2.head);
        ll.detectLoop(ll.head);
        ll.printLL(ll.head);
       
    }
}