package j0613;

//기존의 자료형X => 새로운 자료형을 불러와서 데이터 저장, 수정, 조회, 삭제
public class CarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.객체 생성 -> 객체(저장할 대상자)를 저장할 수 있는 공간을 만들어라.
		//형식) 설계도 이름(=클래스 이름) 객체명(=변수)=new 클래스명()
		int age; //4byte 기억 공간이 생성 O
		//Car morning; //객체 선언->기억 공간이 생성X (예약된 상태)
		Car morning=new Car();
		Car sonata=new Car();
		//morning 정보를 저장할 공간 하나 생성하라. 4byte 기억 공간 잡힘. 4byte=int(정수)랑 같음.
		//객체->주소값 패키지명.클래스명@주소
		System.out.println("morning=>"+morning);
		System.out.println("sonata=>"+sonata);
		
		//2.객체명(저장된 위치).멤버변수명=값(저장)=>공장
		morning.name="모닝";
		morning.output=1000;
		morning.color="blue";
		morning.year=2022;
		
		sonata.name="소나타";
		
		//3.운전->시동걸기->메서드 호출=기능 작동(리모콘의 버튼 클릭)
		//객체명.메서드명() or (~,,,,)
		morning.startEnginee();
		morning.SpeedUp(150);//speedUp메서드를 호출하면서 150이라는 매개변수 값을 전달한다.
		morning.SpeedDown(30);//150-30=120으로 달리는 중
		
		System.out.println("차의 이름은=>"+morning.name);
		System.out.println("차의 배기량=>"+morning.output);
		//자주 사용되고 반복적인 코드->메서드를 만들어서 호출하는 게 더 편리함.
		//=>코드의 재사용성,코딩양이 줄어든다.(개발 시간이 단축)=>프로그램의 안정성
		morning.carInfoPrint();
		sonata.carInfoPrint();
		
		
	}

}
