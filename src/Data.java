import java.math.BigDecimal;
import java.util.Scanner;

public class Data {
    public static String input;
    public static BigDecimal result;
    public static BigDecimal getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        return new BigDecimal(input);
    }

    public static String decisions(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

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
