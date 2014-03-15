package org.nt67.minutes.repository;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;

import org.junit.Test;
import org.nt67.minutes.entity.Member;

public class MemberRepositoryTest {

	@Test
	public void test_findByLoginId_該当するユーザが存在しない場合空のリストを返却する() {
		MemberRepository rep = new MemberRepository();
		List<Member> memberList = rep.findByLoginId("loginId");
		assertThat(memberList.size(), is(0));
	}

}
