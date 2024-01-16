package com.ty.file.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestSaveFile { 
	public static void main(String[] args) {
		FileDao fileDao=new FileDao();
		File file=new File("C:\\Users\\Windows 8.1\\Desktop\\Chimgond photo.png");
		try {
			FileInputStream fileInputStream=new FileInputStream(file);
			fileDao.saveFile(1,"ramana","Chimgond photo.png",fileInputStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
