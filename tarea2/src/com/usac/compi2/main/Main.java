package com.usac.compi2.main;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

import com.usac.compi2.analizadores.Lexico;
import com.usac.compi2.analizadores.parser;
import com.usac.compi2.interfaces.Visitor;
import com.usac.compi2.interfaces.impl.VisitorImpl;
import com.usac.compi2.operaciones.Nodo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese una cadena");
		
		String line = sc.nextLine();
		
		System.out.println(line);
		
		
		Lexico lexico = new Lexico(new BufferedReader(new StringReader(line)));
		parser p = new parser(lexico);
		
		try {
			p.parse();
			
			Visitor visitor = new VisitorImpl();
			Nodo raiz = p.getNodo();
			System.out.println(raiz.accept(visitor));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
