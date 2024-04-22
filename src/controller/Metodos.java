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
		lista.remove(0);		
		System.out.println(lista.toString());		
		lista.remove(1);		
		System.out.println(lista.toString());
		lista.insert(1, 9);
		System.out.println(lista.toString());

	}
}
