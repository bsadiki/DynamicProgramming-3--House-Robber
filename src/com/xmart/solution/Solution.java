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
            return housesValues[1];
        return Math.max(housesValues[n - 1] + maxRobbed(housesValues, n - 2), maxRobbed(housesValues, n - 1));
    }

}
