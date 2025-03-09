package Array;

public class secondMaxInArray {
    public static void main(String[] args) {
        int [] arr = {-2,-3,-4,-76,-56};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>smax && max != arr[i]){
                smax=arr[i];
            }

        }
        System.out.println(smax);
    }
}
