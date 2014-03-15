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
	 * 指定したログインIDに該当するユーザの一覧を取得します。
	 * 該当するユーザが存在しない場合は FIXME
	 * 
	 * @param loginId ログインID
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
