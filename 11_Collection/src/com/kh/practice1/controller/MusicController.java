package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.list.model.Person;
import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	
	public boolean addList(Music music) {
		return list.add(music);
	}
	
	
	public boolean addAtZero(Music music) {
		try {
			list.add(0, music);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public ArrayList<Music> printAll(){
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().contains(title)) {
				return m;
			}
		} return null;
	}
	
	public Music removeMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.remove(m); // -> 결과값이 boolean 타입
				return m;
			}
		} return null;
		
		/*
		 * for(int i=0; i<list.size(); i++) {
		 *    if(list.get(i).getTitle().equals(title)) {
		 *        return list.remove(i);  --> list.remove() 결과값이 boolean이 아니고 Object라서 바로 return
		 *    }
		 * }   
		 */
		
	}
	
	public Music setMusic(String title, Music music) {
		
	    for(Music m : list) {
	    	if(m.getTitle().equals(title)) {
	    		return list.set(list.indexOf(m), music);
	    	}
	    }
		return music;
		
	}
	
	public ArrayList<Music> ascTitle(){
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		// 오름차순
		Collections.sort(list, new TitleAscending());
		return list;
	}
	
	public ArrayList<Music> descArtist(){
		ArrayList<Music> list = (ArrayList<Music>)this.list.clone();
		// 내림차순
		Collections.sort(list, new ArtistAscending().reversed());
		return list;
	}
	
}
