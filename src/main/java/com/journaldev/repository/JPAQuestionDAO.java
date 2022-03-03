package com.journaldev.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.model.Question;


@Repository(value = "QuestionDAO")
public class JPAQuestionDAO implements QuestionDAO {
	
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
	public long createQuestion(Question question) {
		em.persist(question);
		em.flush();
		return question.getQuestionId();
	}

	@Override
	@Transactional(readOnly = true)
	public Question getQuestionById(long id) {
		return em.find(Question.class, id);
	}

	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Question> getQuestionByTest(int testId) {
		return em.createQuery(
				"SELECT q FROM Question q where q.testId = :testId ")
				.setParameter("testId", testId)
				.getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Question> getAllQuestions() {
		String s = "SELECT q FROM Question q ";
		return em.createQuery(s).getResultList();
	}

	@Override
	public long updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteQuestion(long questionId) {
		// TODO Auto-generated method stub
		
	}

}
