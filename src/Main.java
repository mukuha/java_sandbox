import java.math.BigDecimal;

public class Main {
    public static BigDecimal value1;
    public static BigDecimal value2;
    public static String operation;
    public static int valueNumber = 1;

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION");
        System.out.println("----------------------------------------------------");
        StringBuilder stringbuilder = new StringBuilder();

        aa:while (true) {

            while (true) {

                try {
                    //WE INPUT VALUE1 HERE
                    value1 = Data.getInput("Enter value" + valueNumber + ": ");
                } catch (NumberFormatException e) {
                    System.out.println("==>The value you entered is not a number\n"
                            + "==>Please enter a number");
                    continue;
                } catch (NullPointerException e) {
                    System.out.println("==>You entered null\n"
                            + "==>Enter value1");
                    continue;
                }

                break;
            }

            while (true) {
                //WE SELECT OPERATOR HERE
                operation = Data.decisions("Select an Operation ( +, -, *, / ): ");

                switch (operation) {
                    case "+", "-", "*", "/" -> {

                    }
                    default -> {
                        System.out.println("==> '" + operation + "' is unrecognized operation by this calculator\n"
                                + "This simple calc only supports the following four operations:\n"
                                + "----------------------------------------------------\n"
                                + "Addition | Subtraction | Multiplication | Division\n"
                                + "----------------------------------------------------\n");
                        continue;
                    }
                }
                break;
            }

            bb:while (true) {
                //WE INPUT VALUE2 HERE
                try {
                    value2 = Data.getInput("Enter value" + ++valueNumber + ": ");
                } catch (NumberFormatException e) {
                    System.out.println("==>The value you entered is not a number\n"
                            + "==>Please enter a number");
                    valueNumber--;
                    continue;
                } catch (NullPointerException e) {
                    System.out.println("==>You entered null\n"
                            + "==>Enter value" + valueNumber);
                    valueNumber--;
                    continue;
                }

                Data.calculation(stringbuilder, operation);

                while (true) {
                    String decision = Data.decisions("==> Select an operation ( +  - / *) to " +
                        "perform a calculation with this result (" + Data.result + "),\n"
                        + "==> To start a new calculation, press 'n'\n"
                        + "==> To exit the application, press 'e': ");
                    switch (decision) {
                        case "+", "-", "*", "/" -> {
                            value1 = Data.result;
                            operation = decision;
                            continue bb;
                        }case "n", "N" -> {
                            valueNumber = 1;
                            continue aa;
                        }case "e", "E" -> {
                            break aa;
                        }default -> System.out.println("""
                                ==> Invalid selection
                                ==>This simple calc only supports the following four operations:
                                ----------------------------------------------------
                                Addition | Subtraction | Multiplication | Division
                                ----------------------------------------------------""");
                    }

                }
            }

        }

        System.out.println("-------------------------------");
        System.out.println("Bye bye!");
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println("Powered by Mukuha");
        System.out.println();
    }
}

