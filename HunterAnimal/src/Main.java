
public class Main {

	public static void main(String[] args) {
		Forest fr=new Forest();
		Zoo zoo=new Zoo();
		Tiger t=new Tiger("호랑이");
		Tiger t2=new Tiger("호랭이");
		Eagle e=new Eagle("독수리");
		Hunter h=new Hunter();
		ZooManager zm= new ZooManager();
		System.out.println("--------등장인물 만들기 끝-------");
		System.out.println();
		System.out.println("--------숲속에서의 행동-------");
		t.play();
		t2.play();
		e.play();
		t.escaping(fr);
		System.out.println();
		System.out.println("-사냥꾼과 동물원 관리자의 동물 사고팔기 및 가진 돈 출력-");
		h.hunting(t);
		zm.putAnimal(t,h);
		h.showHunterMoney();
		zm.showMoney();
		System.out.println();
		System.out.println("--------동물원에서의 행동-------");
		t.play();
		t.escaping(fr);
		System.out.println("-동물원과 숲속에 사는 동물들 출력-");
		fr.showArray();
		zoo.showArray();
		
		
		
		
		

	}

}
