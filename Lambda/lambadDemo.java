package Lambda;

// this is functionInterface which have only Single method
@FunctionalInterface
interface MyLambda {
    public void Display();
}

public class lambadDemo {
    public static void main(String[] args) {

        MyLambda m = () -> {
            System.out.println("hii");
        };
        m.Display();

    }

}
