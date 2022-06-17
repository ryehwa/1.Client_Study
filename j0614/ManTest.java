package j0614;

public class ManTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.객체 생성=>Man에 대한 정보를 저장할 공간을 따로 새로 생성.
		Man m=new Man();//클래스명 객체명=new 클래스명();
		//j0614.Man@156643d4 => 패키지명.클래스명@16진수
		System.out.println("m=>"+m);//객체에 저장=>주소 저장
		//2.객체명.멤버변수=값(저장) <-> 객체명.멤버변수명
		m.age=40;
		m.name="james";
		m.isMarried=true;
		m.child=3;
		//3.객체명.호출할 메서드명() or (~)
		m.print();
	}

}
