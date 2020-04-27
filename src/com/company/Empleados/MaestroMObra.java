package com.company.Empleados;

import com.company.Constructores;
import com.company.Listable;

public class MaestroMObra extends Empleado implements Constructores, Listable {
    private int edad;

    public MaestroMObra(String nombre, String DNI, String TEL, int edad){
        super(DNI, nombre, TEL);
        this.edad = edad;
        this.setCostoPdia(1800);
    }

    public int getEdad() { return edad; }

    @Override
    public void construir() { System.out.printf("Maestro mayor: %s y superviso las construcciones\n", getNombre()); }

    @Override
    public void mostrar() {
        System.out.printf("Maestro Mayor: %s, DNI: %s, TEL: %s, Edad: %s, Costo: %s\n"
                ,getNombre()
                ,getDNI()
                ,getTEL()
                ,getEdad()
                ,getCostoPdia());
    }
}
