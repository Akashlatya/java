package stack;

import java.util.Stack;

public class displayStack {

    public static void displayReverseRec(Stack<Integer> st) {
        if (st.size() == 0)
            return;

        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRec(st);
        st.push(top);

    }

    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        displayReverseRec(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(52);
        st.push(42);
        st.push(12);
        st.push(22);
        System.out.println(st);
        displayRec(st);
    }

}
