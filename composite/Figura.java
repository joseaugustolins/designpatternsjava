package composite;

import java.util.ArrayList;
import java.util.List;

public class Figura extends Grafico {

	private List<Grafico> componentes = new ArrayList<Grafico>();
	
	@Override
	public void draw() {
		System.out.println("Desenha a figura ");
		for(Grafico componente : this.componentes){
			componente.draw();
		}
	}

	public void add(Grafico g){
	//	System.out.println(g.getClass());
		this.componentes.add(g);		
	}

	public void remove(Grafico g){
		System.out.println("Remover grafico");
	}	
	
	@Override
	public Grafico getChild(int i) {
		// TODO Auto-generated method stub
		if(i>=componentes.size() || i<0){
			System.out.println("Filho Não Existe!!!");
			return null;
		}else{
			return componentes.get(i);
		}
	}
}