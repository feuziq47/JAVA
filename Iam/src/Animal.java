public abstract class Animal {
	Flyable flyable;
	Cryable cryable;
	
    public void fly(){
    	flyable.fly();
    }

    public void cry(){
    	cryable.cry();
    }
    
    public void setFly(Flyable flyable) {
    	this.flyable=flyable;
    }
    
    public void setCry(Cryable cryable) {
    	this.cryable=cryable;
    }

}
