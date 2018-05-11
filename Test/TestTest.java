/* Author: Alex Salois
 * Date: May 11, 2018
 * Overview: Program to implement a greedy change making and use Junit testing
 * Run this using Junit, usually its some bulb or check to the left that can trigger execution
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void testBothLegal() { // checks to see of both inputs are valid
        int[] array = {};
        int in = 0;
        Exception e = assertThrows(IllegalArgumentException.class, () -> {MinCoins.getChange(array,in);});
        assertEquals("Both coins and inint have illegal inputs", e.getMessage());
    }

    @Test
    void testEmptyArray() { // check input of empty array
        int[] array = {};
        int in = 1;
        Exception e = assertThrows(IllegalArgumentException.class, () -> {MinCoins.getChange(array,in);});
        assertEquals("You need at least one type of coin to be in the array", e.getMessage());
    }

    @Test
    void testNegative(){ // checks the input with negative
        int[] array = {1,5,10,25};
        int in = -1;
        Exception e = assertThrows(IllegalArgumentException.class, () -> {MinCoins.getChange(array,in);});
        assertEquals("inint needs to be at least 1", e.getMessage());
    }

    @Test
    void testEx(){ // does it work with normal params
        int[] array = {1,5,10,25};
        int in = 96;
        int[] expected = {25,25,25,10,10,1};
        assertArrayEquals(MinCoins.getChange(array, in), expected);
    }
}