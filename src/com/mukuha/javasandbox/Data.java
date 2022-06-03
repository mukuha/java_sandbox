package com.mukuha.javasandbox;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This class collects input data and offers ways of
 * accessing that data from the rest of the application
 */
public class Data {

    /**
     *These are fields
     */
    public BigDecimal value1;
    public String operation;
    public BigDecimal value2;
    public BigDecimal result;
    public String decision;

    /**
     *This is the constructor, a no-argument constructor
     */
    public Data() {}

    /**
     * This is the setter method for value1
     * @param prompt a prompt that is printed in the console each time the method is called
     */
    public void setValue1(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.value1 = new BigDecimal(scanner.nextLine());
    }

    /**
     * This method overloads the setter method for the value1 field
     */
    public void setValue1(BigDecimal value1Resetter) {
        this.value1 = value1Resetter;
    }

    /**
     * This is the setter method for operation
     * @param prompt a prompt that is printed in the console each time the method is called
     */
    public void setOperation(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.operation = scanner.nextLine();
    }

        /**
     * This is the setter method for value2
     * @param prompt a prompt that is printed in the console each time the method is called
     */
    public void setValue2(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.value2 = new BigDecimal(scanner.nextLine());
    }

    /**
     * This is the setter method for result
     */
    public void setResult() {
        switch (operation) {
            case "+" -> result = MathHelper.add(value1, value2);
            case "-" -> result = MathHelper.subtract(value1, value2);
            case "*" -> result = MathHelper.multiply(value1, value2);
            default -> result = MathHelper.divide(value1, value2);
        }
    }

    /**
     * This is the setter method for decision
     * @param prompt a prompt that is printed in the console each time the method is called
     */
    public void setDecision(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.decision=scanner.nextLine();
    }
}