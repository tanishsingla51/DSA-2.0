package hashmaps;

import java.util.HashMap;

public class inBuiltHashMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>(); // key, value

        // put() method is used to add elements to the map
        
        map.put("rohan", 45);
        map.put("karan", 67);

        System.out.println(map);

        // get() method is used to get the value of the key

        System.out.println(map.get("rohan"));

        // put() method is used to add or update elements to the map

        map.put("rohan", 50);

        System.out.println(map);

        // remove() method is used to remove elements from the map

        map.remove("rohan");

        System.out.println(map);

      //  map.containsKey("rohan");

        System.out.println(map.containsKey("rohan"));
    }
}


