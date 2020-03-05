package observer;

public class Cantina implements Observer{

	@Override
	public void onAlunoRemovido(String motivo) {
		System.out.println("classe cantina motivo: "+motivo);
		
	}

}
