package Array;

public class passingArrayToMethod {
    public static void change(int [] sada){
        sada[1]=54;
    }
    public static void main(String[] args) {
        int [] arr = {12,45,85,75,96};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }
}
