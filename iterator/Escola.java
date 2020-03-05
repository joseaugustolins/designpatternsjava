package iterator;

import java.util.ArrayList;
import java.util.List;


public class Escola implements Aggregate{
	
	private List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	
	public List<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}

	public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}

	@Override
	public Iterador createIterator() {
		return new EscolaIterator();
	}
	
	public void adicionarAluno(Aluno a){
		this.listaDeAlunos.add(a);
	}

	public void removerAluno(Aluno a){
		this.listaDeAlunos.remove(a);
	}

		
		private class EscolaIterator implements Iterador{	
			private int indice;
			@Override
			public Object first() {
					if(!listaDeAlunos.isEmpty()){
						indice = 0;
						return listaDeAlunos.get(0);
					}
					else{
						System.out.println("Nao Existem Alunos");
						return null;
					}
						
			}

			@Override
			public Object next() {
				indice++;
				if(isDone()){
					return listaDeAlunos.get(indice);
				}else {
					return null;
				}
			}

			@Override
			public boolean isDone() {			
				if(indice<listaDeAlunos.size()){
					return true;
				}else{
					return false;
				}
			}

			@Override
			public Object currentItem() {		
				try{
					return listaDeAlunos.get(indice);
				}catch(Exception e){
					System.out.println("Não existe ");
					return null;
				}
				
			}

		}
		
		
	
}
