
public class Speedstr extends Hero {
	
	//Constructor
	public Speedstr(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
		this.bootsSpeed();
	}

	//Private Methods
	private void bootsSpeed(){
		this.speed += 50;
		if(this.speed > 100){
			this.speed = 100;
		}
	}
}
