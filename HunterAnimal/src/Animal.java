public abstract class Animal implements Doinzoo, Doinforest {
    
    public String aName=null;
    public Map where=null;
    public int money=0;
    public void liveIn(Map w){
    	where=w;
    	System.out.println(this.aName+"�� ������ : "+where.name);
    }
    
    //  ���ӿ� ������ hunting�޼ҵ�, �������� ������ charming�޼ҵ带 ȣ���ϵ��� �߽��ϴ�.
    public void play(){
    	if(where==Forest.instance) hunting();
    	else
    		charming();
    }
    //setWhere�� ���ڰ��� ���� �������̳� �������� �̵��� �� �ְ� �߽��ϴ�.
    public void setWhere(Zoo zoo){
    	this.liveIn(zoo);
    	Zoo.animals.add(this);
    }
    
    public void setWhere(Forest fr) {
    	this.liveIn(fr);
    	Forest.animals.add(this);
    }
    // ��ɲ��� ������ ��� �ȱ� �� ���¸� ǥ���ϱ����� �޼ҵ��Դϴ�. ���� ����Ʈ������ ����������, ������ ����Ʈ�� �߰����� �ʽ��ϴ�.
    public void getWhereForest() {
    	Forest.animals.remove(this);
    }
    
    // ������ ����Ʈ�� Ȯ�� �Ŀ� ������� ������ Ư�� ������ Ż���մϴ�.
    public void escaping(Forest fr){
    	if(Zoo.animals.isEmpty()) {
    		System.out.println("�������� �� Ż���� ������ �����ϴ�.");
    	}else {
    		System.out.println(this.aName+"�� Ż���մϴ�.");
    		setWhere(fr);
    		Zoo.animals.remove(this);
    	}
    }
    
    public abstract void charming();

    public void hunting() {
 
    }
    
 

}
