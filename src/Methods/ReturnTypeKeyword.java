package Methods;

public class ReturnTypeKeyword {
    public static void greet(int a){
        if (a<0) return;
        System.out.println("Good Morning");
    }
    public static void main(String[] args) {
        greet(-6);

    }
}
