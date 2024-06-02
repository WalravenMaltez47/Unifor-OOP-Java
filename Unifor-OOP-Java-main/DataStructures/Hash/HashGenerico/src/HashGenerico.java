public class HashGenerico {

	public static void main(String args[]) {

		class Aluno {

			public int matricula;
			public String nome;

			public Aluno(int matricula, String nome) {
				this.matricula = matricula;
				this.nome = nome;
			}

			@Override
			public String toString() {
				return "(Aluno >> " + matricula + ", " + nome + ")";
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + matricula;
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Aluno other = (Aluno) obj;
				if (matricula != other.matricula)
					return false;
				return true;
			}

			
		}
		
		TabelaHashGenerico<Aluno> hash = new TabelaHashGenerico<Aluno>(5);
		
		hash.insere(new Aluno(11, "Maria"));
		hash.insere(new Aluno(38, "Jose"));
		hash.insere(new Aluno(7, "Joao"));
		
		hash.imprime();
	}

}

class TabelaHashGenerico<T> {

	public T vetor[];
	public int nElementos;

	public TabelaHashGenerico(int capacidade) {
		this.vetor = (T[]) new Object[capacidade];
		this.nElementos = 0;
	}

	public int tamanho() {
		return this.nElementos;
	}

	public void imprime() {
		System.out.println("Chave\tValor");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + " -->\t[ " + vetor[i] + " ]");
		}
	}

	private int funcaoHashDiv(T elemento) {
		int hashCode = elemento.hashCode();
		int chave = hashCode % this.vetor.length;
		return chave;
	}

	public void insere(T elemento) {
		int chave = funcaoHashDiv(elemento);
		this.vetor[chave] = elemento;
		this.nElementos++;
	}

	public T remove(T elemento) {
		int chave = funcaoHashDiv(elemento);

		T removido = this.vetor[chave];

		this.vetor[chave] = null;
		this.nElementos--;

		return removido;
	}

	public T busca(T elemento) {

		int chave = funcaoHashDiv(elemento);

		return this.vetor[chave];

	}

	public boolean contem(T elemento) {
		int chave = funcaoHashDiv(elemento);
		return this.vetor[chave] != null;
	}

}