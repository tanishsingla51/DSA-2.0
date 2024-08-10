package hashmaps;

import java.util.LinkedList;

public class myHashMap {
    
    LinkedList<Entry>[] arr;

    myHashMap() {
        arr = new LinkedList[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
            System.out.println(arr[i]);
        }
    }

    private int hashFunction(String key) {

        int hashValue = key.hashCode();

        int index = Math.abs(hashValue) % arr.length;

        return index;

    }
    
    public boolean containsKey(String key) {

        // find the index of the given key
        int index = hashFunction(key);

        LinkedList<Entry> list = arr[index];

        for (Entry e : list) {
            if (e.key.equals(key)) { // if the key is found
                return true;
            }
        }

        return false;
    }
    
    public void put(String key, int value) {

        int index = hashFunction(key);

        LinkedList<Entry> list = arr[index];

        for (Entry e : list) {
            if (e.key.equals(key)) {
                e.value = value;
                return;
            }
        }

        list.add(new Entry(key, value));
    }   

    public int get(String key) {

        int index = hashFunction(key);

        LinkedList<Entry> list = arr[index];

        for (Entry e : list) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }

        return -1;
    }

    public void remove(String key) {

        int index = hashFunction(key);

        LinkedList<Entry> list = arr[index];

        for (Entry e : list) {
            if (e.key.equals(key)) {
                list.remove(e);
                return;
            }
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (LinkedList<Entry> list : arr) {
            for (Entry e : list) {
                sb.append(e.key + " " + e.value + "\n");
            }
        }

        return sb.toString();
    }
}
