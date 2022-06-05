package br.com.dio.model.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b;

		System.out.println("Digite o primeiro valor:");
		a = Double.parseDouble(scan.nextLine());

		System.out.println("Digite o segundo valor:");
		b = Double.parseDouble(scan.nextLine());

		double soma = soma(a, b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);

		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		System.out.println("Multiplicacao: " + multiplicacao);
		System.out.println("Divisao: " + divisao);

	}

	public static double soma(double a, double b) {

		return a + b;
	}

	public static double subtracao(double a, double b) {

		return a - b;
	}

	public static double multiplicacao(double a, double b) {

		return a * b;
	}

	public static double divisao(double a, double b) {

		return a / b;
	}
}
