static void findIntersectionPoint(Node h1, Node h2){
        Node p = h1;
        Node q = h2;
        
        HashSet<Node> hs = new HashSet<Node>();
        while(p!=null){
            hs.add(p);
            p=p.next;
        }
        
        while(q!=null){
            if(hs.contains(q)){
                System.out.println(q.data);
            }
            q = q.next;
        }
    }