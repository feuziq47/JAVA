
public class Main {

	public static void main(String[] args) {
		Forest fr=new Forest();
		Zoo zoo=new Zoo();
		Tiger t=new Tiger("ȣ����");
		Tiger t2=new Tiger("ȣ����");
		Eagle e=new Eagle("������");
		Hunter h=new Hunter();
		ZooManager zm= new ZooManager();
		System.out.println("--------�����ι� ����� ��-------");
		System.out.println();
		System.out.println("--------���ӿ����� �ൿ-------");
		t.play();
		t2.play();
		e.play();
		t.escaping(fr);
		System.out.println();
		System.out.println("-��ɲ۰� ������ �������� ���� ����ȱ� �� ���� �� ���-");
		h.hunting(t);
		zm.putAnimal(t,h);
		h.showHunterMoney();
		zm.showMoney();
		System.out.println();
		System.out.println("--------������������ �ൿ-------");
		t.play();
		t.escaping(fr);
		System.out.println("-�������� ���ӿ� ��� ������ ���-");
		fr.showArray();
		zoo.showArray();
		
		
		
		
		

	}

}
