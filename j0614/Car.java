package j0614;
//추상화=>새로운 저장할 대상자(자동차,학생,건물,,,)를 저장할 목적으로 만들어진
//				설계도
public class Car {//클래스명(=새로운 자료형의 이름), int, byte,,,
	
	//Car(객체-저장될 대상자)=> 기본적으로 가지고 있는 특징,특성(=8가지 자료형-already known),+움직임(=기능)
	//1. 멤버변수=>클래스 내부에 선언된 변수->자동으로 초기값 설정된다.
	private String name; //명사이름-변수는 누구나 이해할 수 있는 걸로 설정!
	private int output; //배기량
	private int year=0; //연식
	private String color; //차의 색깔 => null(값이 없는 상태) -> String은 값 안주면 null, int는 0임!
	//현재 상태
	private int current_speed; //차의 속도
	//int sidong=0; //시동 여부, 0=시동x, 1=시동O
	private boolean sidong=false; //차의 시동유무
	
	//2.Setter Method
	public void setName(String n) {
		if(n!=null)//값을 입력했다면
		name=n; //멤버변수명="모닝"
		else
			System.out.println("name값은 반드시 저장해야 합니다.");
	}
	//외부로부터 값을 입력->검증->엉터리값->저장X
	//음수X, 양수도 어느정도 범위만 허락
	public void setOutput(int ou) {
		if(ou<0 || ou>5000) {//-1000
			System.out.println("입력 받은 값은 음수를 입력하거나 5000이상 저장 불가");
			output=1000;
			return; //break
		}
		output=ou;//output=-1000;
	}
	public void setYear(int y) {
		if(y<0 || y>2022) {
			System.out.println("년도는 음수이거나 2022 올해보다 클 수 없다");
			year=2022;//default
		}else {
		year=y;
	}
	}
	public void setColor(String c) {
		color=c;
	}
	public void setCurrent_speed(int cu) {
		current_speed=cu;
	}
	public void setSidong(boolean si) {
		sidong=si;
	}
	public String getName() {return name;}
	public int getOutput() {return output;}
	public int getYear() {return year;}
	public String getColor() {return color;}
	public int getCurrent_speed() {return current_speed;}
	public boolean getSidong() {return sidong;}
	
	

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
	//음수이거나 / 양수->170km 이상 속도 증가 X
	void SpeedUp (int speed) {
		//시동이 걸린 상태라면
		if(sidong) {//if(sidong==true) {boolean변수인 경우
		if((speed < 0) || (current_speed+speed>=170)) {
			System.out.println("속도는 음수이거나 170km 이상은 불가임");
			current_speed=120;//기본값
		}else {//>170이거나 음수가 아닌 경우
			current_speed+=speed;//current_speed=current_speed+speed;
			System.out.println(speed+"km만큼 속도 증가됨");
		}
		}else {//시동이 안걸린 상태
			System.out.println("먼저 시동을 걸어야 속도를 증가시킬 수 있음");
		}
	}
	
	
	//	4) 속도를 감소(음수이거나 양수(current_speed-speed<=0))
	void SpeedDown(int speed) { //내가 했음. 틀릴 수도 있으므로 다시 자세히 보기.
		if((speed < 170) || (current_speed-speed>=0)) {
			System.out.println("속도는 음수이거나 170km 이상은 불가임");
			current_speed=120;//기본값
		}else {//>170이거나 음수가 아닌 경우
			current_speed-=speed;//current_speed=current_speed-speed;
			System.out.println(speed+"km만큼 속도 감소됨");
		}
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
