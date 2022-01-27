package com.ty.doa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Invoice;
import com.ty.dto.Item;

public class ItemInvoiceDoa {

	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	private EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("item");
		return entityManagerFactory.createEntityManager();
	}

	public void save(Invoice invoice, Item item) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(invoice);
		entityManager.persist(item);
		entityTransaction.commit();
	
	}

	public Invoice getdetail(int id) {
		entityManager = getEntityManager();
		return entityManager.find(Invoice.class, id);
	}

	public void update(Invoice invoice) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(invoice);
	}

	public void delete(int id) {
		entityManager = getEntityManager();
		entityTransaction = entityManager.getTransaction();
		Invoice invoice = entityManager.find(Invoice.class, id);
		entityTransaction.begin();
		if (invoice != null) {
			Item item = invoice.getItem();
			entityManager.remove(invoice);
			if (item != null) {
				entityManager.remove(item);
			}
			System.out.println("Deleted");
		}
		entityTransaction.commit();
	}

}
