public class Bird extends Animal {
	public Bird() {
		flyable = new FlyWithWings();
		cryable = new BirdCry();
	}
	
}
