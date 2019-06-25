package com.xmart.solution;

public class Solution {
    public static void main(String[] args) {
        int[] housesValues = {1, 8, 3, 4, 9};
        System.out.println(maxRobbed(housesValues, 5));
    }

    private static int maxRobbed(int[] housesValues, int n) {
        if (n == 1)
            return housesValues[0];
        if (n == 2)
            return Math.max(housesValues[0], housesValues[1]);
        int[] maxValuesForHouseN = new int[n];
        maxValuesForHouseN[0] = housesValues[0];
        maxValuesForHouseN[1] = Math.max(housesValues[0], housesValues[1]);
        for (int i = 2; i < n; i++) {
            maxValuesForHouseN[i] = Math.max(housesValues[i] + maxValuesForHouseN[i - 2], maxValuesForHouseN[i - 1]);
        }
        return maxValuesForHouseN[n - 1];
    }
}
