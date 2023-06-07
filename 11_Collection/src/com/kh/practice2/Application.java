package com.kh.practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

public class Application {

	public static void main(String[] args) {

        Application a = new Application();
//        a.method1();
        a.method2();
	}

	// TreeSet
	public void method1() {
		
        TreeSet<Integer> lotto = new TreeSet<>();
	    
	    for(int i=0; lotto.size()<6; i++) {
			int m = (int) (Math.random()*45+1);
			lotto.add(m);
		}
	    
		boolean check = true;
		int count = 0;
		
		while(check) {
			TreeSet<Integer> set = new TreeSet<Integer>();
			count++;
		    System.out.println("로또 번호 : "+lotto);
			
			for(int i=0; set.size()<6; i++) {
				int m = (int) (Math.random()*45+1);
				set.add(m);
			}
			
			System.out.println("내 번호 : "+set);
			
			if(lotto.equals(set)) {
				check = false; 
				System.out.println("횟수 : "+ count);
			}
			
		}
	    
	}
	
	// HashSet
    public void method2() {
    	
    	 HashSet<Integer> lotto = new HashSet<>();
 	    
 	    for(int i=0; lotto.size()<6; i++) {
 			int m = (int) (Math.random()*45+1);
 			lotto.add(m);
 		}
 	    
 	    List lottoList = new ArrayList(lotto);
 	    Collections.sort(lottoList);
 	    
 		boolean check = true;
 		int count = 0;
 		
 		while(check) {
 			HashSet<Integer> set = new HashSet<Integer>();
 			count++;
 		    System.out.println("로또 번호 : "+lottoList);
 			
 			for(int i=0; set.size()<6; i++) {
 				int m = (int) (Math.random()*45+1);
 				set.add(m);
 			}
 			
 			List setList = new ArrayList(set);
 	 	    Collections.sort(setList);
 			
 			System.out.println("내 번호 : "+setList);
 			
 			if(lottoList.equals(setList)) {
 				check = false; 
 				System.out.println("횟수 : "+ count);
 			}
 			
 		}
    	
    }
    	
}
