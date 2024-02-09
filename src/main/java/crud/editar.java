package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.subject;


public class editar {
	
	
	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Examen01");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        
        subject subject = em.find(subject.class, 1); 
        if (subject != null) {
            
            subject.setSubject("sing 02"); 
            subject.setCredits("40"); 

            em.merge(subject);
            
            em.getTransaction().commit();
            
            
            System.out.println("Subject editado");
            System.out.println("idSubject: " + subject.getIdSubject());
            System.out.println("subject: " + subject.getSubject());
            System.out.println("Créditos: " + subject.getCredits());
        } else {
            System.out.println("no se encontraron datos.");
	
        }
        
	}

}



