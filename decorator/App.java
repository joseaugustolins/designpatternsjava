package decorator;


public class App {
	public static void main(String[] args){
		Aluno a1 = new Aluno(1, "nuno 1", 111);
		Aluno a2 = new Aluno(2, "neo 2", 2222);
		Aluno a3 = new Aluno(3, "maria", 333);
		Aluno a4 = new Aluno(4, "navarro", 444);
		Aluno a5 = new Aluno(5, "xllaa", 555);
		Aluno a6 = new Aluno(6, "nena", 66);
		IEscola esc = new Escola();		
		esc.adicionarAluno(a1);
		esc.adicionarAluno(a2);		
		esc.adicionarAluno(a3);
		esc.adicionarAluno(a4);
		esc.adicionarAluno(a5);
		esc.adicionarAluno(a6);			
		
		
		System.out.println("-----------------------");
		System.out.println("Busca todos os Alunos");
		System.out.println("-----------------------");
		for(Aluno a: esc.listarAlunos()){
			System.out.println(a.getNome());
		}
		
		
		System.out.println("-----------------------");
		System.out.println("Busca Apenas Alunos que inicia pela Letra Desejada");
		System.out.println("-----------------------");  
		esc = new ListarAlunosDecoratorIniciaCom(esc);
		for(Aluno a: esc.listarAlunos("n")){
			System.out.println(a.getNome());
		}
		
		

		System.out.println("-----------------------");
		System.out.println("Busca Apenas Alunos que tem a Segunda Letra");
		System.out.println("-----------------------");
		esc = new ListarAlunosDecoratorSegundaLetra(esc);
		for(Aluno a: esc.listarAlunos("a")){
			System.out.println(a.getNome());
		}
	}
}