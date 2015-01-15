
public class Villain extends Hero {

	public Villain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	//Public Methods
	public void steals(){
		System.out.println(this.name  + " is stealing");
	}
	
	public void kills(){
		System.out.println(this.name + " is goin' around killin");
	}
	
}
