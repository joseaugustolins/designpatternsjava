package observer;

public class Biblioteca implements Observer{

	@Override
	public void onAlunoRemovido(String motivo) {		
		System.out.println("na classe biblioteca motivo: "+motivo);		
	}

}
