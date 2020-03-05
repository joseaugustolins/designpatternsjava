package singleton;


public class App {
	public static void main(String[] args){
		Aluno a1 = new Aluno(1, "Aluno 1", 111);
		Aluno a2 = new Aluno(2, "Aluno 2", 2222);
		Aluno a3 = new Aluno(3, "Aluno 3", 333);
		Escola esc = Escola.getInstancia();
		esc.adicionarAluno(a1);
		esc.adicionarAluno(a2);		
		esc.adicionarAluno(a3);
		esc.removerAluno(a2);

		for(Aluno a: esc.getListaDeAlunos()){
			System.out.println(a.getNome());
		}

		
		Escola esc2 = Escola.getInstancia();

		for(Aluno a: esc2.getListaDeAlunos()){
			System.out.println(a.getNome());
		}
		
	}
}
