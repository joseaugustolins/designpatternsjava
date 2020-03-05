package decorator;

import java.util.List;

public class EscolaDecorator implements IEscola{
	private IEscola escolaADecorar;
	
	public EscolaDecorator(IEscola escolaADecorar){
		this.escolaADecorar = escolaADecorar;
	}

	@Override
	public void adicionarAluno(Aluno a) {
		escolaADecorar.adicionarAluno(a);
		
	}

	@Override
	public void removerAluno(Aluno a) {
		escolaADecorar.adicionarAluno(a);		
	}

	@Override
	public void listarNomeAluno() {
		escolaADecorar.listarNomeAluno();		
	}
	
	public List<Aluno> listarAlunos(){
		return escolaADecorar.listarAlunos();
	}
	
	public List<Aluno> listarAlunos(String l){
		return escolaADecorar.listarAlunos();
	}
}