package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;
import com.company.Listable;

public class Hotel extends ObraComercial implements Listable {
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

    @Override
    public void mostrar() {
        System.out.printf("Hotel '%s': Direccion: %s, Dias de obra: %d, Mts²: %d, Costo Empleados: %d, Pisos: %d, Costo Total de la obra: $%.2f\n"
                ,getObraNombre()
                ,getDireccion()
                ,getDiasObra()
                ,getMtsCuadrados()
                ,getCostoEmpleados()
                ,getPisos()
                ,getCostoObra());
    }
}
