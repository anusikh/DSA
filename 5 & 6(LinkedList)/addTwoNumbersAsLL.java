// Add two numbers as ll

import java.util.Stack;
import java.lang.Math;

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
    
    int LengthLL(Node n){
        int cnt = 0;
        while(n!=null){
            cnt++;
            n = n.next;
        }
        return cnt;
    }
    
    void addTwoNumAsLL(Node head1, Node head2){
        Node p = head1;
        Node q = head2;
        
        int cnt1 = LengthLL(head1);
        int cnt2 = LengthLL(head2);
        
        int sum =0;
        
        while(cnt1>=1){
            sum += (p.data) * Math.pow(10, cnt1-1);
            p = p.next;
            cnt1--;
        }
        
        while(cnt2>=1){
            sum += (q.data) * Math.pow(10, cnt2-1);
            q = q.next;
            cnt2--;
        }
        
        System.out.println(sum);
        
    }
    
    void mergeSortedLL(Node node, Node head1, Node head2){
        Node p = head1;
        Node q = head2;
        Node r = node;
        
        while(p!=null && q!=null){
            if(p.data < q.data){
                r.data = p.data;
                r = r.next;
                p = p.next;
            }
            if(p.data >= q.data){
                r.data = q.data;
                r = r.next;
                q = q.next;
            }
        }
        
        while(p!=null){
            r.data = p.data;
            r = r.next;
            p = p.next;
        }
        
        while(q!=null){
            r.data = q.data;
            r = r.next;
            q = q.next;
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
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next = new Node(6);
        ll.head.next.next.next.next.next.next = new Node(7);
        
        LinkedList ll2 = new LinkedList();
        ll2.head = new Node(10);
        ll2.head.next = new Node(9);
        ll2.head.next.next = new Node(8);
		
		ll.head.next.next.next = ll2.head.next.next.next;
        
        
        ll.addTwoNumAsLL(ll.head, ll2.head);
        
        
    }
}