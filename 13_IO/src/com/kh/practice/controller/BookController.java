package com.kh.practice.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.object.model.Person;
import com.kh.practice.model.Book;

public class BookController {

	// src/books.obj 파일에 저장
	public void fileSave(Book book) {
		
		// , true만 추가하면 매번 추가할때마다 덧붙여짐
		try (FileOutputStream fos = new FileOutputStream("src/books.obj", true);
		     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(book); // book 담는다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	// src/books.obj 파일에서 데이터 가져오기
	public List<Book> fileRead() {
		
		List<Book> books = new ArrayList<>();
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("src/books.obj");
			
			while(true) {
				ois = new ObjectInputStream(fis);
				books.add((Book)ois.readObject());
			}
			
		} catch(EOFException e ) {
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		return books;
	}

}
















