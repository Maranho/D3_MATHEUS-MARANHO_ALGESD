import java.util.List;

public class TesteContem {
	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		if (conjunto.contem("Rafael")) {
			System.out.println("Sucesso: tem o nome: Rafael");
		}
		
		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}
}