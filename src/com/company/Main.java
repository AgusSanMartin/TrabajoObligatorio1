package com.company;
public class Main {

    public static void main(String[] args) {
		Empresa emp = new Empresa("Martinez Hnos");

		emp.getaList().get(2).crearPLano();
		emp.getmList().get(1).Construir();
		emp.getoList().get(1).Construir();

		emp.gethList().get(0).mostrarEmpleados();
		emp.getcList().get(1).mostrarEmpleados();
		emp.getoDList().get(0).mostrarEmpleados();
		emp.mostrarObras();
    }
}
