package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLerArquivoCSV {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String nomeTitular = linhaScanner.next();
			double saldoConta = linhaScanner.nextDouble();

			linhaScanner.close();
		}

		scanner.close();
	}
}
