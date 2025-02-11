package conditionals;
import java.util.Scanner;
public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int n = sc.nextInt();
        if (n%5 == 0){
            System.out.println("number divisible by 5");

        }else
            System.out.println("number not divisible by 5");

    }
}
