package Hospital;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Ingresa el nombre del paciente: ");
        p1.nombre = input.nextLine();

        System.out.println("Ingrese la edad del paciente: ");
        p1.edad = input.nextInt();

        input.nextLine(); //nextLine limpia los datos almacenados en una entrada para recibir una nueva entrada, se repite este llamado dado que nextInt no puede recopilar una nueva entrada.

        System.out.println("Ingresa el número de expediente del paciente: ");
        p1.num_EXP = input.nextLine();

        input.close(); //cierra el scanner para indicar que no se pediran mas datos

        p1.mostrarInfo();
        
    }
}
