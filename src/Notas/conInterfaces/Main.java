package Notas.conInterfaces;

import Notas.sinInterfaces.Empleado;

public class Main {
    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args)  {
        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
