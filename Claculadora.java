public class Claculadora {

    public static void main(String [] args){

        var num1 = 6;
        var num2 = 2;
        var num3 = 1;
        var num4 = 2;

        var operacionCorrecta = num1 / num2 *(num3 + num4);
        System.out.println(operacionCorrecta);

        var operacionErronea = num1 / ( num2 * (num3 + num4));
        System.out.println(operacionErronea);

        System.out.printf("La respuesta correcta de la operacion es %d, ya que la calculadora con el resultado %d esta tomando la jerarquía de las operaciones de derecha a izquiera, es decir tiene mayor relevancia la multiplicacion.", operacionCorrecta, operacionErronea);
    }
}