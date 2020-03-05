package abstractfactory;

public class App {

	public static void main(String[] args) {
		
		//criar MotifWidget 
		WidgetFactory factory1 = WidgetFactory.obterFactory(ConfiguracaoDesejada.MotifWidget);
		Botao botao1 = factory1.criarBotao();
		botao1.desenhar();
		Janela janela1 = factory1.criarJanela();
		janela1.desenhar();
		

		//criar QtWidget
		WidgetFactory factory2 = WidgetFactory.obterFactory(ConfiguracaoDesejada.QtWidget);
		Botao botao2 = factory2.criarBotao();
		botao2.desenhar();
		Janela janela2 = factory2.criarJanela();
		janela2.desenhar();
	}

}
