
public class Hunter implements Doinforest {
	private int hMoney=1000000;
	
	public Hunter() {
		System.out.println("��ɲ��� ��Ÿ�����ϴ�.");
	}
	
	//������ ������� ���� ��ɿ� �����ϰ�, ������ ������� �������� ����� �����մϴ�.
    public void hunting(Animal ani){
    	if(Forest.animals.isEmpty()) {
    		System.out.println("���ӿ� ���� ������ �����ϴ�.");
    	}else {
    		System.out.println(ani.aName+"�� ��ҽ��ϴ�.");
    		getAnimal(ani);
    	}

    }
    
    //������ �Ĵ� �޼ҵ��Դϴ�.��¹��� �Բ� �������������� putAnimal�޼ҵ带 ȣ���մϴ�.
    public void sellAnimal(Animal ani,Hunter hunter) {
    	System.out.println("���� �ȷ��Խ��ϴ�.");
    	ZooManager.getInstance().putAnimal(ani,hunter);
    }
	
    //hunting�޼ҵ忡�� ���Ǵ� ���ӿ��� ������ ��� �޼ҵ��Դϴ�.
    public void getAnimal(Animal ani){
    	ani.getWhereForest();
    }
    public int getMoney() {
    	return hMoney;
    }
    public void setMoney(int t) {
    	hMoney=t;
    }
    public void showHunterMoney() {
    	System.out.println("��ɲ��� ���� ���� "+this.hMoney+"�� �Դϴ�.");
    }
}
