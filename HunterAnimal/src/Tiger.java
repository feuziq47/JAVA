public class Tiger extends Animal {
	public Tiger(String aName) {
		this.aName=aName;
		this.money=5000000;
		Forest.animals.add(this);
		System.out.println(this.aName+"�� ������ �Ŵմϴ�.");
	}
	
    public void hunting(){
    	System.out.println(this.aName+"�� ����մϴ�.");
    }

    public void charming(){
    	System.out.println(this.aName+"�� ���⸦ �θ��ϴ�.");
    }
 

}
