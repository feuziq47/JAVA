public class Eagle extends Animal {
	public Eagle(String aName) {
		this.aName=aName;
		this.money=1000000;
		Forest.animals.add(this);
		System.out.println(this.aName+"�� ������ ���ƴٴմϴ�.");
	}
	
    public void hunting(){
    	System.out.println(this.aName+"�� �ϴÿ��� ����մϴ�.");
    }

    public void charming(){
    	System.out.println(this.aName+"�� ���忡�� ���⸦ �θ��ϴ�.");
    }
 

}
