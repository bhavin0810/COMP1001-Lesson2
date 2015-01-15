
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//instantiate Hero 
		StrongMan hero  = new StrongMan("Bhavin");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//instantiate Hero 
		Villain villain  = new Villain("Viral");
		villain.steals();
		villain.kills();
		villain.showAbilities();
		
		//instantiate Hero 
		Vigilante vigilante  = new Vigilante("Sagar");
		vigilante.run();
		vigilante.steals();
		vigilante.kills();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		
	}

}
