public class copyarray {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 9, 8, 11, 12, 14, 0, 26 };
        int copy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];

        for (int x : copy)
            System.out.print(x + ",");
        System.out.println("");
    }

}
