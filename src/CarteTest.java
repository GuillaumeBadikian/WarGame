

import org.junit.Test;

public class CarteTest {

	@Test
	public void test() {
		/*Carte c = new Carte();
	//	c.listElem.add(new Obstacle(new PositionE(5,5)));
		c.getListElem().add(new Obstacle(c.trouvePositionVide(new PositionE(5, 5)))); // pareil que en dessous
		c.add(new Hero(new PositionE(5,5)));
		c.getListElem().forEach(f -> {
			System.out.println(f.instanceofHero()+ "  "+f.getPos());
		});
		System.out.println("------------------------");
		
		c.trouvePositionVide(new PositionE(5, 5)); 
		c.affiche();
		*/
		Hero r = new Hero();
		System.out.println(r.getHero().name());
		
	}

}
