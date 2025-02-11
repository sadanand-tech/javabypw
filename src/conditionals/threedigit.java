package conditionals;
import java.util.Scanner;
public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        if (n>99 && n <1000){
            System.out.println("numberis three digit");
        }else {
            System.out.println("not three digit number");
        }
    }
}
