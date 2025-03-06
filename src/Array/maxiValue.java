package Array;

public class maxiValue {
    public static void main(String[] args) {
        int [] arr ={75,76,89,15,72};
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
