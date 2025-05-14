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

        // Leer todos los empleados
        List<Empleado> lista = em.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
        lista.forEach(e -> System.out.println(e.getId() + " - " + e.getNombre()));

        // Actualizar un empleado
//        em.getTransaction().begin();
//        Empleado e1 = em.find(Empleado.class, nuevo.getId());
//        if (e1 != null) {
//            e1.setSalario(3500.00);
//        }
//        em.getTransaction().commit();

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
