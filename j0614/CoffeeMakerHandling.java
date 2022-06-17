package j0614;

class CoffeeMaker{
	String name;
	String brand;
	String color;
	int capsuleno;
	boolean power=false;
	
	//1. 전원 on
	void turnOn() {
		power=!power;
		System.out.println("로딩중..Machine On");
	}
	//2. 전원 off
	void turnOff() {
		power=!power;
		System.out.println("Machine Off");
	}
	//3. 캡슐 메뉴
	void MenuNo(String capsule) {
		if(capsule.equals("americano")) {
			capsuleno=1;
		}else if(capsule.contentEquals("latte")) {
			capsuleno=2;
		}
		System.out.println("현재 메뉴는"+capsule+"입니다");
	}
	//4. 모든 정보
	void allabout() {
		System.out.println("==Coffee Machine==");
		System.out.println("모델명:"+name);
		System.out.println("브랜드:"+brand);
		System.out.println("색상:"+color);
		System.out.println("현재 메뉴는"+capsuleno+"번입니다.");
		System.out.println("전원 상태:"+power);
		
	}
}

public class CoffeeMakerHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMaker Dolce=new CoffeeMaker();
		//객체명
		Dolce.name="돌체구스토";
		Dolce.brand="네스프레소";
		Dolce.color="화이트";
		
		Dolce.turnOn();
		Dolce.MenuNo("americano");
		Dolce.allabout();
		Dolce.turnOff();
		
		
		
	}

}
