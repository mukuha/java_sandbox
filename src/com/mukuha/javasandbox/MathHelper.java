package com.mukuha.javasandbox;

import java.math.BigDecimal;

/**
 * This class contains methods that do the actual math calculations
 */
public class MathHelper {

    /**
     * Adds two values
     * @param value1 The first value as a numeric value
     * @param value2 The second value as a numeric value
     */
    public static BigDecimal add(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }

    /**
     * Finds the difference between two values
     * @param value1 The first value as a numeric value
     * @param value2 The second value as a numeric value
     */
    public static BigDecimal subtract(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }

    /**
     * Multiplies two values
     * @param value1 The first value as a numeric value
     * @param value2 The second value as a numeric value
     */
    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    /**
     * Divides a number by another; finds the quotient
     * @param value1 The dividend as a numeric value
     * @param value2 The divisor as a numeric value
     */
    public static BigDecimal divide(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2);
    }
}