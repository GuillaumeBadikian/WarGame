
import java.awt.Color;
import java.awt.Graphics;

import org.omg.CORBA.TRANSACTION_UNAVAILABLE;
public class Obstacle extends Element implements IConfig {
	
	
	public enum TypeObstacle { 
		ROCHER (COULEUR_ROCHER), FORET (COULEUR_FORET), EAU (COULEUR_EAU);
		private final Color COULEUR;
		TypeObstacle(Color couleur) { COULEUR = couleur; }
		public static TypeObstacle getObstacleAlea() {
			return values()[(int)(Math.random()*values().length)]; 
		}
	}
	
	private TypeObstacle TYPE;
	private PositionE pos;
	Obstacle(TypeObstacle type, PositionE pos) { TYPE = type; this.pos = pos; }
	
	public Obstacle(PositionE p) {
		
		this.TYPE = TypeObstacle.getObstacleAlea();
		this.setPos(p);
	}
	public String toString() { return ""+TYPE; }
}