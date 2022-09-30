package ejercicios;

public class EjerciciosTemaDos {

    public static void main(String[] args) {

        double costo = 100;
        printPrecioConIVA(costo);
    }

    public static double getPrecioConIVA(double precioSinIVA){
        double IVA = 0.16; //IVA en Mexico
        double costoAgregado = IVA * precioSinIVA;
        return  precioSinIVA + costoAgregado;
    }

    public static void printPrecioConIVA(double precioSinIVA){
        double precioConIVA = getPrecioConIVA(precioSinIVA);
        System.out.println("El precio con IVA del producto es " + precioConIVA);
    }
}
