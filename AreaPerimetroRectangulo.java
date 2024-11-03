import java.util.Scanner;

public class AreaPerimetroRectangulo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular el area y perimetro de un rectangulo, vamos a solicitar los siguientes datos");

        System.out.print("Por favor digite la longitud del rectangulo: ");
        var longitud = entrada.nextDouble();

        System.out.print("Por favor digite el ancho del rectangulo: ");
        var ancho = entrada.nextDouble();

        var calcularArea = longitud * ancho;
        var calcularPerimetro = 2 * longitud + 2 * ancho;
        
        System.out.println("El area del rectangulo es: " + String.format("%.1f", calcularArea) +" cm2");
        System.out.println("El perimetro del rectangulo es: "+ String.format("%.1f", calcularPerimetro)+" cm");

        entrada.close();

    }
}
