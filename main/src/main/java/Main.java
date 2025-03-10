import org.example.core.*;

public class Main {
    public static void main(String[] args) {
        ConsoleReaderWriter consoleReaderWriter = new ConsoleReaderWriter();
        CalculatorService calculatorService = new CalculatorService(consoleReaderWriter);

        calculatorService.runCalculator();
    }
}
