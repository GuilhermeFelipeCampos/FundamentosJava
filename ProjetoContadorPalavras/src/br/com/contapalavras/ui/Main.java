package br.com.contapalavras.ui;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		String original   ="Mussum Ipsum, cacilds vidis litro abertis. Delegadis gente finis, bibendum egestas augue arcu ut est.Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus.Mais vale um bebadis conhecidiss, que um alcoolatra anonimis.Posuere libero varius. Nullam a nisl ut ante blandit hendrerit. Aenean sit amet nisi."

+"Copo furadis é disculpa de bebadis, arcu quam euismod magna.Sapien in monti palavris qui num significa nadis i pareci latim.Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus.Detraxit consequat et quo num tendi nada.";
		
		
		
		HashMap<String, Integer> palavras = new HashMap<String, Integer>();
		
		original.replaceAll(",", "")
				.replaceAll("\\.", "")
				.replaceAll("\\?", "")
				.replaceAll("!", "");
		
		
		String [] palavra = original.split(" ");
		
				
							
		
		
		for(String p : palavra) {
			
			if(palavras.get(p) != null) {
				
				palavras.replace(p, palavras.get(p)+1);
			}else {
				palavras.put(p, 1);
			}
		}
		
		
		System.out.println(palavras);
		
	}
}
