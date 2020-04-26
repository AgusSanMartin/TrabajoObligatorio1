package com.company.Empleados;

import com.company.Constructores;

public class MaestroMObra extends Empleado implements Constructores {
    private int edad;

    public MaestroMObra(String nombre, String DNI, String TEL, int edad){
        super(DNI, nombre, TEL);
        this.edad = edad;
        this.setCostoPdia(1800);
    }

    public int getEdad() { return edad; }

    @Override
    public void Construir() { System.out.printf("Maestro mayor: %s y superviso las construcciones\n", getNombre()); }
}
