package javainput;
import java.util.*;
public class modulo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter the dividend : ");
        int a = sc.nextInt();
        System.out.print("enter the divisor : ");
        int b = sc.nextInt();
        int r = a%b;
        System.out.print("the remainder is :" +r);
    }
}
