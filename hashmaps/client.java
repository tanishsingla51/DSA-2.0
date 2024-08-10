package hashmaps;

import java.util.LinkedList;

public class client {
    
    
    public static void main(String[] args) {

        myHashMap map = new myHashMap(); // key, value

        map.put("mohan", 45);

        map.put("karan", 67);

        System.out.println(map.containsKey("mohan"));

        System.out.println(map.get("mohan"));

        map.put("mohan", 50);


        System.out.println(map);

      
    }
}
