package com.learning.day20;
//to print characters individually from a string using multithreading conceptclass PrintCharacters extends Thread {

	
	@Override
	public void run() {				String string1 =  MultiThreadingEg3.getString1();		int index = MultiThreadingEg3.getIndex();
		try {
			for (; index < string1.length(); index++) {
				System.out.print(string1.charAt(index)+" ");				 //System.out.println("index value "+index);

				Thread.sleep(30);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class MultiThreadingEg3 {

	private static String string1 = "This is to print individual characters";
	private static int  index = 0;	
	public static String getString1() {		return string1;	}	public static int getIndex() {		return index;	}	public static void setIndex(int index) {		MultiThreadingEg3.index = index;	}		public static int incrIndex(int index) {		return index++;	}	public static void main(String[] args) {

		try {
			PrintCharacters thread = new PrintCharacters();
			thread.start();
			for (; index < string1.length(); index++) {
				System.out.print(string1.charAt(index)+" ");				//System.out.println("index value "+index);
				Thread.sleep(25);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
