package br.com.db1start.aula2;

public class ExerciciosInteger {
	
	//Exercicio1 Integer
	public Integer soma (Integer numero1, Integer numero2) {
		Integer soma = numero1 + numero2;
		return soma;
	}
	//Exercicio2 Integer
	public Integer subtracao (Integer numero1, Integer numero2) {
		Integer sub = numero1 - numero2;
		return sub;
	}
	
	//Exercicio3 Integer
	public Integer multiplicacao (Integer numero1, Integer numero2) {
		Integer multi = numero1 * numero2;
		return multi;
	}
	//Exercicio4 Integer
	public Integer divisao (Integer numero1, Integer numero2) {
		Integer divi = numero1 / numero2;
		return divi;
	}
	//Exercicio5 Integer
	public String parouimpar (Integer numero1) {
		String comparar;
		if (numero1 % 2 == 0) {
			comparar = "Par";
			return comparar;
		}else {
			comparar = "Impar";
			return comparar;

		}
	
	}
	//Exercicio6 Integer
	public Integer maior (Integer numero1, Integer numero2) {
		if (numero1 > numero2) {
			return numero1;
		}
		return numero2;
	}
	
	//Exercicio7 Integer
	
}
