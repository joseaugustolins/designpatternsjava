package decorator;

import java.util.ArrayList;
import java.util.List;


public class ListarAlunosDecoratorSegundaLetra extends EscolaDecorator{

	public ListarAlunosDecoratorSegundaLetra(IEscola escolaADecorar) {
		super(escolaADecorar);
	}	
	
	public List<Aluno> listarAlunos(){
		 
		return super.listarAlunos();
			
		
	}
	
	public List<Aluno> listarAlunos(String l){
		List<Aluno> lista = new ArrayList<Aluno>(); 
		for(Aluno a : super.listarAlunos()){
			if(a.getNome().startsWith(l, 1)){
				lista.add(a);
			}			
		}	
		return lista;
	}
	//public void  
	
}
