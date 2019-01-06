package com.venta.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.venta.dto.*;

public class AddTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void iniciar() {
		emf=Persistence.createEntityManagerFactory("venta");
		em=emf.createEntityManager();		
	}
	
	@Test
	public void addcategoria() {
		em.getTransaction().begin();
		Categoria ncat=new Categoria(1,"Bebidas espirituosas");
		Categoria ncat1=new Categoria(2,"Bebidas normales");
		
		em.persist(ncat);
		em.persist(ncat1);
			
		em.getTransaction().commit();
		
		Categoria c1=em.find(Categoria.class, 1);
		Categoria c2=em.find(Categoria.class, 2);
		
		em.getTransaction().begin();
		Producto p1=new Producto("Cerveza",200,c1);
		Producto p2=new Producto("Pisco",500,c1);
		
		Producto p3=new Producto("Agua",300,c2);
		Producto p4=new Producto("Jugo",400,c2);
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();
		
		
	}
}
