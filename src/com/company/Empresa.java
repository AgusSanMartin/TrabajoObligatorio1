package com.company;
import com.company.Obras.*;
import com.company.Empleados.*;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Obra> obrasList = new ArrayList<>();
    private List<Empleado> empleadosList = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
        Arquitecto A1 = new Arquitecto("Agustin San Martin", "39.170.571", "+542236685790", "AB2369");
        Arquitecto A2 = new Arquitecto("Monica Rivera", "40.521.689", "+542235252627", "AB7524");
        Arquitecto A3 = new Arquitecto("Carmen Almejun", "18.542.014", "+542235895632", "AA0849");
        MaestroMObra M1 = new MaestroMObra("Hector Abel San Martin", "17.457.935", "+542235272625", 58);
        MaestroMObra M2 = new MaestroMObra("Diego Gilmore", "28.263.141", "+542235457895", 32);
        MaestroMObra M3 = new MaestroMObra("Marcela Coni", "15.369.253", "+542235653291", 61);
        MaestroMObra M4 = new MaestroMObra("German Garoto", "30.784.854", "+542235747488", 45);
        MaestroMObra M5 = new MaestroMObra("Brian June", "38.143.558", "+542235379563", 25);
        Obrero O1 = new Obrero("Matias Torres", "36.417.325", "+542236858796", 28);
        Obrero O2 = new Obrero("Matias Guerra", "36.665.527", "+542234213755", 28);
        Obrero O3 = new Obrero("Arnold Perez", "35.894.337", "+542236663322", 27);
        Obrero O4 = new Obrero("Agustin Perez", "38.832.257", "+542236774547", 25);
        Obrero O5 = new Obrero("Matias Ponce", "37.757.684", "+542236665235", 23);
        Obrero O6 = new Obrero("Marcelo Finamore", "20.421.587", "+542236457854", 47);
        Obrero O7 = new Obrero("Pablo Guzman", "22.680.054", "+542235631212", 45);
        Obrero O8 = new Obrero("Pablo Gimenez", "25.888.520", "+542235558877", 40);
        Obrero O9 = new Obrero("Nicolas Tuma", "28.445.120", "+542236557468", 37);
        Obrero O10 = new Obrero("Tomas Garmendia", "29.665.430", "+542235741788", 36);
        Obrero O11 = new Obrero("Fernando Ferreyra", "28.245.021", "+542236241446", 37);

        this.empleadosList.add(A1);
        this.empleadosList.add(A2);
        this.empleadosList.add(A3);
        this.empleadosList.add(M1);
        this.empleadosList.add(M2);
        this.empleadosList.add(M3);
        this.empleadosList.add(M4);
        this.empleadosList.add(M5);
        this.empleadosList.add(O1);
        this.empleadosList.add(O2);
        this.empleadosList.add(O3);
        this.empleadosList.add(O4);
        this.empleadosList.add(O5);
        this.empleadosList.add(O6);
        this.empleadosList.add(O7);
        this.empleadosList.add(O8);
        this.empleadosList.add(O9);
        this.empleadosList.add(O10);
        this.empleadosList.add(O11);


        Hotel H1 = new Hotel("Salta 2233", 120, 180, 25, A1, M1, O1, O2, "Sheraton", 40);
        Hotel H2 = new Hotel("Av.Luro 1102", 100, 240, 45, A2, M5, O7, O8, "Thames VII", 50);
        Comercio C1 = new Comercio("España 3275", 60, 90, 12.5, A2, M2, O3, O4, "Especias Bar", "Resto Bar Restaurante");
        Comercio C2 = new Comercio("Güemes 2445", 75, 120, 32.5, A1, M4, O9, O10, "Le Magritte", "Resto Cafe");
        ObraDomestica OD1 = new ObraDomestica("Gascon 1452", 200, 160, 23.2, A3, M3, O5, O6, 8);

        H1.addMaestroMObra(M5);
        H1.addMaestroMObra(M4);
        H1.addObrero(O9);
        H1.addObrero(O11);
        H1.addObrero(O10);
        H1.addObrero(O5);

        H2.addMaestroMObra(M2);
        H2.addObrero(O1);
        H2.addObrero(O10);
        H2.addObrero(O6);
        H2.addObrero(O3);
        H2.addObrero(O4);

        C1.addMaestroMObra(M1);
        C1.addObrero(O2);
        C1.addObrero(O1);
        C1.addObrero(O4);
        C1.addObrero(O11);

        C2.addMaestroMObra(M1);
        C2.addObrero(O2);
        C2.addObrero(O1);
        C2.addObrero(O4);
        C2.addObrero(O11);
        C2.addObrero(O5);
        C2.addObrero(O6);

        OD1.addMaestroMObra(M5);
        OD1.addObrero(O4);
        OD1.addObrero(O2);
        OD1.addObrero(O11);
        OD1.addObrero(O3);

        H1.calcularCostoObra();
        H2.calcularCostoObra();
        C1.calcularCostoObra();
        C2.calcularCostoObra();
        OD1.calcularCostoObra();

        this.obrasList.add(H1);
        this.obrasList.add(H2);
        this.obrasList.add(C1);
        this.obrasList.add(C2);
        this.obrasList.add(OD1);
    }

    public String getNombre() { return nombre; }

    public List<Empleado> getempleadosList() { return empleadosList; }

    public List<Obra> getObrasList() { return obrasList; }

    public void mostrarObras(){
        System.out.print("Listado de obras: \n");
        for (Obra o: obrasList
        ) {
            if (o instanceof ObraDomestica){
                ObraDomestica oD = (ObraDomestica) o;
                oD.mostrar();
            }else if (o instanceof  Hotel){
                Hotel h = (Hotel) o;
                h.mostrar();
            }else if (o instanceof  Comercio){
                Comercio c = (Comercio) o;
                c.mostrar();
            }
        }
    }

    public Empleado getEmpleado(int index) {
        Empleado e = getempleadosList().get(index);
        if (e instanceof Arquitecto){
            Arquitecto a = (Arquitecto) e;
            return a;
        }else if (e instanceof  MaestroMObra){
            MaestroMObra m = (MaestroMObra) e;
            return m;
        }else {
            Obrero o = (Obrero) e;
            return o;
        }
    }

    public void mostrarEmpleados(){
        System.out.println("Listado de empleados: \n");
        for (Empleado e: empleadosList
        ) {
            if (e instanceof Arquitecto){
                Arquitecto a = (Arquitecto) e;
                a.mostrar();
            }else if (e instanceof  MaestroMObra){
                MaestroMObra m = (MaestroMObra) e;
                m.mostrar();
            }else if (e instanceof  Obrero){
                Obrero o = (Obrero) e;
                o.mostrar();
            }
        }
    }
}

