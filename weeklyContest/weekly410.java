package weeklyContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class weekly410 {

    public static int finalPositionOfSnake(int n, List<String> commands) {


        int k = 0;

        int[][] grid = new int[n][n];

       
        int i = 0;
          while(i<grid.length)
         {

             int j = 0;
            while (j<grid[i].length) {

                if (commands.get(k).equals("DOWN")) {
                    i++;
                }

                if (commands.get(k).equals("UP")) {
                    i--;

                }

                if (commands.get(k).equals("RIGHT")) {
                    j++;

                }

                if (commands.get(k).equals("LEFT")) {
                    j--;

                }
                
                grid[i][j] = (i * n) + j;

                if (k <commands.size()-1) {
                k++;
                }
                else {

                return grid[i][j];

                }

            }
        }

        return 1;
    }

    public static void main(String[] args) {

        int n = 3;

        ArrayList<String> list = new ArrayList<>();

        list.add("DOWN");
        list.add("RIGHT");
        list.add("UP");
     

       System.out.println(finalPositionOfSnake(n, list));
    }
}
