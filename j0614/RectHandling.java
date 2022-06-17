package j0614;

//직사각형
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect nemo=new Rect();
		nemo.width=30.25;
		nemo.height=40.32;
		
		nemo.area();
		
		
		/*강사님 해설
		 * 
		 * 1.객체 생성=>공간 생성
		 * Rect r=new Rect();
		 * 2.객체명.멤버변수=값;
		 * r.x=10; r.y=20;
		 * 3.객체명.메서드명() or (~)
		 * r.print();
		 * 4.메서드를 호출해서 값을 저장
		 * r.area(20,40);  //x=20,y=40
		 * 5.반환값이 있는 메서드 호출
		 *=> 형식) 반환받는 변수명=객체명.호출할 메서드명(~)
		 *		// r.area2(60,80);   //2400 -> 출력 안됨 -> 반환값(return)이 있는 경우 출력 방법이 따로 있음.
		 * int reply=r.area2(60,40);   => 이렇게 호출해야 함.
		 * System.out.println("계산받은 결과값(reply)=>"+reply);
		 *  위처럼 반환받아서 출력하거나 아래처럼 직접 출력하거나! 결과는 같음.
		 * System.out.println("r.area2(30,40)=>"+r.area2(30,40)); =>이렇게 한번에 출력해도 됨.
		 */
		
	}

}
