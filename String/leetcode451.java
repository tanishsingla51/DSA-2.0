package String;

public class leetcode451 {

    public static void sortCharactersByFrequency(String s) {
        
        int[] freq = new int[256];

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            int ascii = s.charAt(i);
           // System.out.println(s.charAt(i) + "->" + ascii);
            freq[ascii] = freq[ascii] + 1;
           // System.out.println(freq[ascii]);
        }

        int max = 0;
        int max_index = 0;
        
        int i =0;
        while (i < freq.length) {

            if (freq[i] > 0) {
              
                char ch = (char) i;

                for (int j = 0; j < freq[i]; j++) {
                    System.out.print(ch);
                }
                

            }

            // if (max > 1) {
            //     System.out.println((char) max_index);
            // }
           i++;           
        }


        

      //  System.out.println(max);
       // System.out.println((char)max_index);
        
    }

    public static void main(String[] args) {
        
        String s = "Aabb";
        
        sortCharactersByFrequency(s);
    }
}
