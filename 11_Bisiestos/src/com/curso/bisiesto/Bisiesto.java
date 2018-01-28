/**
 * 
 */
package com.curso.bisiesto;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Curso mañana
 *
 */
public class Bisiesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Qué año quieres saber que es bisiesto?");
		Scanner src=new Scanner(System.in);
		int anyo = src.nextInt();
//		int anyo=2015;
		GregorianCalendar greg=new GregorianCalendar();
			
		if (greg.isLeapYear(anyo)) {
			System.out.println("Es bisiesto");
		} else {System.out.println("no es bisiesto");}
	
		

	}

}
