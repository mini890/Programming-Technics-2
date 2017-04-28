package Aula9.Arvore;

import java.awt.Graphics2D;

public class ArvoreBinaria {

	public void desenha(Graphics2D g2d, int x1, int y1, double angulo, int vezes) {
		if (vezes > 0) {
			int x2 = x1 + (int) (Math.cos(Math.toRadians(angulo)) * vezes * 10.0);
			int y2 = y1 + (int) (Math.sin(Math.toRadians(angulo)) * vezes * 10.0);
			g2d.drawLine(x1, y1, x2, y2);
			desenha(g2d, x2, y2, angulo - 20, vezes - 1);
			desenha(g2d, x2, y2, angulo + 20, vezes - 1);
		}
	}

	

}
