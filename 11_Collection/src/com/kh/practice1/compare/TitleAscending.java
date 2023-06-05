package com.kh.practice1.compare;

import java.util.Comparator;

import com.kh.practice1.model.Music;

public class TitleAscending implements Comparator<Music>  {
	
	/*
	 * 두개의 매개값으로 전달된 객체를 비교
	 * 비교해서 같으면 0을 반환
	 * 첫번째 객체가 뒤에 있어야 하면 양의 정수 1
	 * 첫번째 객체가 앞에 있어야 하면 음의 정수 -1
	 * */
	

	@Override
	public int compare(Music music1, Music music2) {
		return music1.getTitle().compareTo(music2.getTitle());
	}

		
}
