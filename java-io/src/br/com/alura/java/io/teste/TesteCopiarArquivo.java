package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de Sa�da com Arquivo
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}

		br.close();
		bw.close();

		System.out.println("Arquivo lorem2.txt criado como c�pia de lorem.txt.");
	}
}
