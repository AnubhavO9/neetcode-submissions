class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> st = new Stack<>();
    for(String tk : tokens){
        switch(tk) {
            case("+"):{
               st.push(st.pop() + st.pop());
               break;}
            case("-"):{
                int a= st.pop();
                int b= st.pop();
               st.push(b-a);
               break;}
            case("*"):{
               st.push(st.pop() * st.pop());
               break;}
            case("/"):{
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
               break;}
            default: 
                st.push(Integer.parseInt(tk));
        }
    }    
    return st.pop();
    }
}
