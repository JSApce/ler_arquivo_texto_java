package com.jsapce.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jsapce.application.entities.Bnmp;

public class Program {

	public static void main(String[] args) {

		String path = ".csv";

		List<Bnmp> list = new ArrayList<Bnmp>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				String numeroProcesso = vect[0];
				String nome = vect[1];
				String orgaoExpedidor = vect[8];
				
				Bnmp bnmp = new Bnmp(numeroProcesso, nome, orgaoExpedidor);
				list.add(bnmp);
				
				System.out.println(line);
				line = br.readLine();
			}
			
			System.out.println("BNMP:");
			
			list.forEach(item -> System.out.println(item));
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
