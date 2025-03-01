package Methods;

public class PassingArguments {
    public static void greet(String name){
        System.out.println("Good Morning " +name);
    }
    public static void main(String[] args) {
        greet("Sada");
        sum(8,2);
        Intro("Sada",25);
        Intro("Pritee",22);

    }
    public static void Intro(String name,int age){
        System.out.println("hello "+name+" your age is "+age);
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
}
