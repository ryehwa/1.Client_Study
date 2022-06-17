package j0615;
//Rect+RectHandling 합친 것
//직사각형(추상화)=>사물(객체)->생성하기 위한 설계도 역할(직사각형)
class Rect {
	 
	// 1.공통의 멤버변수
	  private int x=10,y=20; //가로(넓이),세로(높이)->x*y->직사각형의 면적
	  private int area;
	  
	 //2. Setter(저장), Getter Method(불러와서 출력) 작성 ->보통 멤버변수 바로 밑에 만듦.
	  //보통 Setter, Getter 묶어서 씀!
	  public void setX(int a) {//a가 음수가 될 수도 있으므로 if값으로 예방!
		  if(a<0) {
			  System.out.println("x값은 음수 입력 불가");
			  //x=10; //초기값-> 위에서 초기값 이미 설정해서 여기선 설정 안해도 됨.
			  return;	  //탈출문 역할(break 대신)
		  }
		  x=a;//멤버변수=매개변수 x=20
	  }
	  //public void setXXXXXX(매개변수자료형 변수명){멤버변수=매개변수;}
	  public void setY(int b) {//a가 음수가 될 수도 있으므로 if값으로 예방!
		  if(b<0) {
			  System.out.println("y값은 음수 입력 불가");
			  //x=10; //초기값-> 위에서 초기값 이미 설정해서 여기선 설정 안해도 됨.
			  //return;	  //탈출문 역할(break 대신)
		  }else {//return 안쓰면 else 써야 함.
		  y=b;//멤버변수=매개변수 x=20
		  }
	  }	  
	  //public 자료형반환형 getXXXXXX(){return 멤버변수명;}
	  public int getX() {return x;}
	  public int getY() {return y;}
	  //2. 공통의 기능(=메서드)=>면적을 구하는 메서드
	  //1)매개변수X,반환형X->단순,반복=>똑같은 문장을 반복해서 사용
	 void print(){
		 System.out.println("x의 값=>"+x+",이고 y값은 "+y);
		 System.out.println("x*y=>"+(x*y)+"입니다.");
		 }
	 //2) 매개변수 O,반환형 X -> 입력 O => 출력,계산,저장
	 void area(int a,int b){
		 x=a;  // ->멤버변수=매개변수x=20
		 y=b;
		 System.out.println("x*y=>"+(x*y)+"입니다.");
	 }
	 //3) 매개변수O,반환형O -> 계산 목적, 웹프로그래밍에서 많이 활용
	 int area2(int a,int b){
	 		int result=a*b;
	 		return result; // => 형식) return 계산한 값(변수)  or 수식 or 객체
	 							//				return이 마지막 문장, return=>반환값
	 					//System.out.println("result=>"+result)=> return 뒤에 이런 거 나오면 안됨!
	 }
	}

public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //1.객체 생성=>공간 생성
		  Rect r=new Rect();
		 // 2.객체명.멤버변수=값;//엉터리값
		 //r.x=10; r.y=20;
		  r.setX(-20);//-20->10
		  r.setY(30); //30*10=300
		  //3.객체명.메서드명() or (~)
		  r.print();
		  //4.메서드를 호출해서 값을 저장
		  r.area(20,40);  //x=20,y=40
		  //5.반환값이 있는 메서드 호출
		// => 형식) 반환받는 변수명=객체명.호출할 메서드명(~)
		 		// r.area2(60,80);   //2400 -> 출력 안됨 -> 반환값(return)이 있는 경우 출력 방법이 따로 있음.
		  int reply=r.area2(60,40);  // => 이렇게 호출해야 함.
		  System.out.println("계산받은 결과값(reply)=>"+reply);
		  // 위처럼 반환받아서 출력하거나 아래처럼 직접 출력하거나! 결과는 같음.
		  System.out.println("r.area2(30,40)=>"+r.area2(30,40));// =>이렇게 한번에 출력해도 됨.
	
	}

}
