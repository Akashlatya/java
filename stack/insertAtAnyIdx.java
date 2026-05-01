package stack;

import java.util.Stack;

public class insertAtAnyIdx {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(52);
        st.push(42);
        st.push(12);
        st.push(22);
        System.out.println(st);
        int idx = 4;
        int x = 10;

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());
        }
        st.push(x);

        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }

}
