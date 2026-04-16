public class secondMax {
    public static void main(String[] args) {
         int arr[] = {12,45,6,5,78,56,85,96,74,58,2,66,33};
        int max1, max2 ;
        max1 = max2 = arr[0];

        for(int x : arr){
            if(x > max1){
                max2 = max1 ;
                max1 = x ;
            }
            else if (x > max2){
                max2 = x ;
            }

            }
            System.out.println("the second max number is  : " + max2);
        }
    }
