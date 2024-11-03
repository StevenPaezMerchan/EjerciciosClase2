public class ErrorPrecio{

    public static void  main(String[] args){

        var precioPernilGramos = 5.95;
        var pernilKilo = 29.75;
        
        var calcularPrecioPorGramo = precioPernilGramos / 100; // calcular valor de 1 gramo
        System.out.printf("El precio de 1 gramo de pernil es de: $%f%n", calcularPrecioPorGramo);

        var calcularPrecioCorrectoKilo = calcularPrecioPorGramo * 1000; // calcular valor de 1 kilo
        System.out.printf("El precio correcto del pernil por kilo es de: $%f%n", calcularPrecioCorrectoKilo);

        System.out.printf("El vendedor indico que el precio por kilo es de %f, esta realizando mal el calculo del precio.", pernilKilo);
    }
}