package observer;

public class App {
	
	public static void main(String[] args){
		Observer b = new Biblioteca();
		Observer c = new Cantina();
		Observer p = new Protocolo();
		Escola e = new Escola();
		e.registar(b);
		e.registar(c);
		e.registar(p);
		e.removerAluno("Aluno Concluiuu");
	}	
}