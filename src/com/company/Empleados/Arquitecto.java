package com.company.Empleados;

public class Arquitecto extends  Empleado{
    private String matricula;

    public Arquitecto(String nombre, String DNI, String TEL,String Matricula){
        super(nombre, DNI, TEL);
        this.matricula = Matricula;
        this.setCostoPdia(2000);
    }

    public String getMatricula() { return matricula; }


    public void crearPLano(){
        System.out.println("Creando mi proximo plano.");
    }

}
