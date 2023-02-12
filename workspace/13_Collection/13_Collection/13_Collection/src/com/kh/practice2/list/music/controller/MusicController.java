package com.kh.practice2.list.music.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kh.practice2.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	public int addList(Music music) {
		int result = 0;
		try {
			list.add(music);
			return 1;			
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int addAtZero(Music music) {
		int result = 0;
		try {
			list.add(0 ,music);
			return 1;			
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		Music m = null;
		for(int i = 0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				m = list.get(i);
				break;
			}
		}
		return m;
	}
//		for(Music mc : list) {
//			if(mc.getTitle().equals(title)) {
//				return mc;
//			}			
//		}
//		return null;
//	}
	
	public Music removeMusic(String title) {
		Music m = null;
		for(int i = 0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				m = list.get(i);
				list.remove(i);
				break;
			}
		}
		return m;


		
//		int index = 0;
//		Music music = null;
//		for(Music mc : list) {
//			if(mc.getTitle().equals(title)) {
//				music = list.remove(index);
//				return music;
//			}		
//			index++;
//		}
//		
//		return null;
	}
}
