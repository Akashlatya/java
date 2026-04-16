public class shortArr {
    public static void main(String[] args) {
        String arr[] = { "java", "python", "cpp", "perl", "cobolt", "bhailang", ".net" };

        java.util.Arrays.sort(arr);

        for (String x : arr)
            System.out.println(x);
    }

}
