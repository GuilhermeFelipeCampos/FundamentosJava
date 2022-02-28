package br.com.xmlgenerator.ui;

import java.lang.reflect.Field;

import br.com.xmlgenerator.model.Produto;

public class Main {

	public static void main(String[] args) {
		
		Object obj;
		Produto produtos  = new Produto();
		
		produtos.setId(1234);
		produtos.setDescricao("Mouse");
		produtos.setPreco(20.00);
		produtos.setLinkFoto("mouse.jpeg");
		
		obj = produtos;
		
		try {
			
			Field[] fields = obj.getClass().getDeclaredFields();
			
			
			System.out.println("<xml>");
			for(Field field : fields) {
				
				field.setAccessible(true);
				System.out.println("    <"+field.getName()+">"+field.get(obj)+"</"+">");
			}
			System.out.println("</xml>");
		}catch(Exception e){
			
			System.out.println("Algo Errado");
			e.printStackTrace();
			
		}
		
		
	}
}
