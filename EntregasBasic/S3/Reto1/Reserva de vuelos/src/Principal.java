public class Principal {
    public static void main(String[] args) {

        Pasajero pasajero = new Pasajero("Aurelio Soto", "AUR3710");
        Vuelo vuelo = new Vuelo("QRO25", "MTY", "11:11");
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Se realizó su reserva, buen viaje!\n");
        } else {
            System.out.println("No se pudo realizar la reserva:(\n");
        }

        System.out.println(vuelo.obtenerItinerario());
        System.out.println("Reserva cancelada :(\n");
        vuelo.cancelarReserva();

        System.out.println(vuelo.obtenerItinerario());

        vuelo.reservarAsiento("Dorian Magno", "DRN1104");
        System.out.println(vuelo.obtenerItinerario());
    }
}