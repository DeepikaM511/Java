package OOPS;
class Student{
    int id;
    String name;
    int age;
    static String college = "IIT";
    Student(int i,String n){
        id = i;
        name = n;
    }
    Student(int i,String n,int age){
        id = i;
        name = n;
        this.age  = age;
    }
    Student(){}
    void display(){System.out.println(id+" "+name+" "+this.age+" "+college);}


}
public class Constructors {
    public static void main(String[] args){
        Student s1 = new Student(1,"Kale");
        Student s2 = new Student();
        Student s3 = new Student(2,"Sachin",21);
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
        s3.display();
    }
}
