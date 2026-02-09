import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Exit");

            System.out.print("Enter input unit number: ");
            int inputUnit = sc.nextInt();
            if (inputUnit == 4) {
                System.out.println("Exiting... Stay thermodynamically chill!");
                break;
            }

            System.out.print("Enter output unit number: ");
            int outputUnit = sc.nextInt();
            if (outputUnit == 4) {
                System.out.println("Exiting... Cheers!");
                break;
            }

            if (inputUnit < 1 || inputUnit > 3 || outputUnit < 1 || outputUnit > 3) {
                System.out.println("Invalid unit choice. Try again.");
                continue;
            }

            System.out.print("Enter temperature: ");
            double inputTemp = sc.nextDouble();
            double celsiusTemp = 0;
            double convertedTemp = 0;

            // Convert input to Celsius
            if (inputUnit == 1) {
                celsiusTemp = inputTemp;
            }
            else if (inputUnit == 2) {
                celsiusTemp = (inputTemp - 32) * 5/9;
            }
            else if (inputUnit == 3) {
                celsiusTemp = inputTemp - 273.15;
            }

            // Convert Celsius to target unit
            if (outputUnit == 1) {
                convertedTemp = celsiusTemp;
            }
            else if (outputUnit == 2) {
                convertedTemp = (celsiusTemp * 9/5) + 32;
            }
            else if (outputUnit == 3) {
                convertedTemp = celsiusTemp + 273.15;
            }

            // Display result
            String[] units = {"Celsius", "Fahrenheit", "Kelvin"};
            System.out.printf("%.2f %s = %.2f %s%n", inputTemp, units[inputUnit - 1], convertedTemp, units[outputUnit - 1]);
        }

        sc.close();
    }
}
