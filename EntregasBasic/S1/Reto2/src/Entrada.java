public class Entrada {
    String evento;
    double precio;


    //contructor que se inicializa apartir de los parametros de la clase, dichos parametros estan en el parentesis
    public Entrada(String evento, double precio) {
        this.evento = evento;
        /* this nombra al atributo para mencionar que tendra el parametro del constructor */
        this.precio = precio;
    }

    //metodo publico que muestra info
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + "Precio: $" + precio);
    }

}
