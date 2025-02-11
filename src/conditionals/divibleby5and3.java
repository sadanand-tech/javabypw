package conditionals;
import java.util.Scanner;
public class divibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n = sc.nextInt();
        if (n%3==0 && n%5== 0){
            System.out.println("number divisible by 5 and 3");

        }
        else{
            System.out.println(" numberis notdivible by 3 and 5");
        }
    }
}
