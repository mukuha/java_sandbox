/*This class is responsible for collecting input data and offering
ways of accessing that data from the rest of the application*/

import java.math.BigDecimal;
import java.util.Scanner;
public class Data {

    //Instance variables
    public BigDecimal value1;
    public String operation;
    public BigDecimal value2;
    public BigDecimal result;
    public String decision;

    //No-argument constructor This is the constructor
    public Data() {}

    //Setter method for value1
    public void setValue1(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.value1 = new BigDecimal(scanner.nextLine());
    }

    //Overloading
    public void setValue1(BigDecimal value1Resetter) {
        this.value1 = value1Resetter;
    }

    //Setter method for operation
    public void setOperation(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.operation = scanner.nextLine();
    }

    //Getter method for operation
    public String getOperation() {
        return operation;
    }

    //Setter method for value2
    public void setValue2(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.value2 = new BigDecimal(scanner.nextLine());
    }

    //Setter method for result
    public void setResult() {
        switch (operation) {
            case "+" -> result = MathHelper.add(value1, value2);
            case "-" -> result = MathHelper.subtract(value1, value2);
            case "*" -> result = MathHelper.multiply(value1, value2);
            default -> result = MathHelper.divide(value1, value2);
        }
    }

    //Getter method for result
    public BigDecimal getResult() { return result; }

    //Setter method for decision
    public void setDecision(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        this.decision=scanner.nextLine();
    }

    //Getter method for decision
    public String getDecision() { return decision; }
}