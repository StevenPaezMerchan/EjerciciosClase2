import java.util.Scanner;

public class CalculadoraBasica{

    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);

        double num1;
        double num2;

        System.out.println("Por favor digite el primer numero: ");
        num1 = entrada.nextDouble();
        
        System.out.println("Por favor digite el segundo numero: ");
        num2 = entrada.nextDouble();

        var suma = num1 + num2;
        var resta = num1 - num2;
        var multiplicacion = num1 * num2;
        var division = num1 / num2;

        System.out.println("La suma de los numeros ingresados es: "+ String.format("%.1f", suma));
        System.out.println("La resta de los numeros ingresados es: "+ String.format("%.1f", resta));
        System.out.println("La multiplicacion de los numeros ingresados es: "+ String.format("%.1f", multiplicacion));
        System.out.println("La division de los numeros ingresados es: "+ String.format("%.1f", division));
        
        entrada.close();
    }
}