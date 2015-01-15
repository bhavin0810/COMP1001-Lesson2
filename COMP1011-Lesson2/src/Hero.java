
public class Hero {
	
	//Private Properties
	private int strength;
	private int speed;
	private int health;
	public String name;
	
	///Getters and Setters
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}

	//constructor of the class
	public Hero(String name){
		this.name = name;
		
		generateAbilities();
	}
	
	
	//Public Methods
	public void showAbilities(){
		System.out.println("################################");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("################################");
	}
	
	//Private Method
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	public void fight(){
		System.out.println( this.name + " is Fighting");		
	}
	
	public void run(){
		System.out.println( this.name + " is Running");
	}

	
}
