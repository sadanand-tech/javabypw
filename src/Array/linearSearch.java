package Array;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int n =sc.nextInt();
        int [] arr = new int[n];
        System.out.print("enter the element of an array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.print("enter the value of x :");
        int x= sc.nextInt();

        boolean flag = false; // nahi mila
        for (int i = 0; i <n ; i++) {
            if (arr[i]==x) {
                flag = true; // mil gya
                break;

            }

        }
        if (flag==false)
            System.out.println("not found");
        else
            System.out.println("got it");
    }
}
