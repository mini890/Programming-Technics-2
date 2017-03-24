package pt.ismai.tp2.aula06;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	private static final String CURVA = "Curva";
	private static final String MATRIZ = "Matriz";
	private static final String CIRCULO = "Circulo";

	public Janela(String tipo) {
		IGeometry geo;
		switch (tipo) {
		case Janela.CIRCULO:
			geo = new Circulo(16, 50);
			break;
		case MATRIZ:
			geo = new Matriz(5, 4, 25, 25);
			break;
		case CURVA:
			geo = new CurvaCubica(150, 70, 200, 20, 250, 18, 280, 70);
			break;
		default:
			geo = new Circulo(16,50);
			break;
		}

		//Adicionar janela
		add(new Tela(geo));
		//Definir titulo
		setTitle("Exemplo");
		//Fazer com que o bot�o X fa�a algo, neste caso fechar
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Definir tamanho da janela
		setSize(360, 310);
		//Desativar posi��o relativa
		setLocationRelativeTo(null);
		//Fazer com que a janela estaja visivel. Por pr� defini��o n�o est�
		setVisible(true);
		//Impedir o resize da janela
		setResizable(false);
	}
	
	public static void main(String[] args) {
		if (validArgs(args))
			new Janela(args[0]);
		else{
			System.err.println("Tem que passar um dos seguintes argumentos:" + Janela.CIRCULO + ", " + Janela.MATRIZ + " ou " + Janela.CURVA);
			System.err.println("Exemplo: java Janela " + Janela.CIRCULO);
		}
	}

	private static boolean validArgs(String[] args) {
		if(args.length==0)
			return false;
		switch (args[0]) {
		case Janela.CIRCULO:
		case Janela.MATRIZ:
		case Janela.CURVA:
			return true;
		}
		return false;
	}

}