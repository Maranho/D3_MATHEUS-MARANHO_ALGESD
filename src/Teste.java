import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("instrutor");
		conjunto.adiciona("mesa");
		conjunto.adiciona("telefone");
		conjunto.adiciona("mesa");
		conjunto.adiciona("teste");
		conjunto.adiciona("teste1");
		conjunto.adiciona("teste2");
		
		System.out.println("<----- CONJUNTO 1 ----->");
		
		if (!conjunto.contem("apostila")) {
			System.out.println("Erro: não tem a palavra: apostila");
		}
		
		conjunto.remove("apostila");
		if (conjunto.contem("apostila")) {
			System.out.println("Erro: tem a palavra: apostila");
		}
		
		if (conjunto.tamanho() != 5) {
			System.out.println("Erro: o tamanho do conjunto deveria ser ao menos 5");
		}
		
		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		ConjuntoEspalhamento conjunto2 = new ConjuntoEspalhamento();
		conjunto2.adiciona("palavra");
		conjunto2.adiciona("computador");
		conjunto2.adiciona("apostila");
		conjunto2.adiciona("instrutor");
		conjunto2.adiciona("mesa");
		conjunto2.adiciona("telefone");
		
		conjunto2.remove("mesa");
		
		System.out.println("<----- CONJUNTO 2 ----->");
		
		if (conjunto2.contem("apostila")) {
			System.out.println("Sucesso: tem a palavra: apostila");
		}
		
		if (conjunto2.tamanho() >= 5) {
			System.out.println("Sucesso: o tamanho do conjunto é maior ou igual 5");
		}
		
		List<String> palavras2 = conjunto2.pegaTodas();
		for (String palavra : palavras2) {
			System.out.println(palavra);
		}
		
		
	}
}