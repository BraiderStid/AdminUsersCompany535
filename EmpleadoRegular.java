package com.mycompany.adminuserscompany535;


public class EmpleadoRegular extends Usuario {


    public EmpleadoRegular(String nombre, String email) {
        super(nombre, email, "Empleado Regular");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Este es un empleado regular. Acceso limitado.");
    }
}

