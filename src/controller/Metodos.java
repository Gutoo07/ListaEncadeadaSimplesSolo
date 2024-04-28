package controller;
import model.No;
import model.ListaEncadeadaSimples;

public class Metodos {
	public Metodos() {
		super();
	}
	public void teste() throws Exception {
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		
		lista.append(2);
		lista.append(4);
		lista.append(6);
		
		System.out.println(lista.toString());		

		lista.insert(0, 1);
		
		System.out.println(lista.toString());	
		
		System.out.println(lista.total());
		
		lista.remove(3);
		System.out.println(lista.toString());	


	}
}
