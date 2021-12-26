package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("PARA SOMA DIGITE: SUM");
		System.out.println("PARA SUBTRAÇÃO DIGITE: SUB");
		System.out.println("PARA MULTIPLICAR DIGITE: MULT");
		System.out.println("PARA DIVISÃO DIGITE: DIV");

		System.out.print("Escolha a Operação: ");
		String operacao = sc.nextLine().toLowerCase();

		switch (operacao) {

		case "sum": {
			System.out.print("Digite o primeiro valor: ");
			double v1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double v2 = sc.nextDouble();
			double soma = v1 + v2;
			System.out.printf("%.2f + %.2f = %.2f", v1, v2, soma);
			break;

		}
		case "sub": {
			System.out.print("Digite o primeiro valor: ");
			double v1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double v2 = sc.nextDouble();
			double subtracao = v1 - v2;
			System.out.printf("%.2f - %.2f = %.2f", v1, v2, subtracao);
			break;

		}
		case "mult": {
			System.out.print("Digite o primeiro valor: ");
			double v1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double v2 = sc.nextDouble();
			double multiplicao = v1 * v2;
			System.out.printf("%.2f * %.2f = %.2f", v1, v2, multiplicao);
			break;

		}
		case "div": {
			System.out.print("Digite o primeiro valor: ");
			double v1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double v2 = sc.nextDouble();
			double divisao = v1 / v2;
			if (v2 == 0) {
				System.out.println("Não é possível divisão por 0");
				break;
			}
			System.out.printf("%.2f / %.2f = %.2f", v1, v2, divisao);
			break;

		}
		default: {
			System.out.println("Opção Inválida!");
		}

		}

		sc.close();

	}

}
