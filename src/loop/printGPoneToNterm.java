package loop;

import java.util.Scanner;

public class printGPoneToNterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of term :");
        int n = sc.nextInt();

        int a = 3,r = 4;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a+" ");
            a *=r;

        }
    }
}
