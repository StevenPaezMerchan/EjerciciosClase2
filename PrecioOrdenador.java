public class PrecioOrdenador {
    
    public static void main(String[] args) {
        
        var pc = 660;
        var descuento = pc * 10 / 100 ;
        System.out.printf("Valor descuento: $%d%n", descuento);

        var valorTotalOrdenador = pc - descuento;
        System.out.printf("El valor total a pagar por el ordenador con todos los accesorios es de: $%d", valorTotalOrdenador);
    }
}
