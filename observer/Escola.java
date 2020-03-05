package observer;

public class Escola extends Observable{

	@Override
	public void registar(Observer o) {
		this.getListaNofificados().add(o);		
	}

	@Override
	public void retirarRegistro(Observer o) {
		this.getListaNofificados().remove(o);		
	}

	public void removerAluno(String motivo){
		System.out.println("Aluno removido ");
		notificar(motivo);
	}
	
}
