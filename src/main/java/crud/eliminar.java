package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.subject;


public class eliminar {
	
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Examen01");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        subject subject = em.find(subject.class, 3); 
        if (subject != null) {
            em.remove(subject);

            em.getTransaction().commit();
            
            
        System.out.println("eliminado satisfactoriamente.");
        } else {
            System.out.println("no se encontraron datos con el Id requerido.");


        }

	}
	
}
