import java.util.List;

public class TesteTamanho {
	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		System.out.println("<----- CONJUNTO 1 ----->");

		if (conjunto.tamanho() >= 5) {
			System.out.println("Sucesso: o tamanho do conjunto é maior ou igual 5");
		} else {
			System.out.println("Erro: o tamanho do conjunto deveria ser ao menos 5");
		}

		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

		ConjuntoEspalhamento conjunto3 = new ConjuntoEspalhamento();
		conjunto3.adiciona("Rafael");
		conjunto3.adiciona("Ana");
		conjunto3.adiciona("Marcelo");
		conjunto3.adiciona("Josias");
		conjunto3.adiciona("Matheus");
		conjunto3.adiciona("Thais");
		conjunto3.adiciona("Joao");
		conjunto3.adiciona("Maria");
		
		System.out.println("<----- CONJUNTO 3 ----->");

		if (conjunto3.tamanho() >= 5) {
			System.out.println("Sucesso: o tamanho do conjunto é maior ou igual 5");
		} else {
			System.out.println("Erro: o tamanho do conjunto deveria ser ao menos 5");
		}

		List<String> palavras3 = conjunto3.pegaTodas();
		for (String palavra : palavras3) {
			System.out.println(palavra);
		}

	}
}