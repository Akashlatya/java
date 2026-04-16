package methods.methodOverRide;

public class reverseTheNumber {

    static int reverse(int num) {

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    static int[] reverse(int arr[]) {

        int[] rev = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[k++] = arr[i];
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverse(number));

        int arr[] = { 1, 2, 3, 4, 5 };
        int rev[] = reverse(arr);
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }

    }
}
