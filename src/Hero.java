

public class Hero extends Soldat {
	

	private TypesH hero;
	
	
	public Hero() { 
		//create random of hero
		this.hero = TypesH.getTypeHAlea();
		this.setPo(this.hero.getPortee());
		
	}
	public Hero(PositionE p) {
		this.hero = TypesH.getTypeHAlea();
		this.setPo(this.hero.getPortee());
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
		// TODO Auto-generated method stub
		return 0;
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


	public TypesH getHero() {
		return hero;
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
