package projetos.alunos;

public class alunos {
	
	private String nome;
	private int matricula;
	private String situacao;
	
	// public Filme(String nome, int anoDeLancamento) {
		// super(nome, anoDeLancamento);
	
	public alunos(String nome, int matricula, String situacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.situacao = situacao;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String toString() {
		return "Nome do Aluno: " + this.getNome() + ", Matricula: " + this.getMatricula() + ", Situação: " + this.getSituacao(); 
	}
	

}
