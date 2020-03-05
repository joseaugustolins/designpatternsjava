package decorator;

import java.util.List;



public interface IEscola {	
	public void adicionarAluno(Aluno a);
	public void removerAluno(Aluno a);
	public void listarNomeAluno();
	public List<Aluno> listarAlunos();
	public List<Aluno> listarAlunos(String l);
}