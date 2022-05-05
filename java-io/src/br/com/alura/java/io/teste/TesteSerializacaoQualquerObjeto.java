package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TesteSerializacaoQualquerObjeto {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Felipe");
		cliente.setIndicacao(new Cliente("Manu"));

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("objeto-cliente.bin"));
		os.writeObject(cliente);
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream("objeto-cliente.bin"));
		Cliente clienteRecuperado = (Cliente) is.readObject();
		is.close();

		// Exibe o nome do cliente
		System.out.println(clienteRecuperado.getNome());

		// Não irá exibir a indicação pois foi marcada como "transient".
		System.out.println(clienteRecuperado.getIndicacao());
	}
}
