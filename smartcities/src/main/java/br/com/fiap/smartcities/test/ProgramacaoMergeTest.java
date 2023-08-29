package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.ProgramacaoFerias;

public class ProgramacaoMergeTest {

public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			
			em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
			
			ProgramacaoFerias prog = new ProgramacaoFerias();
			prog.setObservacao(null);
			prog.setSituacao("Cancelada");
			
			em.merge(prog);
		
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

