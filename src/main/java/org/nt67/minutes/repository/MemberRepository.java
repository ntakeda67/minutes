package org.nt67.minutes.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.nt67.minutes.entity.Member;

public class MemberRepository {

	/**
	 * �w�肵�����O�C��ID�ɊY�����郆�[�U�̈ꗗ���擾���܂��B
	 * �Y�����郆�[�U�����݂��Ȃ��ꍇ�� FIXME
	 * 
	 * @param loginId ���O�C��ID
	 * @return
	 */
	public List<Member> findByLoginId(String loginId){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("minutes");
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Member> cq = cb.createQuery(Member.class);
		Root<Member> r = cq.from(Member.class);
		cq.select(r).where(cb.equal(r.get("loginId"), loginId));
		List<Member> foundMemberList = em.createQuery(cq).getResultList();
		return foundMemberList;
	}
}
