import java.util.ArrayList;

public class Forest extends Map {

	public static Forest instance = null;
	public static ArrayList<Animal> animals=new ArrayList<Animal>(10);
	
	public static Forest getInstance() {
		if(instance==null) instance= new Forest();
		return instance;
	}
	public Forest() {
		this.name="����";
		
	}
    public void play(){
    	hunting();
    }

    public void hunting(){
    	
    }
	@Override
	public void showArray() {
		System.out.println("-----------���� ��� ������-------------");
		for(int i =0;animals.size()>i;i++) {
			System.out.println(animals.get(i).aName);
		}
	}

}
