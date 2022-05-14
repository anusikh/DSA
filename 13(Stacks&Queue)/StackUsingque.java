// This requires 2 queues
// Push() =>{
// 	add el to q2;
// 	Add all elements from q1 to q2
// 	swap elements from q2 to q1
// }
// Pop(){
// 	Remove the top of q1	
// }

// U can also use 1 queue

class MyStack {
    
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0; i<q.size()-1; i++){
            int j = q.peek();
            q.add(j);
            q.poll();
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size()==0)
            return true;
        return false;
    }
}
