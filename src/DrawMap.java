import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawMap extends JPanel {

	private static final long serialVersionUID = 1L;
	private Carte map = new Carte();
	DrawMap(){
		
	}

	public Carte getMap() {
		return map;
	}

	public void setMap(Carte map) {
		this.map = map;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		 this.map.getListElem().forEach(e -> e.seDessine(g));
	}
	
}
