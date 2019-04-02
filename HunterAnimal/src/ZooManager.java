public class ZooManager {
	private int mMoney=10000000;
	
	// 동물원 관리자는 싱글턴 패턴을 이용해서 하나의 객체만 생성되게 했습니다.
	private static ZooManager instance=null;
	  public static ZooManager getInstance() {
	    	if(instance==null) instance = new ZooManager();
	    	return instance;
	    }
	    
	    public ZooManager() {
	    	this.mMoney=mMoney;
	    }
	
	
	//동물원에 동물이 4마리 이상이면 동물을 넣지 않고, 미만일 때는 사냥꾼에게 돈을 주고 동물을 동물원에 넣습니다.
    public void putAnimal(Animal ani,Hunter hunter){
    	if(Zoo.animals.size()>=4) { 
    		System.out.println("동물원이 꽉찼습니다.");
    	}else {
    		Zoo.animals.add(ani);
    		this.mMoney -=ani.money;
    		int temp=hunter.getMoney();
    		temp += ani.money;
    		hunter.setMoney(temp);
    		System.out.println(ani.aName+"을 가둡니다.");
    	}
    }
    
    
    //동물원관리자가 가진돈을 보여주는 메소드입니다.
    public void showMoney() {
    	System.out.println("동물원 관리자가 가진 돈은 "+this.mMoney+"원 입니다.");
    }
    
}
