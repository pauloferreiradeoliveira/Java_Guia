package com.paulo.classe.utilitarias;

import java.util.Locale;

public class Localicacao {

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc: locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Codigo da Língua: " + loc.getDisplayLanguage());
		}
		
		Locale br = new Locale("pt","BR");
		Locale.setDefault(br);
	}

}
