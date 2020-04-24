package com.company.Empleados;

public class Empleado {
    private String DNI;
    private String nombre;
    private String TEL;
    private int costoPdia = 0;

    public Empleado(String DNI,String nombre,String TEL){
        this.DNI = DNI;
        this.nombre = nombre;
        this.TEL = TEL;
    }

    public String getDNI() { return DNI; }

    public String getNombre() { return nombre; }

    public String getTEL() { return TEL; }

    public int getCostoPdia() { return costoPdia; }

    public void setCostoPdia(int costoPdia) { this.costoPdia = costoPdia; }
}
