
package com.mycompany.adminuserscompany535;

public class Supervisor extends Usuario {


    public Supervisor(String nombre, String email) {
        super(nombre, email, "Supervisor");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Este es un supervisor. Puede supervisar a los empleados.");
    }
}

