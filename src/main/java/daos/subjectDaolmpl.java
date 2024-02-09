package daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.subject;

public class subjectDaolmpl implements subjectDao{
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public subjectDaolmpl() {
		factory = Persistence.createEntityManagerFactory("Examen01");
		em = factory.createEntityManager();
	}
	

	@Override
	public void create(subjectDao subject) {
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();
		
	}

	@Override
	public void update(subjectDao subject) {
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
	
		}
		
	}

	
	
	@Override
	public void delete(Integer id) {
		subjectDao subject = find(id);
		
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();
	}

	@Override
	public subjectDao find(Integer id) {
	
		return em.find(subjectDao.class, id);
	}

	@Override
	public List<subjectDao> findAll() {
		Query query = em.createNamedQuery("subject.findAll");
		List<subjectDao> lista = query.getResultList();
		return lista;
	}

}
