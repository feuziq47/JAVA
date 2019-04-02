import java.util.ArrayList;

public abstract class Map {
    public String name;
    public ArrayList<Animal> animals;
    //별도의 객체 생성을 하지 않기 때문에 추상 클래스로 생성. 그러나 멤버 변수가 있으므로 인터페이스로 선언하는 것은 부적절.
    
    public abstract void showArray();
    
}
