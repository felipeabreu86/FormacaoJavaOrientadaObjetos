package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "C";
		
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length + ", windows-1252");
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
				
		// Passando o Charset no construtor
		String sNovo = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(sNovo);
		System.out.println(bytes.length + ", UTF-8");
	}

}
