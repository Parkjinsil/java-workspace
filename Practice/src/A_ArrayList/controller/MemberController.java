package A_ArrayList.controller;

import A_ArrayList.model.Member;

public class MemberController {

	private Member[] m = new Member[3];
	public int count;
	
	public void insertMember(Member m) {
		this.m[count++] = m; 
	}
	
	public boolean updateMember(String id, String name, String password, String email) {
		
		for(int i=0; i<3; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				return true;
			}
		}
		
		return false;
	}
	
	public int checkId(String id) {
		
		for(int i=0; i<3; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public Member[] printAll() {
		return m;
	}
	
}




















