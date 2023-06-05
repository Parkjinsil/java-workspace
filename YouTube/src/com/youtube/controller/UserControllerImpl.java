package com.youtube.controller;

import com.youtube.model.User;

public interface UserControllerImpl {

	public boolean login();         // 로그인 
	public void signUp();        // 회원가입
	public User viewProfile();      // 프로필 보기
	public User updateProfile();    // 프로필 수정
	public void deleteProfile(); // 계정 삭제
	
}
