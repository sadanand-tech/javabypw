package conditionals;
import java.util.Scanner;
public class percentageelseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter percentage : ");
        int n = sc.nextInt();
        if(n >90){
            System.out.println("Excellent");
        } else if (n>80) {
            System.out.println("verygood");
        } else if (n>70) {
            System.out.println("good");
        } else if (n>60) {
            System.out.println("can do better");

        } else if (n>50) {
            System.out.println("average number");

        } else if (n>40) {
            System.out.println("below avaerage");
        }
        else {
            System.out.println("fail");
        }
    }
}
