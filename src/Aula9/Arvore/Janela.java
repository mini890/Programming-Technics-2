package Aula9.Arvore;

import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela() {
		add(new Tela());
		setTitle("Arvore Binária");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(true);
	}
	
	public static void main(String[] args) {
		new Janela();
	}

}