import java.util.Scanner;

public class ConverionTemperaturas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor digite la temperatura en grados celsius: ");
        var gradosCelsius = entrada.nextDouble();

        System.out.println("Sus grados Celsius son de: " + String.format("%.1f", gradosCelsius)+"°");

        var gradosFahrenheit = gradosCelsius * 9/5 + 32;
        var gradosKelvin = gradosCelsius + 273.15;

        System.out.println("Su temperatura de grados celsius a fahrenheit es: " + gradosFahrenheit +"°");
        System.out.println("Su temperatura de grados celsius a kelvin es: " + gradosKelvin +"°");

        entrada.close();
    }
}
