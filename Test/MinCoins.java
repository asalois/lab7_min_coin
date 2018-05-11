/* Author: Alex Salois
 * Date: May 11, 2018
 * Overview: Program to implement a greedy change making and use Junit testing
 * Run this using Junit, usually its some bulb or check to the left that can trigger execution
 */

import java.util.Arrays;

public class MinCoins {
    public static int[] getChange(int[] coins, int inint) {
        if (coins.length == 0 && inint <= 0) { // catch if both arguments are illegal
            throw new IllegalArgumentException("Both coins and inint have illegal inputs");
        } else {
            if (coins.length == 0) { // catch if empty array
                throw new IllegalArgumentException("You need at least one type of coin to be in the array");
            }
            if (inint <= 0) { // make sure inint is positive
                throw new IllegalArgumentException("inint needs to be at least 1");
            }
        }
        int[] out = new int[inint]; // array to hold the coins with length of the change to make sure there is enough room
        Arrays.sort(coins); // sort coins in ascending order
        int l = inint; // int to keep track of how much change is left
        int count = 0; // int to help populate the array
        for (int i = coins.length - 1; i > -1; i--) { // loop to go backwards from largest to smallest coin
            while (l >= coins[i]) {
                l -= coins[i]; // subtract the coin from the change left
                out[count] = coins[i]; // add coin to the array
                count++; // next spot in array
            }
        }
        int[] temp = new int[count]; // create an array that the correct size
        for(int i =0; i < count; i++){ // fill the array from out array
            temp[i] = out[i];
        }
        out = temp; // now make out temp to output the correct array
        return out;
    }
}

