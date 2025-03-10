
import org.example.core.ConsoleReaderWriter;
import org.example.operations.BasicOperationsService;

public class CalculatorService {
    private final ConsoleReaderWriter consoleReaderWriter;
    private final BasicOperationsService operationsService;

    public CalculatorService(ConsoleReaderWriter consoleReaderWriter) {
        this.consoleReaderWriter = consoleReaderWriter;
        this.operationsService = new BasicOperationsService();
    }

    public void runCalculator() {
        boolean running = true;
        while (running) {
            consoleReaderWriter.printMessage("Select an operation:\n1. Split\n2. Sum\n3. Multiply\n4. Subtract\n5. Exit");
            int option = consoleReaderWriter.readInt();
            switch (option) {
                case 1:
                    consoleReaderWriter.printMessage("Enter first number: ");
                    int num1 = consoleReaderWriter.readInt();
                    consoleReaderWriter.printMessage("Enter second number: ");
                    int num2 = consoleReaderWriter.readInt();
                    int div = operationsService.divide(num1, num2);
                    consoleReaderWriter.printMessage("Divide: " + div);
                    break;
                case 2:
                    consoleReaderWriter.printMessage("Enter first number: ");
                    int num3 = consoleReaderWriter.readInt();
                    consoleReaderWriter.printMessage("Enter second number: ");
                    int num4 = consoleReaderWriter.readInt();
                    int sum = operationsService.add(num3, num4);
                    consoleReaderWriter.printMessage("Sum: " + sum);
                    break;
                case 3:
                    consoleReaderWriter.printMessage("Enter first number: ");
                    int num5 = consoleReaderWriter.readInt();
                    consoleReaderWriter.printMessage("Enter second number: ");
                    int num6 = consoleReaderWriter.readInt();
                    int mult = operationsService.multiply(num5, num6);
                    consoleReaderWriter.printMessage("Multiply: " + mult);
                    break;
                case 4:
                    consoleReaderWriter.printMessage("Enter first number: ");
                    int num7 = consoleReaderWriter.readInt();
                    consoleReaderWriter.printMessage("Enter second number: ");
                    int num8 = consoleReaderWriter.readInt();
                    int sub = operationsService.subtract(num7, num8);
                    consoleReaderWriter.printMessage("Subtract: " + sub);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    consoleReaderWriter.printMessage("Invalid option.");
            }
        }
    }
}