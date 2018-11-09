import java.awt.Graphics;

public interface ICarte {
	Element getElement(PositionE pos);
	PositionE trouvePositionVide(); // Trouve aleatoirement une position vide sur la carte
	PositionE trouvePositionVide(PositionE pos); // Trouve une position vide choisie
								// aleatoirement parmi les 8 positions adjacentes de pos
	Hero trouveHeros(); // Trouve aleatoirement un heros sur la carte
	Hero trouveHeros(PositionE pos); // Trouve un heros choisi aleatoirement
									 // parmi les 8 positions adjacentes de pos
	boolean deplaceSoldat(PositionE pos, Soldat soldat);
	void mort(Soldat perso);
	boolean actionHeros(PositionE pos, PositionE pos2);
	void jouerSoldats(PanneauJeu pj);
	void toutDessiner(Graphics g);
}