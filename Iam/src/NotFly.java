public class NotFly implements Flyable {
	@Override
	public void fly() {
		System.out.println("날개가 없어서 못 날아갑니다.");
	}
}
