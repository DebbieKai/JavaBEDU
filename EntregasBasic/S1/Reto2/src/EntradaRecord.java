public record EntradaRecord(String evento, double precio){
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + "precio: $" + precio);
    }
}
