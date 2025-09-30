package ejemplo;

public class EjercicioOperadoresLogicos3 {
    public static void main(String[] args) {

        //Un cliente recibe un descuento especial si se cumplen estas condiciones:
        //Es miembro VIP y su compra supera 100€ O
        //No es VIP pero es su cumpleaños y la compra es mayor a 50€
        //En ningún caso hay descuento si el cliente tiene pagos pendientes

        boolean clienteVip = true;
        double valorCompra = 120;
        boolean esCumpleaños = true;
        boolean tienePagosPendientes = false;
        boolean condicionesdescuento;

        //Dar valor a las variables de entrada
        //Poner la condición
        //Ver lo que debe dar y comprobar el resultado pintándolo

        condicionesdescuento = ((clienteVip && valorCompra >100) || (!clienteVip && esCumpleaños && valorCompra >50)) && (!tienePagosPendientes);
        System.out.println("El cliente tiene descuento? " + condicionesdescuento);

    }
}
