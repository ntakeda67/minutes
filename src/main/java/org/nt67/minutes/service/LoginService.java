package org.nt67.minutes.service;

import java.util.List;

import org.nt67.minutes.entity.Member;
import org.nt67.minutes.repository.MemberRepository;

public class LoginService {
	/**
	 * 
	 * @param loginId 
	 * @param password
	 * @return true: ���O�C������, false: ���O�C�����s
	 * @throws Exception 
	 */
	public boolean doLogin(String loginId, String password) throws Exception{
		verifyLoginInformation(loginId, password);
		return true;
	}
	
	/**
	 * ���͂��ꂽ���O�C��ID�ƃp�X���[�h���ƍ����A���O�C���\�ł��邱�Ƃ����؂���B
	 * ���؂̌��ʁA���O�C���s�\�ł���Η�O���X���[����B
	 * @param loginId�@���O�C��ID
	 * @param password �p�X���[�h
	 * @throws Exception //FIXME ��O�̃J�X�^���B����ȑO�ɗ�O�ŏ�������ׂ��Ȃ̂��B
	 */
	private void verifyLoginInformation(String loginId, String password) throws Exception{
		MemberRepository rep = new MemberRepository();
		List<Member> memberList = rep.findByLoginId(loginId);
		
		if(memberList.size() < 1){
			throw new Exception("Unknown User");
		}
		
		// DB����UK�őΏ����������
		if(memberList.size() > 1){
			throw new Exception("Member Data integrity violation");
		}
		
		Member member = memberList.get(0);
		
		// FIXME �p�X���[�h�̃G���R�[�h�ɑΉ�
		if(!member.getPassword().equals(password)){
			throw new Exception("Password violation");
		}
	}
}
