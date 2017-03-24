package Aula6.MatrizArgumentosProfessor;

import java.awt.Graphics2D;
//Desenha 5*4 circulos
public class Matriz implements IGeometry{
	
	int ny, nx, spcx, spcy;
	int raio, xi, yi;
	
	public Matriz(int i, int j, int k, int l) {
		nx = i;
		ny = j;
		spcx = k;
		spcy = l;
		
		raio = 7;
		xi = 50;
		yi = 50;
	}
	public void xpto(){}
	@Override
	public void desenha(Graphics2D g2d) {
		for(int j=0; j<ny; j++){
			for(int i=0; i<nx; i++){
				g2d.fillOval(xi+i*spcx, yi+j*spcy, 2*raio, 2*raio);
			}
		}
	}	

}
