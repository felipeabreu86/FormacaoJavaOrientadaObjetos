package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscreverArquivoFileWriter {

	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arquivo
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");

		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator()); // Separador de linha baseado no SO usado.
		fw.write("Lorem ipsum dolor sit amet");

		fw.close();

		System.out.println("Arquivo lorem2.txt criado.");
	}
}
