package com.paulo.classe.utilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		Date hoje = new Date();

		System.out.println(hoje);
		System.out.println(hoje.getTime());
		System.out.println(hoje.getDate());
		
		Calendar agora = Calendar.getInstance();
		
		int ano = agora.get(Calendar.YEAR);
		int mes = agora.get(Calendar.MONTH);
		int dia = agora.get(Calendar.DAY_OF_MONTH);
		int hora = agora.get(Calendar.HOUR);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d",dia,(mes+1), ano,hora,agora.get(Calendar.MINUTE),agora.get(Calendar.SECOND));
		agora.add(Calendar.DAY_OF_MONTH,8);
		
		GregorianCalendar hoje1 = new GregorianCalendar();
		imprimirData(hoje1);
		hoje1.isLeapYear(2017);// Verifica se o Ano e Bisesto
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss a Z");
		System.out.println(sdf.format(agora.getTime()));
		

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date minha  = sdf1.parse("04/03/1993");
			System.out.println(minha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void imprimirData(Calendar agora) {
		int ano = agora.get(Calendar.YEAR);
		int mes = agora.get(Calendar.MONTH);
		int dia = agora.get(Calendar.DAY_OF_MONTH);
		int hora = agora.get(Calendar.HOUR);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d%n",dia,(mes+1), ano,hora,agora.get(Calendar.MINUTE),agora.get(Calendar.SECOND));
		
	}

}
