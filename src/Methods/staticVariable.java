package Methods;

public class staticVariable {
    static int i;
    public static void main(String[] args) {
        i=10;
        System.out.println(i);
        fun();
        System.out.println(i);
    }
    public static void fun(){
        i=20;

    }
}
