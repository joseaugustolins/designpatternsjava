package composite;

public class App {
	public static void main(String[] args){
		Grafico figContainer1 = new Figura();
		Linha linha1 = new Linha();
		Texto texto1 = new Texto();
		Retangulo retangulo1 = new Retangulo();
		figContainer1.add(linha1);
		figContainer1.add(texto1);
		figContainer1.add(retangulo1);
		figContainer1.draw();		
		
		Grafico f1 = figContainer1.getChild(1);
		System.out.println(f1);
		
	}
}
