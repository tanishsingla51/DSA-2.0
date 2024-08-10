package hashmaps;

public class Hashing {
    
    // [0,20]

    public static int hashFunction(String str) {
        
        int hashValue = str.hashCode();

        int mapValue = Math.abs(hashValue) % 21;
        
        return mapValue;
    }

    public static void main(String[] args) {
        
        // String str = "hello";

        // System.out.println(str.hashCode()); // .hashcode takes the bytecode of the string and returns the hashcode of the string by solving the polynomial equation.

        // System.out.println(str.hashCode() % 11); // to get the hashcode in the range of 0 to 10.

        System.out.println(hashFunction("hello"));
        System.out.println(hashFunction("world"));
    }
}
