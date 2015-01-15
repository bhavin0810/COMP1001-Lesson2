
public class StrongMan extends Hero {

	//Constructor
	public StrongMan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.bootsStrength();
	}

	//Private Methods
	private void bootsStrength(){
		this.strength += 50;
		if(this.strength > 100){
			this.strength = 100;
		}
	}
}
