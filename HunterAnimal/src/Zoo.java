import java.util.ArrayList;

public class Zoo extends Map {
	//�����ڸ� private�� �����ؼ� �ܺο��� ȣ���� �� ������ ��.
	
	private static Zoo instance=null;
	
	public static ArrayList<Animal> animals=new ArrayList<Animal>(4);
    
    //�ν��Ͻ��� ��ȯ�ϴ� �޼���
    public static Zoo getInstance() {
    	if(instance==null) instance = new Zoo();
    	return instance;
    }
    
    public Zoo() {
    	this.name="������";
    	System.out.println(name+"�� ���������ϴ�.");
    }
    
    public void play(){
    	charming();
    }

    public void charming(){
    	
    }
    
    //�������� �ִ� �������� ����ϴ� �޼ҵ��Դϴ�.
    public void showArray() {
    	System.out.println("-----------�������� ��� ������-------------");
		for(int i =0;this.animals.size()>i;i++) {
			System.out.println(this.animals.get(i).aName);
		}
    }
}
