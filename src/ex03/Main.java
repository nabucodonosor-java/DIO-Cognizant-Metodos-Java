package ex03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do empréstimo: ");
		Double valorEmprestimo = sc.nextDouble();
		if (valorEmprestimo == 0) {
			System.out.println("Valor deve ser maior que 0");
			System.out.print("Digite o valor do empréstimo: ");
			valorEmprestimo = sc.nextDouble();
		}
		System.out.print("Digite a qtde de parcelas: ");
		int qtdeParcelas = sc.nextInt();
		
		double taxaSobreValor = calculaTaxaPorValor(valorEmprestimo);
		
		double taxaSobreQtdeParcelas = calculaTaxaPorQtdeParcelas(valorEmprestimo, qtdeParcelas);
		
		double valorParcela = (valorEmprestimo + taxaSobreValor + taxaSobreQtdeParcelas) / qtdeParcelas;
		
		System.out.printf("Valor do emprestimo: %.2f - Qtde Parcelas: %d", valorEmprestimo, qtdeParcelas);
		System.out.printf("\nValor da total a pagar: %.2f", valorParcela);
		System.out.printf("\nValor da parcela: %.2f", (valorEmprestimo + taxaSobreValor + taxaSobreQtdeParcelas));
		
		sc.close();
	}

	private static double calculaTaxaPorQtdeParcelas(double valorEmprestimo, int qtdeParcelas) {
		int inicioCurtoPrazo = 1;
		int fimCurtoPrazo = 6;
		int inicioMedioPrazo = 7;
		int fimMedioPrazo = 18;
		
		if (qtdeParcelas >= inicioCurtoPrazo && qtdeParcelas <= fimCurtoPrazo) {
			return 0.0;
		} else if (qtdeParcelas >= inicioMedioPrazo && qtdeParcelas <= fimMedioPrazo) {
			return valorEmprestimo * 0.05;
		} else {
			return valorEmprestimo * 0.1;
		}

	}

	private static double calculaTaxaPorValor(Double valorEmprestimo) {
		
		double inicioValorPeq = 0.0;
		double fimValorPeq = 999.99;
		double inicioValorMedio = 1000.0;
		double fimValorMedio = 1999.99;
		// double valorGde = 2000.0;
		
		if (valorEmprestimo > inicioValorPeq && valorEmprestimo <= fimValorPeq) {
			return valorEmprestimo * 0.1;
		} else if (valorEmprestimo >= inicioValorMedio && valorEmprestimo <= fimValorMedio) {
			return valorEmprestimo * 0.08;
		} else {
			return valorEmprestimo * 0.05;
		}
		// return 0;
	}

}
