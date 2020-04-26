package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;

public class ObraComercial extends Obra{
    private String obraNombre;

    public ObraComercial(String direccion,
                         int mtsCuadrados,
                         int diasObra,
                         double costoMetro,
                         Arquitecto arquitecto,
                         MaestroMObra maestroMObra,
                         Obrero obrero1,
                         Obrero obrero2,
                         String obraNombre){
        super(direccion, mtsCuadrados, diasObra, costoMetro, arquitecto, maestroMObra, obrero1, obrero2);
        this.obraNombre = obraNombre;
    }

    public String getObraNombre() { return obraNombre; }

    @Override
    public void mostrarEmpleadosHelper() {
        System.out.printf("Lista de empleados de la obra '%s':\n",getObraNombre());
    }
}
