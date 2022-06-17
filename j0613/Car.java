package j0613;
//추상화=>새로운 저장할 대상자(자동차,학생,건물,,,)를 저장할 목적으로 만들어진
//				설계도
public class Car {//클래스명(=새로운 자료형의 이름), int, byte,,,
	
	//Car(객체-저장될 대상자)=> 기본적으로 가지고 있는 특징,특성(=8가지 자료형-already known),+움직임(=기능)
	//1. 멤버변수=>클래스 내부에 선언된 변수->자동으로 초기값 설정된다.
	String name; //명사이름-변수는 누구나 이해할 수 있는 걸로 설정!
	int output; //배기량
	int year=0; //연식
	String color; //차의 색깔 => null(값이 없는 상태) -> String은 값 안주면 null, int는 0임!
	//현재 상태
	int current_speed; //차의 속도
	//int sidong=0; //시동 여부, 0=시동x, 1=시동O
	boolean sidong=false; //차의 시동유무

	//2.공통 기능(=움직임) => 메서드 구현(=함수)
	//	1) 시동걸기(단순,반복)
	void startEnginee() {//기본기능->멤버변수에 저장,출력
		sidong=true;//멤버변수에 값을 저장
		System.out.println("시동이 걸림!!!");
	}
	
	//	2) 차의 주차 기능(시동 off)(단순,반복)
	void stop() {//function stop(){}->in javascript
		sidong=false;
		current_speed=0; //현재 속도 0
		System.out.println("정상적으로 주차 완료");
	}
	
	//	3) 속도를 증가=> 입력O->계산 목적->매개변수 O,반환형X
	void SpeedUp (int speed) {
		current_speed+=speed;//current_speed=current_speed+speed;
		System.out.println(speed+"km만큼 속도 증가됨");
	}
	
	//	4) 속도를 감소
	void SpeedDown(int speed) {
		current_speed-=speed; //current_speed=current_speed-speed;
		System.out.println(speed+"km만큼 속도 감소됨");
	}
	
	// 5) 차의 정보 출력(단순,반복)
	void carInfoPrint() {
		System.out.println("===차의 정보===");
		System.out.println("차의 이름=>"+name);
		System.out.println("차의 배기량=>"+output);
		System.out.println("차의 연식=>"+year);
		System.out.println("차의 색깔=>"+color);
		System.out.println("차의 속도=>"+current_speed);
		System.out.println("차의 시동 유무=>"+sidong);
	}
}
