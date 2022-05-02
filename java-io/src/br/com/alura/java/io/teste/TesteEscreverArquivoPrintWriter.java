package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscreverArquivoPrintWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		PrintWriter pw = new PrintWriter("lorem2.txt");

		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		pw.println("Lorem ipsum dolor sit amet");

		pw.close();

		System.out.println("Arquivo lorem2.txt criado.");
	}
}
