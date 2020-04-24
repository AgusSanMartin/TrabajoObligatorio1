package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;

public class ObraDomestica extends Obra{
    private int cantHabitaciones;

    public ObraDomestica(String direccion,
                         int mtsCuadrados,
                         int diasObra,
                         double costoMetro,
                         Arquitecto arquitecto,
                         MaestroMObra maestroMObra,
                         Obrero obrero1,
                         Obrero obrero2,
                         int cantHabitaciones){
        super(direccion, mtsCuadrados, diasObra, costoMetro, arquitecto, maestroMObra, obrero1, obrero2);
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantHabitaciones() { return cantHabitaciones; }


}
