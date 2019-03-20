public class NoMoney implements SelectLunch {

    public SelectFood getSelectFood(){
    	return new Buritto();
    }

    public SelectCoffee getSelectCoffee(){
    	return new NoCoffee();
    }

}
