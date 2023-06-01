package com.youtube.controller;

import com.youtube.model.User;

public interface UserControllerImpl {

	public boolean login();
	public boolean signUp();
	public User ViewProfile();
	public User updateProfile();
	public boolean deleteVideo();
	
	
}