package com.company;

import com.company.Empleados.Arquitecto;
import com.company.Empleados.MaestroMObra;
import com.company.Empleados.Obrero;

public class Main {

    public static void main(String[] args) {
		Empresa emp = new Empresa("Martinez Hnos");

		System.out.printf("Empresa %s : \n", emp.getNombre());

		Arquitecto a1 = (Arquitecto) emp.getEmpleado(0);
		MaestroMObra m1 = (MaestroMObra) emp.getEmpleado(4);
		Obrero o1 = (Obrero) emp.getEmpleado(9);
		a1.crearPLano();
		m1.construir();
		o1.construir();

		emp.getObrasList().get(0).mostrarEmpleados();
		emp.getObrasList().get(4).mostrarEmpleados();
		emp.getObrasList().get(2).mostrarEmpleados();
		emp.mostrarObras();
		emp.mostrarEmpleados();
    }
}
