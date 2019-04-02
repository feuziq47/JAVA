public abstract class Animal implements Doinzoo, Doinforest {
    
    public String aName=null;
    public Map where=null;
    public int money=0;
    public void liveIn(Map w){
    	where=w;
    	System.out.println(this.aName+"의 서식지 : "+where.name);
    }
    
    //  숲속에 있을땐 hunting메소드, 동물원에 있을땐 charming메소드를 호출하도록 했습니다.
    public void play(){
    	if(where==Forest.instance) hunting();
    	else
    		charming();
    }
    //setWhere는 인자값에 따라 동물원이나 숲속으로 이동할 수 있게 했습니다.
    public void setWhere(Zoo zoo){
    	this.liveIn(zoo);
    	Zoo.animals.add(this);
    }
    
    public void setWhere(Forest fr) {
    	this.liveIn(fr);
    	Forest.animals.add(this);
    }
    // 사냥꾼이 동물을 잡고 팔기 전 상태를 표현하기위한 메소드입니다. 숲속 리스트에서는 지워졌지만, 동물원 리스트에 추가되진 않습니다.
    public void getWhereForest() {
    	Forest.animals.remove(this);
    }
    
    // 동물원 리스트를 확인 후에 비어있지 않으면 특정 동물이 탈출합니다.
    public void escaping(Forest fr){
    	if(Zoo.animals.isEmpty()) {
    		System.out.println("동물원이 비어서 탈출할 동물이 없습니다.");
    	}else {
    		System.out.println(this.aName+"가 탈출합니다.");
    		setWhere(fr);
    		Zoo.animals.remove(this);
    	}
    }
    
    public abstract void charming();

    public void hunting() {
 
    }
    
 

}
