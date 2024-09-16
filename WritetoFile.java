package com.learning.day18;

import java.io.*;

public class WritetoFile {

	public static void main(String[] args) throws Exception {

		FileWriter fos = new FileWriter("./xyz.txt", true);

		String msg = "Hello, how are you?";

		
		fos.write(msg);

		fos.close();

	}

}
