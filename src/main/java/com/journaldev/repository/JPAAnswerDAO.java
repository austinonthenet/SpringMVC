package com.journaldev.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.model.Answer;


@Repository(value = "AnswerDAO")
public class JPAAnswerDAO implements AnswerDAO {
	
	private EntityManager em = null;

    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }


	@Override
	@Transactional(readOnly = false)
	public long createAnswer(Answer answer) {
		em.persist(answer);
		em.flush();
		return answer.getAnswerId();
	}

	@Override
	@Transactional(readOnly = true)
	public Answer getAnswerById(long id) {
		return em.find(Answer.class, id);
	}

	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Answer> getAnswersByQuestion(int questionId) {
		return em.createQuery(
				"SELECT a FROM Answer a where a.questionId = :questionId ")
				.setParameter("answerId", questionId)
				.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Answer> getAllAnswers() {
		String s = "SELECT a FROM Answer a ";
		return em.createQuery(s).getResultList();
	}


	@Override
	public long updateAnswer(Answer answer) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void deleteAnswer(long answerId) {
		// TODO Auto-generated method stub
		
	}

}
