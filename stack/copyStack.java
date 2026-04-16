package stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(32);
        st.push(52);
        st.push(42);
        st.push(12);
        st.push(22);
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0) {
            gt.push(st.pop());
        }

        System.out.println(gt);
        Stack<Integer> cpst = new Stack<>();
        while (gt.size() > 0) {
            cpst.push(gt.pop());
        }
        System.out.println(cpst);

    }
}