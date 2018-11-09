import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;



public class Carte implements IConfig, ICarte{

	private ArrayList<Element> listElem = new ArrayList<>();
	
	
	public ArrayList<Element> getListElem() {
		return listElem;
	}


	public void setListElem(ArrayList<Element> listElem) {
		this.listElem = listElem;
	}

	
	public void add(Element e) {
		if(e.instanceofHero())
			this.listElem.add(new Hero(this.trouvePositionVide(e.getPos())));
		if(e.instanceofMonstre())
			this.listElem.add(new Monstre(this.trouvePositionVide(e.getPos())));
	}

	public Carte() {
		int i;
		for(i = 0; i< IConfig.NB_OBSTACLES;i++) { // creation des obstacles
			PositionE pos = this.trouvePositionVide(); // positions
			listElem.add(new Obstacle(pos));
			listElem.get(i).setPos(pos); 
		}
		
		for(i = NB_OBSTACLES; i< IConfig.NB_HEROS+NB_OBSTACLES;i++) { // creation des heros
			listElem.add(new Hero());
			listElem.get(i).setPos(this.trouvePositionVide()); //position du hero
		}
		for(i = NB_OBSTACLES+NB_HEROS; i< IConfig.NB_HEROS+NB_OBSTACLES+NB_MONSTRES;i++) { // creation des heros
			listElem.add(new Monstre());
			listElem.get(i).setPos(this.trouvePositionVide()); //position du hero
		}
		
		
	}

	public void affiche() {
		for(int i =0;i<IConfig.HAUTEUR_CARTE;i++) {
			for(int j=0;j<LARGEUR_CARTE;j++) {
				//System.out.print(i + "i j"+ j + " | ");
				int pos = this.PosExist(new PositionE(j,i));
				if(pos != -1) {
					
					System.out.print(this.listElem.get(pos).getClass().getName()+ " | ");
				}
				else
					System.out.print("0 | ");
				
			}
			System.out.println("\n");
		}
		
	}

	/**
	 * 
	 * @param pos
	 * @return -1 si vide sinon la position de l'element dans la liste
	 */
	public int PosExist(PositionE pos) {
		AtomicInteger i = new AtomicInteger(0);
		AtomicInteger index = new AtomicInteger(-1);
		this.listElem.forEach(e -> {
			
			if(e.getPos().equals(pos)) {
				index.set(i.get());
			}
			i.set(i.get()+1);
		});
		return index.get();
	}

	@Override
	public Element getElement(PositionE pos) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PositionE trouvePositionVide() {
		Random rx = new Random();
		Random ry = new Random();

		return trouvePositionVide(new PositionE(rx.nextInt(LARGEUR_CARTE),ry.nextInt(HAUTEUR_CARTE)));
	}


	@Override
	public PositionE trouvePositionVide(PositionE pos) {
		if(pos.estValide()) {
			AtomicBoolean vide = new AtomicBoolean(true);
			this.listElem.forEach(l -> {
				if(l.getPos().equals(pos)){
					vide.set(false);
				}
			});
			if(vide.get()==true)
				return pos;
			else
				return trouvePositionVide();
			}
		else
			throw new IllegalArgumentException("Hors map");
		
	}


	@Override
	public Hero trouveHeros() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Hero trouveHeros(PositionE pos) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean deplaceSoldat(PositionE pos, Soldat soldat) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void mort(Soldat perso) {

		
	}


	@Override
	public boolean actionHeros(PositionE pos, PositionE pos2) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void jouerSoldats(PanneauJeu pj) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void toutDessiner(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	
}