package Generics;

class genericClass<T> {

    T obj;
    genericClass(T obj) { this.obj = obj; }
    public T getObject() { return this.obj; }
}

public class generics {
    static <T> void display(T t)
    {
        System.out.println(t.getClass().getName()+" "+t);
    }
    public static void main(String[] args) {
        genericClass<Integer> iObj = new genericClass<Integer>(1);
        System.out.println(iObj.getObject());


        genericClass<String> sObj = new genericClass<String>("one");
        System.out.println(sObj.getObject());

        int a = 10;
        String s = "one";
        display(a);
        display(s);



    }
}
