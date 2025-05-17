public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("El lago de los Pibys, ", 800.00);
        Entrada entrada2 = new Entrada("El fantasma de la opera, ", 1000.00);
        Entrada entrada3 = new Entrada("Pibeo & Julieta, ", 600.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();

        //Reto adicional
        EntradaRecord entrada4 = new EntradaRecord("El lago de los Pibys con Sinfonica en vivo, ", 3200.00);
        entrada4.mostrarInformacion();

    }
}
