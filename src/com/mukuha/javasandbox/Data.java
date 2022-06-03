package com.mukuha.javasandbox;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This class collects input data and offers ways of
 * accessing that data from the rest of the application
 */
public class Data {

    /**
     *Stores the first value that the user types that is a numeric value
     */
    public BigDecimal value1;

    /**
     *Stores the operation the user selects
     */
    public String operation;

    /**
     *Stores the second value that the user types that is a numeric value
     */
    public BigDecimal value2;

    /**
     *Stores results of calculations
     */
    public BigDecimal result;

    /**
     *Stores decisions the user makes time to time
     */
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
     * This method overloads the setter method for value1
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