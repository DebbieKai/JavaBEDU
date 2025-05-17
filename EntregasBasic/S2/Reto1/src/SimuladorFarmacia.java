import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        String nombre;
        double precioU;
        int cantidad;

        Scanner scanner = new Scanner(System.in);
//solicitar los datos
        System.out.print("Nombre del medicamento: ");
        nombre = scanner.nextLine();
        System.out.print("Precio Unitario: ");
        precioU = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cantidad de piezas: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        //calculo del total
        double Total = precioU * cantidad;

        //si el total supera los 500...
        var Descuento = Total > 500;
        double aplica = Descuento ? Total * 0.15 : 0;

        //total a pagar
        double DescuentoTotal = Total - aplica;

        //mostrar info
        System.out.println("Resumen de su compra: ");
        System.out.println("Medicamento/s: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + precioU);
        System.out.println("Total: " + Total);
        System.out.println("¿Aplica Descuento?: " + Descuento);
        System.out.println("Usted ahorra: $" + aplica);
        System.out.println("Total a pagar: $" + DescuentoTotal);

    }

}
