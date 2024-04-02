package chapter1;

public class DocumentacaoJava{

	public static void main(String... args){
		doisValores(1.0, 2.0);
	}
	
	/**
	@param valor1
	@param valor2
	@author caiocv18
	**/
	public static void doisValores(double valor1, double valor2){
		System.out.println("Valor 1 = " + valor1);
		System.out.println("Valor 2 = " + valor2);
	}
}