package ex04;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 -> QUADRADO");
		System.out.println("1 -> RET�NGULO");
		System.out.println("2 -> TRAP�ZIO");
		System.out.print("Escolha o quadril�tero not�vel: ");
		Integer opcao = sc.nextInt();
		
		switch (opcao) {
		case 0:
			System.out.print("Digite o valor dos lados do quadrado: ");
			Integer lado = sc.nextInt();
			System.out.println(calcularArea(lado));
			break;
		case 1:
			System.out.print("Digite o valor da BASE do ret�ngulo: ");
			Integer base = sc.nextInt();
			System.out.print("Digite o valor da ALTURA do ret�ngulo: ");
			Integer alturaR = sc.nextInt();
			System.out.println(calcularArea(base, alturaR));
			break;
		case 2:
			System.out.print("Digite o valor da BASE MAIOR do trap�zio: ");
			Integer baseMaior = sc.nextInt();
			System.out.print("Digite o valor da BASE MENOR do trap�zio: ");
			Integer baseMenor = sc.nextInt();
			System.out.print("Digite o valor da ALTURA do ret�ngulo: ");
			Integer alturaT = sc.nextInt();
			System.out.println(calcularArea(baseMaior, baseMenor, alturaT));
			break;

		default:
			break;
		}
		
		
		sc.close();
		
		
	}
	
	private static int calcularArea(int lado) {
		return (int) Math.pow(lado, 2);
	}
	
	private static int calcularArea(int base, int altura) {
		return base * altura;
	}
	
	private static int calcularArea(int baseMaior, int baseMenor, int altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
}
