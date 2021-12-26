package ex02;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");

		System.out.print("Digite a data: { aaaa-mm-ddTHH:mm:ss }: ");
		String horaString = sc.nextLine();

		// String dtFormatada = formatador.format(horaString);

		LocalDateTime hora = LocalDateTime.parse(horaString);

		int horaAtual = hora.getHour();
		int minAtual = hora.getMinute();

		if (manha(horaAtual, minAtual)) {
			System.out.println("Bom dia!");
		} else if (tarde(horaAtual, minAtual)) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}

		sc.close();

	}

	private static boolean manha(int hora, int minuto) {
		if (hora >= 6 && hora < 12) {
			return true;
		}
		return false;
	}

	private static boolean tarde(int hora, int minuto) {
		if (hora >= 12 && hora < 19) {
			return true;
		}
		return false;
	}

}
