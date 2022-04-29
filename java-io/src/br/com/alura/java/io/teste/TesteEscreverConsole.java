package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscreverConsole {

	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Input via Teclado
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de Saída via Console
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // descarregar o Buffer imediatamente.
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}
}
