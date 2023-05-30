package com.kh.array.practice2.controller;

import com.kh.array.practice2.Application;
import com.kh.array.practice2.model.*;

public class MemberController {

	Application a = new Application();
			
	private Member[] mArr = new Member[3];
	
	public int count = 0;

	public void insertMember(Member m) {

//		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
		mArr[count++] = m;
		
	}

	public boolean updateMember(String id, String name, String password, String email) {
		
		int index = this.checkid(id);
		if(index!=-1) {
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			
			return true;
		}
		
		return false;
	}

	public int checkid(String id) {
		
		int x = -1;
		
		for (int i = 0; i < mArr.length; i++) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i;
			}
		}
		
		return x;
	}
	
	public Member[] printAll() {
	
		return mArr;
	}
	
}
