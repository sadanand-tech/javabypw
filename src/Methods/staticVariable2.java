package Methods;

public class staticVariable2 {
    static int i;
    public static void main(String[] args) {
        i=10;
        System.out.println(i);
        int i =23;
        System.out.println(i);
        fun();

    }
    public static void fun(){
        System.out.println(i);
        int i =70;
        System.out.println(i);

    }
}
