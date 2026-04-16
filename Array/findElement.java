import java.util.*;

public class findElement {
    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                System.out.print("Element found at index: " + i);
            }
        }
    }
}
