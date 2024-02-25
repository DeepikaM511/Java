package Collections;
import java.util.*;
public class Linkedlist {
    public static void main(String args[]){

        LinkedList<String> al=new LinkedList<String>();
        al.addLast("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.addFirst("Ajay");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
