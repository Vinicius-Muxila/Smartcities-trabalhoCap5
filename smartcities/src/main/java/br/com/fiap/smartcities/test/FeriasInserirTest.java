package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Ferias;

public class FeriasInserirTest {
	
	public static void main(String[] args) {
	
		EntityManager em = null;

	
	try {
		em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
		em.getTransaction().begin();
		
		Ferias fer = new Ferias();
		fer.setSituacao("Aprovada");
		fer.setObservacao("Atrasadas");
		
		em.persist(fer);
		em.getTransaction().commit();
		
	} catch (Exception e) {
		if (em != null && em.getTransaction().isActive()) {
			em.getTransaction().rollback();
		}
		e.printStackTrace();
	} finally{
		if (em != null) {
			em.close();
		}
		System.exit(0);
	}
  }
}



