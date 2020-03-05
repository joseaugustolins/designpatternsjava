package observer;

public class Protocolo implements Observer{

	@Override
	public void onAlunoRemovido(String motivo) {
		System.out.println("aluno foi removido "+motivo);
		
	}

}
