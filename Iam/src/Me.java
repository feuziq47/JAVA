
public class Me extends Animal implements SelectLunch, SelectFood, SelectCoffee {
    private int moneyState;
    private int stress;
    public String name;
    
    public Me(int moneyState,int stress,String name) {
    	this.moneyState=moneyState;
    	this.stress=stress;
    	this.name=name;
    }
    public Me() {
    	cryable = new MeCry();
    	flyable = new NotFly();
    }
    public void setMoney(int x) {
    	if(x>=0) {
    		moneyState=x;
    	}else {
    		moneyState=0;
    	}
    }
    public int getMoney() {
    	return moneyState;
    }
    public void setStress(int y) {
    	if(y>=0) {
    		stress=y;
    	}else {
    		stress=0;
    	}
    }
    public int getStress() {
    	return stress;
    }

    public void getLunch(int moneyState) {
    	if(moneyState<3500) {
    		System.out.println("밥 먹을 돈이 없으니 굶자...");
    	}
    	else if(moneyState>3500 && moneyState<5000) {
    		SelectLunch s1 = new NoMoney();
    		s1.getSelectFood().eating();
    		s1.getSelectCoffee().eating();
    		moneyState-=3500;
    		setMoney(moneyState);
    	}else if(moneyState>5000 && moneyState<10000){
    		SelectLunch s2 = new SomeMoney();
    		s2.getSelectFood().eating();
    		s2.getSelectCoffee().eating();
    		moneyState-=8500;
    		setMoney(moneyState);
    	}else {
    		SelectLunch s3 = new Millionaire();
    		s3.getSelectFood().eating();
    		s3.getSelectCoffee().eating();
    		moneyState-=11000;
    		setMoney(moneyState);
    	}
    }
    public void getClass(int stress) {
    	if(stress>=0 && stress<=5) {
    		System.out.println("컴응실 수업을 듣습니다.");
    		stress += 3;
    		setStress(stress);
    	}else if(stress>5) {
    		System.out.println("잠이 부족해");
    	}
    }
    public void getSleep(int stress) {
    	System.out.println("잠을 잡니다. 스트레스가 풀립니다.");
    	stress -=5;
    	setStress(stress);
    }
    public void getStatus(String name) {
    	System.out.println(name+"의 현재 상태는...");
    	System.out.println("현재 잔액은 "+getMoney()+"입니다.");
		System.out.println("현재 스트레스는 "+getStress()+"입니다.");
    }
    
   
    	
  
	@Override
	public void eating() {
	}
	
	@Override
	public SelectFood getSelectFood() {
		return null;
	}
	
	@Override
	public SelectCoffee getSelectCoffee() {
		return null;
	}
    


}
