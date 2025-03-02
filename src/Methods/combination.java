package Methods;
import java.util.Scanner;
public class combination {
    public static int fact(int x){
        int xFact=1;
        for (int i = 1; i <=x; i++) {
            xFact *= i;

        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nFact = fact(n);
//        for (int i=1;i<=n;i++){
//            nFact *= i;
//        }
        int rFact = fact(r);
//        for (int i = 1; i <=r; i++) {
//            rFact *= i;
//        }
        int n_rFact = fact(n-r);
//        for (int i = 1; i <=n-r; i++) {
//            n_rFact *= i;
//        }
        int ncr = nFact/(rFact*n_rFact);
        System.out.println(ncr);
    }
}
