public class Millionaire implements SelectLunch {

    public SelectFood getSelectFood(){
    	return new Noodle();
    }

    public SelectCoffee getSelectCoffee(){
    	return new CaffeLatte();
    }

}
