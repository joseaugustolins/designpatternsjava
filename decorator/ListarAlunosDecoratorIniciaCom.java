package decorator;

import java.util.ArrayList;
import java.util.List;


public class ListarAlunosDecoratorIniciaCom extends EscolaDecorator{

	public ListarAlunosDecoratorIniciaCom(IEscola escolaADecorar) {
		super(escolaADecorar);
	}	
	
	public List<Aluno> listarAlunos(){
		 
		return super.listarAlunos();
			
		
	}
	
	public List<Aluno> listarAlunos(String l){
		List<Aluno> lista = new ArrayList<Aluno>(); 
		for(Aluno a : super.listarAlunos()){
			if(a.getNome().startsWith(l, 0)){
				lista.add(a);
			}			
		}	
		return lista;
	}
	//public void  
	
}
