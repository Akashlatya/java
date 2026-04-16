import java.util.Scanner;

public class delElement {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 20;
        arr[3] = 12;
        arr[4] = 10;
        arr[5] = 18;
        arr[6] = 96;

        for (int x : arr)
            System.out.print(" " + x);
        System.out.println(" ");

        // for (int i = 0; i < arr.length; i++)
        // System.out.print(arr[i] + ",");
        // System.out.println("");

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value x = ");
        // int x = sc.nextInt();
        System.out.print("Delete the value of index = ");
        int index = sc.nextInt();

        // int index = 3;

        for (int i = index; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + ",");
        System.out.println(" ");
    }

}
