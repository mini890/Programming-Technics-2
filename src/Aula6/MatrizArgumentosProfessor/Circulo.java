package Aula6.MatrizArgumentosProfessor;

import java.awt.Graphics2D;

public class Circulo implements IGeometry{
	int n, raio;
	
	public Circulo(int n, int raio){
		this.n = n;
		this.raio = raio;
	}
	
	public void desenha(Graphics2D g2d){
		int dim = 5;
		int posx_init = 100;
		int posy_init = 100;
		double ang;
		
		for(int i=0; i<n; i++){
			ang = (i*360/n)*Math.PI/180;
			g2d.fillOval(
					(int) (Math.cos(ang)*raio+posx_init), 
					(int) (Math.sin(ang)*raio+posy_init), 
					dim, dim);
		}
	}
}
