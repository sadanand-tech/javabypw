package Methods;

public class power {
    public static void main(String[] args) {
        System.out.println(Math.pow(3,4));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.cbrt(8));
        System.out.println(Math.abs(-6));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(4.6,0.6));

//        int a=5,b=8,c=2;
//        System.out.println(Math.max(a,Math.max(b,c)));

        int a=5,b=8,c=2,d=3;
        System.out.println(Math.max(a,Math.max(b,Math.max(c,d))));

    }
}
