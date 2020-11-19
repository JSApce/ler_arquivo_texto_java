package com.jsapce.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("/home/nuti/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
			
		}
		
	}

}
