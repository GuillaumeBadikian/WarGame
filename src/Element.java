import java.awt.Color;
import java.awt.Graphics;

public abstract class Element implements IConfig {

	private PositionE pos = new PositionE();
	
	public Element() {
		
	}
	
	
	public PositionE getPos() {
		return pos;
	}

	public void setPos(PositionE pos) {
		this.pos = pos;
	}
	
	
	public boolean instanceofHero() {
		return this instanceof Hero;
	}
	public boolean instanceofMonstre() {
		return this instanceof Monstre;
	}
	public boolean instanceofObstacle() {
		return this instanceof Obstacle;
	}
	
	 public void seDessine(Graphics g)
	  {
	  	
	  	if(this instanceof Hero)
	  		g.setColor(IConfig.COULEUR_HEROS);
	  	if(this.instanceofMonstre())
	  		g.setColor(COULEUR_MONSTRES);
	  	if(this.instanceofObstacle())
	  		g.setColor(COULEUR_EAU);
	  	g.fillRect(pos.getX() * NB_PIX_CASE, pos.getY() * NB_PIX_CASE, NB_PIX_CASE, NB_PIX_CASE);
	}
	
	
}
