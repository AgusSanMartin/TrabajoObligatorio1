package com.company.Empleados;

public class Arquitecto extends  Empleado{
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

}
