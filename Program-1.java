import java.util.Scanner;
class CalculationException extends RuntimeException {

    public CalculationException(String message) {
        super(message);
    }
}
class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {

        if (operation == null || operation.trim().isEmpty()) {
            throw new CalculationException("Operation cannot be empty");
        }

        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "subtract":
                return a - b;

            case "multiply":
                return a * b;

            case "divide":
                if (b == 0) {
                    throw new CalculationException("Division by zero is not allowed");
                }
                return a / b;

            default:
                throw new CalculationException("Invalid operation: " + operation);
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter value of a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter value of b: ");
            double b = scanner.nextDouble();

            scanner.nextLine();

            System.out.print("Enter operation (add / subtract / multiply / divide): ");
            String operation = scanner.nextLine();

            Calculator calculator = new Calculator(a, b);
            double result = calculator.calculate(operation);

            System.out.println("Result = " + result);

        } catch (CalculationException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter correct values.");
        } finally {
            scanner.close();
        }
    }


}
