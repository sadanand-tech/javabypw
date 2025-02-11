package javainput;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the dividend : ");
        int a = sc.nextInt();
        System.out.print("enter the divisor : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.print("the remainder when "+a+" is divided by "+b+" is "+r);

    }
}
