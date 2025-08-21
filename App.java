package com.sa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )

    {
        // Create factory and entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();

     /*   Student s=new Student();
        s.setId(101);
        s.setName("Ram");
        s.setLoc("Kolkata");

       // Start transaction
        em.getTransaction().begin();
        em.persist(s); // Persist (INSERT) student into DB
        em.getTransaction().commit(); // Commit transaction
       */


        // fetch
        Student st=em.find(Student.class,101);
        System.out.println(st);

        //Update
//        em.getTransaction().begin();
//        Student st1=em.find(Student.class,101);
//        st1.setLoc("Habra");
//        em.merge(st1);
//        em.getTransaction().commit();

        //Delete
//        em.getTransaction().begin();
//        Student st2=em.find(Student.class,102);
//        em.remove(st2);
//        em.getTransaction().commit();

        em.close();
        em.close();
    }
}
