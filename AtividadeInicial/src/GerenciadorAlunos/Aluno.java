package GerenciadorAlunos;

public class Aluno {
	private int idade;
	private String matricula;
	private double media;
	private String nome;

	public Aluno(String matricula, String nome, int idade ) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
		
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		
		if (idade <16){
			System.out.println("Idade não permitida");
			return;	
			
	}this.idade = idade;
}
	public String getMatricula() {
		return matricula;
	}

	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		
		if (media <0  || media >10 ) {
			System.out.println("Média inválida");
			return;
		}this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
		 System.out.println("Digite caracteres válidos");
		 return;
		}
		this.nome = nome;
	}
	
}// fim classe


