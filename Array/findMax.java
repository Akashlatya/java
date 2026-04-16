public class findMax {
    public static void main(String[] args) {
        int arr[] = {12,45,6,5,78,56,85,96,74,58,2,66,33};
        int max = arr[0];

        for(int x : arr){
            if(x > max){
                max = x ;
            }
        }
        System.out.println(max);
    }
    
}
