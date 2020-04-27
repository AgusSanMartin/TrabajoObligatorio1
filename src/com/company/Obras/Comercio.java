package com.company.Obras;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;
import com.company.Listable;

public class Comercio extends ObraComercial implements Listable {
    private String rubro;

    public Comercio(String direccion,
                    int mtsCuadrados,
                    int diasObra,
                    double costoMetro,
                    Arquitecto arquitecto,
                    MaestroMObra maestroMObra,
                    Obrero obrero1,
                    Obrero obrero2,
                    String obraNombre,
                    String rubro){
        super(direccion, mtsCuadrados, diasObra, costoMetro, arquitecto, maestroMObra, obrero1, obrero2, obraNombre);
        this.rubro = rubro;
    }

    public String getRubro() { return rubro; }

    @Override
    public void mostrar() {
        System.out.printf("Comercio '%s': Direccion: %s, Dias de obra: %d, Mts²: %d, Costo Empleados: %d, Rubro: %s, Costo Total de la obra: $%.2f\n"
                ,getObraNombre()
                ,getDireccion()
                ,getDiasObra()
                ,getMtsCuadrados()
                ,getCostoEmpleados()
                ,getRubro()
                ,getCostoObra());
    }
}
