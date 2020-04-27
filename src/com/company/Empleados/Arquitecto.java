package com.company.Empleados;

import com.company.Listable;

public class Arquitecto extends  Empleado implements Listable {
    private String matricula;

    public Arquitecto(String nombre, String DNI, String TEL,String Matricula){
        super(DNI, nombre, TEL);
        this.matricula = Matricula;
        this.setCostoPdia(2000);
    }

    public String getMatricula() { return matricula; }


    public void crearPLano(){
        System.out.printf("Arquitecto %s : Creando mi proximo plano.\n", this.getNombre());
    }

    @Override
    public void mostrar() {
        System.out.printf("Arquitecto: %s, DNI: %s, TEL: %s, Matricula: %s, Costo: %s\n"
                ,getNombre()
                ,getDNI()
                ,getTEL()
                ,getMatricula()
                ,getCostoPdia());
    }
}
