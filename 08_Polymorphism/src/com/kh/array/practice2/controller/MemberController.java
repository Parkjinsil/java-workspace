package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {

	Member[] mArr = new Member[3];
	
	public int count;
	
	/*
	public void insertMember(Member m) {
		// 객체 배열에 객체 하나씩 추가한다고 생각!
		// count를 인덱스라고 생각!
		// score[0] = 100;
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
	}*/
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		
		mArr[count++] = new Member(id, name, password, email, gender, age);
		
	}
	
	public boolean updateMember(String id, String name, String password, String email) {
		
		int index = this.checkId(id);
		if (index!=-1) {
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;
		}
		return false;
	}
	
	public int checkId(String id) {
		// 객체 배열 값들 for문 돌려서 일치한지 확인
		for(int i=0; i<mArr.length; i++) {
			if (mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i;
			}
		} return -1;
	}
	
	public Member[] printAll() {
	
		return mArr;

	}
}
