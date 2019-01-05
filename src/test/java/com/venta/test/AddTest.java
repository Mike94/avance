package com.venta.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.venta.dto.Categoria;

public class AddTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void iniciar() {
		emf = Persistence.createEntityManagerFactory("venta2");
		em = emf.createEntityManager();
	}
	
	@Test
	public void addCategoria() {
		em.getTransaction().begin();
		Categoria ncat = new Categoria(1,"Bebidas espirituosas");
		Categoria ncat1 = new Categoria(2,"Bebidas normales");
		
		em.persist(ncat);
		em.persist(ncat1);
		
		em.getTransaction().commit();
	}
	
}
