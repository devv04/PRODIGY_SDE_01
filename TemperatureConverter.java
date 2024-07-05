import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius is equal to " + kelvin + " Kelvin");

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}