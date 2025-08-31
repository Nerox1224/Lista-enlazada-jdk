import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista list = new Lista();

        boolean exit = false;
        boolean active = true;

        while (active) {
            System.out.println("Elije una de las opciones");
            System.out.println("1. Agregar número a lista");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    exit = true;
                    while (exit) {
                        System.out.print("Ingrese el numero de la lista: ");
                        int num = sc.nextInt();
                        list.agregar(num);
                        System.out.println("Desea ingresar otro número?? (1. Sí) (2. No)");
                        System.out.print("Opción: ");
                        int terminar = sc.nextInt();
                        if (terminar == 2) {
                            exit = false;
                        }
                    }
                    break;
                case 2:
                    list.Imprimir();
                    break;
                case 3:
                    active = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}