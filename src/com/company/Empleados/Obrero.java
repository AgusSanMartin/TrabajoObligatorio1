package com.company.Empleados;

import com.company.Constructores;
import com.company.Listable;

public class Obrero extends Empleado implements Constructores, Listable {
    private int edad;

    public Obrero(String nombre, String DNI, String TEL, int edad){
        super(DNI, nombre, TEL);
        this.edad = edad;
        this.setCostoPdia(1500);
    }

    public int getEdad() { return edad; }

    @Override
    public void construir() {
        System.out.printf("Obrero: %s construyendo!\n",getNombre());
    }

    @Override
    public void mostrar() {
        System.out.printf("Obrero: %s, DNI: %s, TEL: %s, Edad: %s, Costo: %s \n"
                ,getNombre()
                ,getDNI()
                ,getTEL()
                ,getEdad()
                ,getCostoPdia());
    }
}
