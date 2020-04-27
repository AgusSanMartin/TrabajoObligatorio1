package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;
import com.company.Listable;

public class ObraDomestica extends Obra implements Listable {

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


    @Override
    public void mostrar() {
        System.out.printf("Obra domestica: Direccion: %s, Dias de obra: %d, Mts²: %d, Costo Empleados: %d, Habitaciones: %d, Costo Total de la obra: $%.2f\n"
                ,getDireccion(),
                getDiasObra(),
                getMtsCuadrados(),
                getCostoEmpleados(),
                getCantHabitaciones(),
                getCostoObra());
    }
}
