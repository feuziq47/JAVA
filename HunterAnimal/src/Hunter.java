
public class Hunter implements Doinforest {
	private int hMoney=1000000;
	
	public Hunter() {
		System.out.println("사냥꾼이 나타났습니다.");
	}
	
	//숲속이 비어있을 때는 사냥에 실패하고, 숲속이 비어있지 않을때는 사냥을 성공합니다.
    public void hunting(Animal ani){
    	if(Forest.animals.isEmpty()) {
    		System.out.println("숲속에 잡을 동물이 없습니다.");
    	}else {
    		System.out.println(ani.aName+"를 잡았습니다.");
    		getAnimal(ani);
    	}

    }
    
    //동물을 파는 메소드입니다.출력문과 함께 동물원관리자의 putAnimal메소드를 호출합니다.
    public void sellAnimal(Animal ani,Hunter hunter) {
    	System.out.println("동물 팔러왔습니다.");
    	ZooManager.getInstance().putAnimal(ani,hunter);
    }
	
    //hunting메소드에서 사용되는 숲속에서 동물을 잡는 메소드입니다.
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
    	System.out.println("사냥꾼이 가진 돈은 "+this.hMoney+"원 입니다.");
    }
}
