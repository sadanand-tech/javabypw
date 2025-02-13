package loop;

import java.util.Scanner;

public class printAPoneToNTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of term :");
        int n = sc.nextInt();
        // 1 3 5 7 9     2n-1
//        for (int i =1;i<=2*n-1;i+=2){
//            System.out.println(i);
//        }

        // 4 7 1 0 13 16   3n+1
//        for (int a=4;a<=3*n+1;a+=3){
//            System.out.println(a);
//        }
        int a= 4,d= 4;
        for (int i=1;i<=n;i++){
            System.out.println(a+" ");
            a += d;
        }
    }
}
