package OOPS;
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
    static double add(double a, double b){return a+b;}
}
public class MethodOverloading {
    public static void main(String[] args){
        System.out.println(Adder.add(5,5));
        System.out.println(Adder.add(10,4,10));
        System.out.println(Adder.add(43.2,78.0));
    }
}
