package Collections;

import java.util.*;
public class Hashmap {
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>(3);
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        System.out.println(map.get(3));

    }
}
