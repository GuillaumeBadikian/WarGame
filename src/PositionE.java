
public class PositionE implements IConfig {


	private int x, y;
	
	PositionE(int x, int y) { this.x = x; this.y = y; }
	
	PositionE(){}
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public void setX(int x) { this.x = x; }
	
	public void setY(int y) { this.y = y; }
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean estValide() {
		if (x<0 || x>=LARGEUR_CARTE || y<0 || y>=HAUTEUR_CARTE) return false; else return true;
	}
	
	public String toString() { return "("+x+","+y+")"; }
	
	public boolean estVoisine(PositionE pos) {
		return ((Math.abs(x-pos.x)<=1) && (Math.abs(y-pos.y)<=1));
	}
	
	@Override
	public boolean equals(Object obj) {
		PositionE pos = (PositionE) obj;
		if(pos.x == this.x && pos.y == this.y)
			return true;
		return false;
	}
	
	
}