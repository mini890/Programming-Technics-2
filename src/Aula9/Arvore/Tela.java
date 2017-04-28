package Aula9.Arvore;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	ArvoreBinaria a;

	Tela() {
		a = new ArvoreBinaria();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		a.desenha(g2d, 400, 500, -90, 5);
	}

}