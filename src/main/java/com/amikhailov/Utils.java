package com.amikhailov;

/**
 * Created by alexander.mikhailov on 31.08.2017.
 */
public class Utils {
    public void utilityPrint(String basicInput) {
        System.out.println("======" + basicInput + "======");
    }

    /**
     * Returns math.abs for given int.
     *
     * @param input - integer to check math.abs
     * @return absolute value
     */
    public int returnAbs(Integer input) {
        if (input == null) {
            throw new IllegalArgumentException("null!");
        } else {
            return Math.abs(input);
        }
    }
}
