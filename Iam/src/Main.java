import java.util.Scanner;

public class Main {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
	
		Me me = new Me();
		me.setMoney(10000);		//MoneyState 초기값 설정
		me.getMoney();
		me.setStress(4);		//Stress 초기값 설정
		me.getStress();
		int a;
		System.out.println("하루 일과 시작");
		System.out.println("이름을 입력하세요.");
		me.name=scan.nextLine();
		while(true) {
			System.out.println("할 일을 선택해주세요.\n");
			System.out.println("1.수업 듣기, 2.밥먹기, 3.잠자기, 4.현재 상태 출력, 5.종료");
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
				System.out.println("종료합니다.");
				break;
			}else
				System.out.println("잘못 입력했습니다.");
		}
		
		//Strategy 패턴 사용.
		Animal d= new Dog();
		d.cry();
		d.fly();
		d.setFly(new FlyWithWings()); //
		
		
		

	}

}
