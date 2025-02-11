package conditionals;
import java.util.Scanner;
public class proftlos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp= sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp= sc.nextInt();
        if(sp>cp){
            System.out.println("you made a profit");
            System.out.println(sp-cp);
        }
        else{
            System.out.println("you made a loss");
            System.out.println(cp-sp);
        }


    }
}
