import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var SaldoInicial = 1000.00;
        int opcion;

        do {
            System.out.println("Bienvenido al cajero automático PibyCash <3");
            System.out.println("Por favor elija una opción del menú a continuación: ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir :( ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                //Opción 1 consulta de saldo
                case 1 -> {
                    System.out.println("Tu PibyCash actual es de: $" + SaldoInicial);
                }
                //Opción 2 deposito de dinero
                case 2 -> {
                    System.out.println("Ingresa la cantidad a depositar en tu PibyCuenta :) : ");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();

                    if (deposito <= 0) {
                        System.out.println("Por favor inserte una cantidad mayor a 0");
                        continue;
                    } else {
                        SaldoInicial += deposito;
                        System.out.println("Enhorabuena!!, ahora tienes un monto total de: $ " + SaldoInicial);
                    }
                }
                //opcion 3 retiro de dinero
                case 3 -> {
                    System.out.println("¿cuanto PibyCash vas a retirar?: ");
                    double retiro = scanner.nextDouble();
                    scanner.nextLine();

                    if (retiro <=0) {
                        System.out.println("debe retirar un monto mayor a 0 :( ");
                        continue;
                    }
                    if (retiro > SaldoInicial) {
                        System.out.println("no tienes el Pibycash necesario para retirar esa cantidad, solo tienes: $" + SaldoInicial);
                    } else {
                        SaldoInicial -= retiro;
                        System.out.println("despues de tu retiro te quedan $" + SaldoInicial);
                    }
                }
                //opcion4 salir
                case 4 -> {
                    System.out.println("Nos vemos Piby!!!");
                }
                default -> {
                    System.out.println("me temo que esa accion no esta disponible por el momento :/");
                }
            }
        } while (opcion != 4);

        scanner.close();
    }

}