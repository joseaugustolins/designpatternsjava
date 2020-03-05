package iterator;

public class Aluno {
	
	private Integer matricula;
	private String nome;
	private Integer telefone;
	
	
	public Aluno(){
		
	}
	
	public Aluno(Integer matricula, String nome, Integer telefone){
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void adicionar(Integer matricula, String nome, Integer telefone){
		
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}	
}