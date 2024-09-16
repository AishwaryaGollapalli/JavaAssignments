package com.learning.day18;

import java.io.*;

public class ReadFromFile {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fis = new FileReader("./xyz.txt"); //character based
		
		int character;
		
		while((character = fis.read())!=-1){
			System.out.print((char)character);
		}
		
		fis.close();
	}

}
