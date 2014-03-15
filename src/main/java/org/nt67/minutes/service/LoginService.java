package org.nt67.minutes.service;

import java.util.List;

import org.nt67.minutes.entity.Member;
import org.nt67.minutes.repository.MemberRepository;

public class LoginService {
	/**
	 * 
	 * @param loginId 
	 * @param password
	 * @return true: ログイン成功, false: ログイン失敗
	 * @throws Exception 
	 */
	public boolean doLogin(String loginId, String password) throws Exception{
		verifyLoginInformation(loginId, password);
		return true;
	}
	
	/**
	 * 入力されたログインIDとパスワードを照合し、ログイン可能であることを検証する。
	 * 検証の結果、ログイン不可能であれば例外をスローする。
	 * @param loginId　ログインID
	 * @param password パスワード
	 * @throws Exception //FIXME 例外のカスタム。それ以前に例外で処理するべきなのか。
	 */
	private void verifyLoginInformation(String loginId, String password) throws Exception{
		MemberRepository rep = new MemberRepository();
		List<Member> memberList = rep.findByLoginId(loginId);
		
		if(memberList.size() < 1){
			throw new Exception("Unknown User");
		}
		
		// DB側のUKで対処する方向で
		if(memberList.size() > 1){
			throw new Exception("Member Data integrity violation");
		}
		
		Member member = memberList.get(0);
		
		// FIXME パスワードのエンコードに対応
		if(!member.getPassword().equals(password)){
			throw new Exception("Password violation");
		}
	}
}
