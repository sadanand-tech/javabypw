package loop;
import java.util.Scanner;
public class LoopBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=2;
        for (int i =1;i<=n;i++){
            System.out.println(a);
            a=b;
            b=c;

        }


    }
}
