public class SomeMoney implements SelectLunch {

    public SelectFood getSelectFood(){
    	return new Rice();
    }

    public SelectCoffee getSelectCoffee(){
    	return new Americano();
    }

}
