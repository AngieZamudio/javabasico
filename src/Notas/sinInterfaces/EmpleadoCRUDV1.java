package Notas.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {
    /*
    CRUD:
    Create
    Read
    Update
    Delete
     */

    private List<Empleado> empleados =   new ArrayList();

    //CREATE guardar empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }
    public List<Empleado> findAll() {
        return empleados;
    }
}