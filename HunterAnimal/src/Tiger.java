public class Tiger extends Animal {
	public Tiger(String aName) {
		this.aName=aName;
		this.money=5000000;
		Forest.animals.add(this);
		System.out.println(this.aName+"가 숲속을 거닙니다.");
	}
	
    public void hunting(){
    	System.out.println(this.aName+"가 사냥합니다.");
    }

    public void charming(){
    	System.out.println(this.aName+"가 묘기를 부립니다.");
    }
 

}
