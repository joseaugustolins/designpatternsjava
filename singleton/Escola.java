package singleton;

import java.util.ArrayList;
import java.util.List;

public class Escola {
	
	private static Escola instancia;
	private List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	private String nome;
	
	
	public List<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}
	
	public static synchronized Escola getInstancia(){
		if(instancia==null){
			instancia = new Escola();
		}
		
		return instancia;
	}
	
	public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}

	private Escola(){
		
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
}