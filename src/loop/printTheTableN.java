package loop;

import java.util.Scanner;

public class printTheTableN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n =sc.nextInt();
        for (int i=n;i<=n*10;i+=n){
            System.out.println(i);
        }
    }
}
