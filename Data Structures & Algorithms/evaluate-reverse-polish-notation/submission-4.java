class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String tk : tokens) {
            switch (tk) {
                case "+":
                    st.push(st.pop() + st.pop());
                    break;

                case "-": {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a - b);
                    break;
                }

                case "*":
                    st.push(st.pop() * st.pop());
                    break;

                case "/": {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a / b);
                    break;
                }

                default:
                    st.push(Integer.parseInt(tk));
            }
        }

        return st.pop();
    }
}