public class array {
    public static void main(String[] args) {
        int array1[] = { 2, 3, 4, 5, 6, 7, 8, 9 };

        int array2[] = { 9, 8, 7, 4, 5, 6, 5, 2 };

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println("\n");
        
        for (int x : array2) {
            System.out.print(x++);
        }
    }
}
