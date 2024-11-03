public class PrecioCompras {
    
    public static void main(String[] args) {
        
        var pagado = 34;
        var descuento = 34 * 15 / 100;

        var valorTotal = pagado + descuento;
        System.out.printf("El precio de los pantalones sin el descuento era de: $%d euros.", valorTotal);
    }
}
