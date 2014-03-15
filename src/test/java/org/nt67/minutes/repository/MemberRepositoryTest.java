package org.nt67.minutes.repository;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;

import org.junit.Test;
import org.nt67.minutes.entity.Member;

public class MemberRepositoryTest {

	@Test
	public void test_findByLoginId_�Y�����郆�[�U�����݂��Ȃ��ꍇ��̃��X�g��ԋp����() {
		MemberRepository rep = new MemberRepository();
		List<Member> memberList = rep.findByLoginId("loginId");
		assertThat(memberList.size(), is(0));
	}

}
