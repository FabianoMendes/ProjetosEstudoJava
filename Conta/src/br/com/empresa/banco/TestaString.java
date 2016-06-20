package br.com.empresa.banco;

public class TestaString {
	public static void main(String[] args) {
		String s = "Socorram-me, subi no ônibus em Marrocos";
		//s = s.replaceAll("1", "2");
		//System.out.println(s);
		
		/*
		for (int i = s.length() -1 ; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        */
		
		/*
		String[] palavras = s.split(" ");
        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.print(palavras[i] + " ");
        }
        System.out.println("");
        */
		
		System.out.print("\t");
        StringBuilder invertido = new StringBuilder(s).reverse();
        System.out.println(invertido);
	}
}
