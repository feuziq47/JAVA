public class Eagle extends Animal {
	public Eagle(String aName) {
		this.aName=aName;
		this.money=1000000;
		Forest.animals.add(this);
		System.out.println(this.aName+"가 숲속을 날아다닙니다.");
	}
	
    public void hunting(){
    	System.out.println(this.aName+"가 하늘에서 사냥합니다.");
    }

    public void charming(){
    	System.out.println(this.aName+"가 새장에서 묘기를 부립니다.");
    }
 

}
