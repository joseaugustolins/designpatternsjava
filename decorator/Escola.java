package decorator;

import java.util.ArrayList;
import java.util.List;

public class Escola implements IEscola{	

	private List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	private String nome;	

	
	public List<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}

	
	public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}
	
	public void adicionarAluno(Aluno a){
		this.listaDeAlunos.add(a);
	}
	
	public void removerAluno(Aluno a){
		this.listaDeAlunos.remove(a);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void listarNomeAluno(){
		for(Aluno a : getListaDeAlunos()){
			System.out.println(a.getNome());
		}
	}
	
	public List<Aluno> listarAlunos(){
		return getListaDeAlunos();
	}
	
	public List<Aluno> listarAlunos(String l){
		return getListaDeAlunos();
	}
}