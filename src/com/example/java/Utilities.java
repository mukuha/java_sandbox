package com.example.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Utilities {
    public static String input;
    public static BigDecimal result;
    public static BigDecimal getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        BigDecimal value = new BigDecimal(input);
        return value;
    }

    public static String decisions(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static BigDecimal add(BigDecimal value1, BigDecimal value2) {
        BigDecimal result = value1.add(value2);
        return result;
    }

    public static BigDecimal subtract(BigDecimal value1, BigDecimal value2) {
        BigDecimal result = value1.subtract(value2);
        return result;
    }

    public static BigDecimal multiply(BigDecimal value1, BigDecimal value2) {
        BigDecimal result = value1.multiply(value2);
        return result;
    }

    public static BigDecimal divide(BigDecimal value1, BigDecimal value2) {
        BigDecimal result = value1.divide(value2);
        return result;
    }

    public static void calculation(StringBuilder stringbuilder, String operation) {

        switch (operation) {
            case "+" -> {
                result = add(Main.value1, Main.value2);
                System.out.println("----------------------------------------------------");
                stringbuilder.append(Main.value1.toString()).append(" ")
                        .append(operation).append(" ")
                        .append(Main.value2.toString()).append(" = ")
                        .append(result.toString());
                System.out.println(stringbuilder);
                System.out.println("----------------------------------------------------");
            }
            case "-" -> {
                result = subtract(Main.value1, Main.value2);
                System.out.println("----------------------------------------------------");
                stringbuilder.append(Main.value1.toString()).append(" ")
                        .append(operation).append(" ")
                        .append(Main.value2.toString()).append(" = ")
                        .append(result.toString());
                System.out.println(stringbuilder);
                System.out.println("----------------------------------------------------");
            }
            case "*" -> {
                result = multiply(Main.value1, Main.value2);
                System.out.println("----------------------------------------------------");
                stringbuilder.append(Main.value1.toString()).append(" ")
                        .append(operation).append(" ")
                        .append(Main.value2.toString()).append(" = ")
                        .append(result.toString());
                System.out.println(stringbuilder);
                System.out.println("----------------------------------------------------");
            }
            default -> {
                result = divide(Main.value1, Main.value2);
                System.out.println("----------------------------------------------------");
                stringbuilder.append(Main.value1.toString()).append(" ")
                        .append(operation).append(" ")
                        .append(Main.value2.toString()).append(" = ")
                        .append(result.toString());
                System.out.println(stringbuilder);
                System.out.println("----------------------------------------------------");

            }

        }


    }
}
