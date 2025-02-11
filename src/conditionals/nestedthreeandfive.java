package conditionals;

import java.util.Scanner;

public class nestedthreeandfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int n = sc.nextInt();
        if (n%5==0){
            if (n%3==0){
                System.out.println("the number isdivible by 3and 5 both");
            }
            else{
                System.out.println("not divisible");
            }
        }
    }
}
