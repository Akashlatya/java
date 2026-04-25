package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;

        int st = 0;
        int end = arr.length - 1;
        int f = 0;

        while (st <= end) {

            int mid = (st + end) / 2;

            if (arr[mid] == target) {
                f = 1;
                System.out.println("Element found at index: " + mid);
                break;
            }

            else if (arr[mid] < target) {
                st = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        if (f == 0) {
            System.out.println("Element not found");
        }
    }
}