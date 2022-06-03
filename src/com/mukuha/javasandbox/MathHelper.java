package com.mukuha.javasandbox;//This class house methods that are called to do the actual computation

import java.math.BigDecimal;
public class MathHelper {

    public static BigDecimal add(BigDecimal value1, BigDecimal value2) {
        return value1.add(value2);
    }

    public static BigDecimal subtract(BigDecimal value1, BigDecimal value2) {
        return value1.subtract(value2);
    }

    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        return value1.multiply(value2);
    }

    public static BigDecimal divide(BigDecimal value1, BigDecimal value2) {
        return value1.divide(value2);
    }
}