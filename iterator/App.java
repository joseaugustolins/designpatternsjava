package iterator;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escola esc = new Escola();
		
		esc.adicionarAluno(new Aluno(1, "Alberta", 111));
		esc.adicionarAluno(new Aluno(2, "Bebeto", 222));
		esc.adicionarAluno(new Aluno(3, "Carla", 333));
		esc.adicionarAluno(new Aluno(4, "Debi", 444));
		esc.adicionarAluno(new Aluno(5, "Elvira", 555));
		esc.adicionarAluno(new Aluno(6, "Fagundas", 666));
		esc.adicionarAluno(new Aluno(7, "Galu", 777));
		esc.adicionarAluno(new Aluno(8, "Holvinda", 888));
		esc.adicionarAluno(new Aluno(9, "Irineia", 999));
		
		Iterador i = esc.createIterator();
		Aluno a = (Aluno)i.first();
		System.out.println(a.getNome());
		i.next();
		i.next();
		a = (Aluno)i.next();
		System.out.println(a.getNome());
		i.next();
		i.next();
		a = (Aluno)i.currentItem();
		System.out.println(a.getNome());		
		i.next();
		i.next();
		i.next();		
		a = (Aluno)i.currentItem();
		System.out.println(a.getNome());
		
		
		
		System.out.println("----------------");
		System.out.println("Comeca Iteracao");
		System.out.println("----------------");			
		for(Iterador ite = esc.createIterator(); ite.isDone(); ite.next()){
			Aluno aluno = (Aluno)ite.currentItem();
			System.out.println(aluno.getNome());
			
		}
	}

}
