package com.cgoettert;

import com.cgoettert.mappedsuperclass.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Charles
 */
public class Main {
    
    private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("teste");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = EMF.createEntityManager();
        
        Person p = new Person();
        p.setAge(1);
        
        em.close();
        EMF.close();
    }
    
}
