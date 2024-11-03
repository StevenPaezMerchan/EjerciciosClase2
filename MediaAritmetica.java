import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("A continuación vamos a realizar la media aritmetica de tres numeros solicitados a usted.");

        System.out.println("Por favor digite el primer numero: ");
        var num1 = entrada.nextInt();
        System.out.println("Por favor digite el segundo numero: ");
        var num2 = entrada.nextInt();
        System.out.println("Por favor digite el tercer numero: ");
        var num3 = entrada.nextInt();

        var calcularPromedio = (num1 + num2 + num3) / 3;

        System.out.printf("La media aritmetica de los numeros ingresados por el usuario es: %d", calcularPromedio);
        
        entrada.close();
    }
}
