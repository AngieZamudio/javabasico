package ejercicios.interfaces;

public class CocheCRUDImpl implements CocheCRUD {

    public void save() {
        System.out.println("Save");
    }

    public void findAll() {
        System.out.println("findAll");

    }

    public void delete() {
        System.out.println("delete");
    }
}
