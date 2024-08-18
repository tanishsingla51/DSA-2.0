package weeklyContest.week411;

import java.util.ArrayList;

public class index2 {

    public static long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < energyDrinkB.length; i++) {

            sumA = sumA + energyDrinkA[i];

            sumB = sumB + energyDrinkB[i];
        }
        
        if (sumA == sumB) {
            return sumA;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < energyDrinkB.length; i++) {
            
            if (energyDrinkA[i]>energyDrinkB[i]) {
                if (energyDrinkA[i] - energyDrinkB[i] > Math.max(energyDrinkA[i + 1], energyDrinkB[i + 1])) {
                    
                    list.add(energyDrinkA[i]);
                }
            }
        }


        
        return 1;
    }

    public static void main(String[] args) {

        int[] a = { 4, 1, 1 };
        int[] b = { 1, 1, 3 };

        maxEnergyBoost(a, b);

    }
}
