public class Dog extends Animal {
	public Dog() {
		flyable = new NotFly();
		cryable = new DogCry();
	}
}
