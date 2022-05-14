// If Open Bracket, push it in stack
// If Closing Bracket, pop top of stack and compare if opposite
// If the arr, starts with a closing bracket, then defo unbalanced

public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) == '[') || (s.charAt(i) == '{') || (s.charAt(i) == '(') )
                st.push(s.charAt(i));
            else{
                if(st.empty()) return false;
                char x = st.peek();
                st.pop();
                if(((s.charAt(i)=='[') && (x=']'))||((s.charAt(i)=='{') && (x='}'))||((s.charAt(i)=='(') && (x=')')))
                    return true;
                else
                    return false;
            }
        }
        
        if(st.empty())
            return true;
        return false;
    }