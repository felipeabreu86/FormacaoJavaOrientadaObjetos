package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TesteSerializacao implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String nome = "Felipe";
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		os.writeObject(nome);
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeRecuperado = (String) is.readObject();
		is.close();

		System.out.println(nomeRecuperado);
	}
}
