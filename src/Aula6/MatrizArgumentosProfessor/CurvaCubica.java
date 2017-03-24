package pt.ismai.tp2.aula06;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;

public class CurvaCubica implements IGeometry{
	int raio;
	
	float x1, y1, x2, y2;
	float ctrlx1, ctrly1, ctrlx2, ctrly2;
	
	public CurvaCubica(int i, int j, int k, int l, int m, int n, int o, int p) {
		// TODO Auto-generated constructor stub
		x1 = i;
		y1 = j;
		ctrlx1 = k;
		ctrly1 = l;
		ctrlx2 = m;
		ctrly2 = n;
		x2 = o;
		y2 = p;
		
		raio = 5;
	}
	
	public void setRaio(int novoRaio){
		raio = novoRaio;
	}
	
	public void desenha(Graphics2D g2d){
		CubicCurve2D.Float curva = new CubicCurve2D.Float(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
		g2d.draw(curva);
		
		g2d.fillOval((int) x1-raio, (int) y1-raio, 2*raio, 2*raio);
		g2d.fillOval((int) x2-raio, (int) y2-raio, 2*raio, 2*raio);
		g2d.setColor(Color.RED);
		g2d.drawLine((int)x1, (int)y1, (int)ctrlx1, (int)ctrly1);
		g2d.drawLine((int)x2, (int)y2, (int)ctrlx2, (int)ctrly2);
		g2d.setColor(Color.BLUE);
		g2d.fillOval((int) ctrlx1-raio, (int) ctrly1-raio, 2*raio, 2*raio);
		g2d.fillOval((int) ctrlx2-raio, (int) ctrly2-raio, 2*raio, 2*raio);
	}
}
