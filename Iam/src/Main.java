import java.util.Scanner;

public class Main {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
	
		Me me = new Me();
		me.setMoney(10000);		//MoneyState �ʱⰪ ����
		me.getMoney();
		me.setStress(4);		//Stress �ʱⰪ ����
		me.getStress();
		int a;
		System.out.println("�Ϸ� �ϰ� ����");
		System.out.println("�̸��� �Է��ϼ���.");
		me.name=scan.nextLine();
		while(true) {
			System.out.println("�� ���� �������ּ���.\n");
			System.out.println("1.���� ���, 2.��Ա�, 3.���ڱ�, 4.���� ���� ���, 5.����");
			a=scan.nextInt();
			if(a==1)
				me.getClass(me.getStress());
			else if(a==2)
				me.getLunch(me.getMoney());
			else if(a==3) {
				me.getSleep(me.getStress());
			}else if(a==4) {
				me.getStatus(me.name);
			}else if(a==5) {
				System.out.println("�����մϴ�.");
				break;
			}else
				System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
		//Strategy ���� ���.
		Animal d= new Dog();
		d.cry();
		d.fly();
		d.setFly(new FlyWithWings()); //
		
		
		

	}

}
