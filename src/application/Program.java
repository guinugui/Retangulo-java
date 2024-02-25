package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(largura, altura);
		
		System.out.println("O valor da area e de: ");
		System.out.println(retangulo.Area());
		
		System.out.println("O valor do perimetro e de: ");
		System.out.println(retangulo.Perimetro());
		
		System.out.println("O valor diagonal e de: ");
		System.out.println(retangulo.Diagonal());
		
		
		
		sc.close();
		
		
	}

}
