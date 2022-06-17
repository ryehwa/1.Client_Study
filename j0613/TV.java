package j0613;
//집안에 TV
public class TV {

	//1. 공통의 저장할 특성
	String maker;//제조사->null(default) 데이터 저장 X
	String name; //모델명
	String color; //색깔
	int size; //인치->default: int-> 0, boolean->false, double->0.0 사이즈는 숫자로 저장하므로 int!
	//상태
	boolean power=false;//전원상태
	int channel;//0
	
	//2.TV기능
	//	1)리모콘의 전원 on -> 단순,반복->매개변수 X,반환값X
	void turnOn() {
		power=!power;//power=true;//!false, !:논리연산자(Not=반대되는 것)
		System.out.println("로딩중...TV전원 ON");
	}
	//	2)리모콘의 전원 off
	void turnOff() {
		power=!power; //power=false
		System.out.println("TV 전원 off");
	}
	//	3)채널 up기능=>변경=> 직접 입력 매개변수 O 반환값X =>데이터 입력=>저장,계산,출력
	void channelUp(int ch) {
		channel=ch;//channel+=ch;->이렇게도 가능
		System.out.println("현재 변경된 채널은"+channel);
	}
	//	4)채널 down기능
	void channelDown(int ch) {
		channel-=ch;
		System.out.println("현재 변경된 채널은"+channel);
	}
	//	5)TV채널정보=>채널편성표->단순,반복
	void tvDisplay() {
		System.out.println("==TV정보 출력==");
		System.out.println("모델명=>"+name);
		System.out.println("색상=>"+color);
		System.out.println("현재채널=>"+channel);
		System.out.println("전원상태=>"+power);
	}
	//	6)말하면 채널변경기능=>매개변수O=>말(String),반환값X
	void speakChannel(String ch) {//ex) "ocn"->35번,"sport"->120번
		//String객체=>문자열 비교(equals("비교할 문자열") 대소문자 구분 O 
		//									 equalsIgnoreCase=> 대소문자 구분 X )
		if(ch.equals("ocn")) {
			channel=35;
		}else if(ch.contentEquals("sports")) {
			channel=129;
		}
		System.out.println("현재 채널은"+channel+"로 이동중입니다");
	}
	
}
