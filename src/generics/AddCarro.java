package generics;

import java.util.ArrayList;
import java.util.List;

public class AddCarro {
	public static <T extends Honda> void cadastro(List<T> lista, T carro ) {
		lista.add(carro);
		System.out.println("Carro adicionado :" + carro);
		
		
	}
	public static void main(String[] args) {
	List<Honda> listaVeiculos=new ArrayList<>();
	Honda veiculo1=new Honda("City","Honda",2023);
	Honda veiculo2=new Honda("Civic","Honda",2023);
	
	cadastro(listaVeiculos,veiculo1);
	cadastro(listaVeiculos,veiculo2);

	System.out.println("Lista de veículos:" + listaVeiculos);

	
	}

}
