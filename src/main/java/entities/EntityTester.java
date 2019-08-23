/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Renz
 */
public class EntityTester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        Employee em1 = new Employee("renz", "amager", 1000);
        Employee em2 = new Employee("oliver", "amager", 1000);
        try {
            em.getTransaction().begin();
            em.persist(em1);
            em.persist(em2);
            em.getTransaction().commit();
            System.out.println(em1.getName());
        } finally {
            em.close();
        }
    }
}
