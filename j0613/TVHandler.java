package j0613;//같은 패키지에 불러올 패키지가 존재하면 자동으로 불러옴.

public class TVHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. TV-> 객체(tv)(같은 구조=>모양이 다름(size))
		TV smartTV=new TV();
		// 2. 객체명(위치).멤버변수=저장할 값
		smartTV.name="삼성 smartTV";
		smartTV.maker="삼성";
		smartTV.color="검정색";
		smartTV.size=50;
		
		//3.주문->배송->설치
		smartTV.turnOn();//객체명.호출할 메서드() or (~)
		smartTV.channelUp(45);
		smartTV.channelDown(15);//45-15=30
		smartTV.speakChannel("ocn");
		//전체 채널 편성표
		smartTV.tvDisplay();
		smartTV.turnOff();
		//smartTV.tvDisplay();

	}

}
