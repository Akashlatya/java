package stack;

import java.util.*;

public class demoStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(52);
        st.push(42);
        st.push(12);
        st.push(22);
        System.out.println(st);
    }
}

// *Stack overflow is = memory of stack is full *
// "Stack underflow is " stack is empty and use pop fun in it