package com.akkodis.app;

import com.akkodis.modelo.Empleado;

import javax.persistence.*;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpresaPU");
        EntityManager em = emf.createEntityManager();

        // Crear un nuevo empleado
        em.getTransaction().begin();
        Empleado nuevo = new Empleado("Alicia", "IT", 3000.00);
        em.persist(nuevo);
        em.getTransaction().commit();
        System.out.println("Empleado creado con ID: " + nuevo.getId());

        //Equivalente a la sentencia SQL:
        //INSERT INTO empleado (nombre, departamento, salario) VALUES ('Alicia', 'IT', 3000.00)

        // Leer todos los empleados "SELECT * FROM empleado" ******
//        List<Empleado> lista = em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
//        lista.forEach(e -> System.out.println(e.getId() + " - " + e.getNombre()));
     // Leer un empleado por su ID
        Empleado e = em.find(Empleado.class, 1);  // busca el empleado con id 1
        if(e != null) {
            System.out.println("Empleado 1: " + e.getNombre() + ", Departamento: " + e.getDepartamento());
        }

        // Leer todos los empleados (consulta JPQL)
        List<Empleado> lista = em.createQuery("SELECT emp FROM Empleado emp", Empleado.class)
                                 .getResultList();
        System.out.println("Total empleados: " + lista.size());
        for(Empleado emp : lista) {
            System.out.println(emp.getId() + " - " + emp.getNombre());
        }


        // Actualizar un empleado
        em.getTransaction().begin();
//        Empleado e1 = em.find(Empleado.class, nuevo.getId());
        Empleado e1 = em.find(Empleado.class, 1);
        if (e1 != null) {
            e1.setSalario(3511.00);
        }
        em.getTransaction().commit();

        // Eliminar un empleado
//        em.getTransaction().begin();
//        Empleado e2 = em.find(Empleado.class, nuevo.getId());
//        if (e2 != null) {
//            em.remove(e2);
//        }
//        em.getTransaction().commit();

        em.close();
        emf.close();
    	   
    }
}
