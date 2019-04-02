import java.util.ArrayList;

public class Zoo extends Map {
	//생성자를 private로 선언해서 외부에서 호출할 수 없도록 함.
	
	private static Zoo instance=null;
	
	public static ArrayList<Animal> animals=new ArrayList<Animal>(4);
    
    //인스턴스를 반환하는 메서드
    public static Zoo getInstance() {
    	if(instance==null) instance = new Zoo();
    	return instance;
    }
    
    public Zoo() {
    	this.name="동물원";
    	System.out.println(name+"이 지어졌습니다.");
    }
    
    public void play(){
    	charming();
    }

    public void charming(){
    	
    }
    
    //동물원에 있는 동물들을 출력하는 메소드입니다.
    public void showArray() {
    	System.out.println("-----------동물원에 사는 동물들-------------");
		for(int i =0;this.animals.size()>i;i++) {
			System.out.println(this.animals.get(i).aName);
		}
    }
}
