package com.kakaotalk;

import com.kakaotalk.model.User;

public class Application {

	public static void main(String[] args) {

		User koo = new User();
		
		if(koo.ing == true) {
			koo.viewProfile();
		}
		else {
			koo.login();
		}
		
	}

}
