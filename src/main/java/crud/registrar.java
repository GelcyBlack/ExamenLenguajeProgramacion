package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.subject;

public class registrar {
	
	
public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Examen01");
	EntityManager em = factory.createEntityManager();
	
	em.getTransaction().begin();
	
	
	subject subject = new subject();
	subject.setIdSubject(3); 
	subject.setSubject("can 001"); 
	subject.setCredits("30"); 
	em.persist(subject);

	em.getTransaction().commit();	        
	System.out.println("Subject fue creado exitosamente:");
	

	}

}






