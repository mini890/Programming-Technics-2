package Aula6.MatrizArgumentosProfessor;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	IGeometry geometria;

	public Tela(IGeometry geometria) {
		this.geometria = geometria;
	}

	// Este componente � sempre necess�rio para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		// Definir todas as defini��es do paintComponent
		super.paintComponent(g);
		geometria.desenha((Graphics2D)g); // desenha CurvaCubica com nome c1
	}

}
