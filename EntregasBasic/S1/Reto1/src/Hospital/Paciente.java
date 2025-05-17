package Hospital;

public class Paciente {
    String nombre;
    int edad;
    String num_EXP;

    public void mostrarInfo() {
        System.out.println("Información del paciente: ");
        System.out.println("Paciente " + nombre);
        System.out.println("Edad " + edad);
        System.out.println("Expediente " + num_EXP);
    }
}



