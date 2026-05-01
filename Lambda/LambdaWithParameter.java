package Lambda;

interface InnerLambdaWithParameter {

    public int add(int a, int b);

}

public class LambdaWithParameter {
    public static void main(String[] args) {
        InnerLambdaWithParameter m = (a, b) -> a + b;
        System.out.println(m.add(23, 54));
    }
}
