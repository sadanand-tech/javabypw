package Methods;
import java.util.Scanner;
public class permutation {
    public static int fact(int x){
        int xFact = 1;
        for (int i = 1; i <=x; i++) {
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n =sc.nextInt();
        System.out.println("enter the value of r: ");
        int r =sc.nextInt();

        int npr= fact(n)/(fact(n-r));
        System.out.println(npr);



    }
}
