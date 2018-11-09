

public class Monstre extends Soldat{

	private TypesM monstre;
	
	public TypesM getMonstre() {
		return monstre; 
	}
	
	
	public Monstre() {
		this.monstre = TypesM.getTypeMAlea();
	}
	
	public Monstre(PositionE p) {
		this.monstre = TypesM.getTypeMAlea();
		this.setPo(this.monstre.getPortee());
		this.setPos(p);
	}
	
	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTour() {
		// TODO Auto-generated method stub
		return 0;
	} 

	@Override
	public int getPortee() {
		return this.monstre.getPortee();
	}

	@Override
	public void joueTour(int tour) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void combat(Soldat soldat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void seDeplace(PositionE newPos) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getPV() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getPui() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getTir() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
