package br.com.db1start.aula2;

public class ExerciciosString {
	//Exercicio2 String
	public  String maiscula (String text1){
		String maiscula = text1.toUpperCase();
		return maiscula;
	}
	//Exercicio2 String
	public  String minuscula (String text1){
		String minuscula = text1.toLowerCase();
		return minuscula;
	
	}
	//Exercicio3 String
	public  Integer quantidade (String text1){
		Integer quantidade = (text1.length());
		return quantidade;
	}
	//Exercicio4 String
	public  Integer quantidades (String text1){
		Integer quantidade = (text1.length());
		return quantidade;
	}
	//Exercicio6 String
	public  String primeira (String text1){
		String primeira = text1.substring(0, 4);
		return primeira;
	}
	//Exercicio7 String
	public  String primeiras (String text1){
		String primeira = text1.substring(3);
		return primeira;
	}
	//Exercicio8 String 
	public  String ultimasdonome (String text1){
		String primeira = text1.substring(18 );
		return primeira;
	}
	//Exercicio9 String
	public String substituir (String nome) {
		nome = nome.replaceAll("Matheus", "Aluno");
		return nome;
	}
	//Exercicio10 String
	public String separa (String nome) {
		String Textoseparar;
		Textoseparar = nome;
		return Textoseparar;
		
		//não terminer
	}
	//Exercicio11 String 
	public Integer vogais(String Text1){
		Integer vogais = Text1.replaceAll("[^aeiouAEIOU]","").length();
			return vogais;
		}
	//Exercicio12 String
	public  String invertida (String text1){
		String invertida = new StringBuilder(text1).reverse().toString();
		return invertida;
	}
	
}
