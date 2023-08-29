package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.Ferias;

public class FeriasAlterarTest {

public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
			Ferias fer = em.find(Ferias.class, idProcurado);
		
			em.getTransaction().begin();
			fer.setSituacao("Reprovada");
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
	
