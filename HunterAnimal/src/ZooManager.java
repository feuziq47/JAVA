public class ZooManager {
	private int mMoney=10000000;
	
	// ������ �����ڴ� �̱��� ������ �̿��ؼ� �ϳ��� ��ü�� �����ǰ� �߽��ϴ�.
	private static ZooManager instance=null;
	  public static ZooManager getInstance() {
	    	if(instance==null) instance = new ZooManager();
	    	return instance;
	    }
	    
	    public ZooManager() {
	    	this.mMoney=mMoney;
	    }
	
	
	//�������� ������ 4���� �̻��̸� ������ ���� �ʰ�, �̸��� ���� ��ɲۿ��� ���� �ְ� ������ �������� �ֽ��ϴ�.
    public void putAnimal(Animal ani,Hunter hunter){
    	if(Zoo.animals.size()>=4) { 
    		System.out.println("�������� ��á���ϴ�.");
    	}else {
    		Zoo.animals.add(ani);
    		this.mMoney -=ani.money;
    		int temp=hunter.getMoney();
    		temp += ani.money;
    		hunter.setMoney(temp);
    		System.out.println(ani.aName+"�� ���Ӵϴ�.");
    	}
    }
    
    
    //�����������ڰ� �������� �����ִ� �޼ҵ��Դϴ�.
    public void showMoney() {
    	System.out.println("������ �����ڰ� ���� ���� "+this.mMoney+"�� �Դϴ�.");
    }
    
}
