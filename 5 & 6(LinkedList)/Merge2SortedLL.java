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
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(5);
        ll.head.next.next.next = new Node(7);
        
        LinkedList ll2 = new LinkedList();
        ll2.head = new Node(2);
        ll2.head.next = new Node(3);
        ll2.head.next.next = new Node(6);
        
        LinkedList res = new LinkedList();
        res.head = new Node(0);
        res.head.next = new Node(0);
        res.head.next.next = new Node(0);
        res.head.next.next.next = new Node(0);
        res.head.next.next.next.next = new Node(0);
        res.head.next.next.next.next.next = new Node(0);
        res.head.next.next.next.next.next.next = new Node(0);
        
        ll.mergeSortedLL(res.head, ll.head, ll2.head);
        
        res.printLL(res.head);
    }
}