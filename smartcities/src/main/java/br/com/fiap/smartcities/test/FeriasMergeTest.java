package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Ferias;

public class FeriasMergeTest {
	
public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			
			em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
			
			Ferias fer = new Ferias();
			fer.setObservacao(null);
			fer.setSituacao("Cancelada");
			
			em.merge(fer);
		
			em.getTransaction().begin();
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








	