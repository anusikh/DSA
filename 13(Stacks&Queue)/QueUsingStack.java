class MyQueue {

  Stack<Integer> stack;
  Stack<Integer> revStack;
  public MyQueue() {
    stack = new Stack<>();
    revStack = new Stack<>();
  }

  public void push(int x) {
    stack.push(x);
  }

  public int pop() {
    while (!stack.isEmpty()) {
      revStack.push(stack.pop());
    }
    int num = revStack.pop();
    while (!revStack.isEmpty()) {
      stack.push(revStack.pop());
    }
    return num;
  }

  public int peek() {
    while (!stack.isEmpty()) {
      revStack.push(stack.pop());
    }
    int num = revStack.peek();
    while (!revStack.isEmpty()) {
      stack.push(revStack.pop());
    }
    return num;
  }

  public boolean empty() {
    return stack.isEmpty();
  }
}
