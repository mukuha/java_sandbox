package com.mukuha.javasandbox;

import java.math.BigDecimal;

/**
 * This is the Main class that starts the application
 */
public class Main {
    private static int valueNumber = 1;

    /**
     * The main() method, and the only method in this class
     */
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION");
        System.out.println("----------------------------------------------------");

        Data calculation = new Data();

        aa:while (true) {

            while (true) {
                try {
                    //Value1 is inputted here
                    calculation.setValue1("Enter value" + valueNumber + ": ");
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
                //Operator to use is selected here
                calculation.setOperation("Select an Operation ( +, -, *, / ): ");
                switch (calculation.operation) {
                    case "+", "-", "*", "/" -> {}
                    default -> {
                        System.out.println("==> '" + calculation.operation + "' is unrecognized operation by this calculator\n"
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
                //Value2 is inputted here
                try {
                    calculation.setValue2("Enter value" + ++valueNumber + ": ");
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

                //All calculations for all operators are done here
                calculation.setResult();

                //Printing of results to the console happens here
                System.out.println("----------------------------------------------------");
                System.out.println(calculation.value1 + " + " + calculation.value2 + " = " + calculation.result);
                System.out.println("----------------------------------------------------");

                //Determining the next move after performing calculation and
                //printing results is determined by this loop
                while (true) {
                    calculation.setDecision("==> Select an operation ( +  - / *) to " +
                            "perform a calculation with this result (" + calculation.result + "),\n"
                            + "==> To start a new calculation, press 'n'\n"
                            + "==> To exit the application, press 'e': ");
                    switch (calculation.decision) {
                        case "+", "-", "*", "/" -> {

                            //Sets the value of value1 to the result of previous
                            //calculation to get ready for the next calculation
                            BigDecimal value1Resetter = calculation.result;
                            calculation.setValue1(value1Resetter);

                            //Sets the operator to the decision made by user to
                            //get ready for the next calculation
                            calculation.operation = calculation.decision;
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