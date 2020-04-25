package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.Empleado;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;

import java.util.ArrayList;
import java.util.List;

public class Obra {
    private String direccion;
    private int mtsCuadrados;
    private int diasObra;
    private double costoMetro;
    private List<Empleado> eList = new ArrayList<Empleado>();
    private int costoEmpleados = 0;
    private double costoObra = 0;

    public Obra(String direccion,
                int mtsCuadrados,
                int diasObra,
                double costoMetro,
                Arquitecto arquitecto,
                MaestroMObra maestroMObra,
                Obrero obrero1,
                Obrero obrero2){
        this.direccion = direccion;
        this.mtsCuadrados = mtsCuadrados;
        this.diasObra = diasObra;
        this.costoMetro = costoMetro;
        this.eList.add(arquitecto);
        this.eList.add(maestroMObra);
        this.eList.add(obrero1);
        this.eList.add(obrero2);

    }

    public String getDireccion() { return direccion; }

    public int getMtsCuadrados() { return mtsCuadrados; }

    public int getDiasObra() { return diasObra; }

    public double getCostoMetro() { return costoMetro; }

    public List<Empleado> geteList() { return eList; }

    public int getCostoEmpleados() { return costoEmpleados; }

    public double getCostoObra() { return costoObra; }

    public void setCostoEmpleados(int costoEmpleados) { this.costoEmpleados = costoEmpleados; }

    public void setPrecioObra(double costoObra) { this.costoObra = costoObra; }

    public void calcularCostoEmpleados(){
        if (this.costoEmpleados == 0){
            for (Empleado e : geteList() ) {
                setCostoEmpleados(costoEmpleados + e.getCostoPdia());
            }
        }else
            System.out.println("El costo de los empleados ya a sido calculado.");

    }
    public void calcularCostoObra(){
        if (this.costoObra == 0){
            calcularCostoEmpleados();
            setPrecioObra((getCostoMetro() * getMtsCuadrados()) + (getCostoEmpleados()) * getDiasObra());
        }else
            System.out.println("El costo de la obra ya a sido calculado.");
    }
    public void addMaestroMObra(MaestroMObra maestroMObra){
        int contMaestros = 0;
        for (Empleado e : geteList()) {
            if (e instanceof MaestroMObra)
                contMaestros++;
        }
        if (contMaestros >= 3){
            System.out.println("No se puede agregar otro Maestro Mayor de Obra, la obra posee 3.");
        }else
            geteList().add(maestroMObra);
    }
    public void addObrero(Obrero obrero){
        geteList().add(obrero);
    }
}
