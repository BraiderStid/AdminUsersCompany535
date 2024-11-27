package com.mycompany.adminuserscompany535;
import java.util.Scanner;

public class AdminUsersCompany535 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el nombre del empleado regular:");
        String nombreEmpleado = scanner.nextLine();
        System.out.println("Ingrese el email del empleado regular:");
        String emailEmpleado = scanner.nextLine();
        EmpleadoRegular empleado = new EmpleadoRegular(nombreEmpleado, emailEmpleado);
        

        System.out.println("Ingrese el nombre del supervisor:");
        String nombreSupervisor = scanner.nextLine();
        System.out.println("Ingrese el email del supervisor:");
        String emailSupervisor = scanner.nextLine();
        Supervisor supervisor = new Supervisor(nombreSupervisor, emailSupervisor);
        

        System.out.println("Ingrese el nombre del administrador:");
        String nombreAdmin = scanner.nextLine();
        System.out.println("Ingrese el email del administrador:");
        String emailAdmin = scanner.nextLine();
        Administrador administrador = new Administrador(nombreAdmin, emailAdmin);


        System.out.println("\n¿Deseas ver los datos de los empleados? Responde 1 para sí o 2 para no:");
        int respuesta = scanner.nextInt();
        scanner.nextLine(); // 

        if (respuesta == 1) {
            
            System.out.println("\nIngresa una opción numérica para saber qué rol tiene el usuario:");
            System.out.println("1. Empleado Regular");
            System.out.println("2. Supervisor");
            System.out.println("3. Administrador");
            System.out.print("Elige una opción (1/2/3): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            // cada usuario tiene su propia jerarquia y dependiendo de la jerarquia se pueden ver los datos de los usuarios con igual o menor jerarquia.
            switch (opcion) {
                case 1:
                    // El empleado solo puede ver sus datos
                    System.out.println("\nDetalles del Empleado Regular:");
                    empleado.mostrarDetalles();
                    break;

                case 2:
                    // El supervisor puede ver sus datos y los de los empleados
                    System.out.println("\nDetalles del Supervisor:");
                    supervisor.mostrarDetalles();
                    System.out.println("\nDetalles de los Empleados:");
                    empleado.mostrarDetalles();
                    break;

                case 3:
                    // El administrador puede ver todos los datos
                    System.out.println("\nDetalles del Administrador:");
                    administrador.mostrarDetalles();
                    System.out.println("\nDetalles del Supervisor:");
                    supervisor.mostrarDetalles();
                    System.out.println("\nDetalles de los Empleados:");
                    empleado.mostrarDetalles();
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } else {
            System.out.println("Programa cerrado.");
        }

        
        scanner.close();
    }
}
