package com.journaldev.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.model.Test;

@Repository(value = "testDAO")
public class JPATestDAO implements TestDAO{
	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

	//public long createTest(Test test);
	@Override
	@Transactional(readOnly = false)
	public long createTest(Test test) {
		em.persist(test);
		em.flush();
		return test.getTestId();
	}

	@Override
	@Transactional(readOnly = true)
	public Test getTestById(long id) {
		
		return em.find(Test.class, id);
	}

	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Test> getTestsByCategory(int categoryId) {
		return em.createQuery(
				"SELECT p FROM Test p where p.categoryId = :categoryId ")
				.setParameter("categoryId", categoryId)
				.getResultList();
	}
	
	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Test> getAllTests(){
		String s = "SELECT t FROM Test t ";
		return em.createQuery(s).getResultList();
		
	}
	

}
