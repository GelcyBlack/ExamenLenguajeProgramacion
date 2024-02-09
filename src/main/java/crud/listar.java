package crud;


import model.subject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class listar {
	

		
	public static void main(String[] args) {
		
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Examen01");
        EntityManager em = factory.createEntityManager();

        Query query = em.createNamedQuery("subject.findAll");

		
		List<subject> subjectList = (List<subject>) query.getResultList();
		
		
		for(subject r: subjectList) {
			System.out.println(r.getIdSubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}

	}

}


