package br.com.fiap.smartcities.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.smartcities.domain.ProgramacaoFerias;

public class ProgramacaoConsultarTest {

public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("smartcities").createEntityManager();
			ProgramacaoFerias prog = em.find(ProgramacaoFerias.class, idProcurado);
		
			System.out.println("Ferias encontrada: " + prog);
		
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
