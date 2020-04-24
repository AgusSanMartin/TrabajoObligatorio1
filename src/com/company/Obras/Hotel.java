package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;

public class Hotel extends ObraComercial{
    private int pisos;

    public Hotel(String direccion,
                 int mtsCuadrados,
                 int diasObra,
                 double costoMetro,
                 Arquitecto arquitecto,
                 MaestroMObra maestroMObra,
                 Obrero obrero1,
                 Obrero obrero2,
                 String obraNombre,
                 int pisos){
        super(direccion, mtsCuadrados, diasObra, costoMetro, arquitecto, maestroMObra, obrero1, obrero2, obraNombre);
        this.pisos = pisos;
    }

    public int getPisos() { return pisos; }

}
