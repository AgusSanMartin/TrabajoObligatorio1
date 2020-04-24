package com.company.Empleados;

import com.company.Constructores;

public class Obrero extends Empleado implements Constructores {
    private int edad;

    public Obrero(String nombre, String DNI, String TEL, int edad){
        super(nombre, DNI, TEL);
        this.edad = edad;
        this.setCostoPdia(1500);
    }

    public int getEdad() { return edad; }

    @Override
    public void Construir() {
        System.out.println("“Soy maestro y superviso las construcciones");
    }
}