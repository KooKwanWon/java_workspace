package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {

	Music m = new Music();
	ArrayList<Music> list = new ArrayList();

	public boolean addList(Music music) {

		list.add(music);
		return true;
	}

	public boolean addAtZero(Music music) {

		list.add(0, music);
		return true;
	}

	public ArrayList<Music> printAll() {

		return list;
	}

	public Music searchMusic(String title) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				Music m1 = list.get(i);
				System.out.print(list.get(i).getTitle() + "-" + list.get(i).getArtist());
				System.out.println("을 검색 했습니다.");
				return m1;
			} else {
				System.out.println("검색한 곡이 없습니다.");
			}
		}
		return null;
	}

	public Music removeMusic(String title) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				Music m1 = list.get(i);
				System.out.print(list.get(i).getTitle() + "-" + list.get(i).getArtist());
				System.out.println("을 삭제 했습니다.");
				list.remove(i);
				return m1;
			} else {
				System.out.println("검색한 곡이 없습니다.");
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				return list.set(i, music);
			}
		}
		return null;
	}

	public ArrayList<Music> ascTitle() {

		
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		Collections.sort(list, new TitleAscending());					
		
		
		return list;
	}

	public ArrayList<Music> descArtist() {

		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		Collections.sort(list, new ArtistAscending());
		Collections.reverse(list);
	
		return list;
	}

}
