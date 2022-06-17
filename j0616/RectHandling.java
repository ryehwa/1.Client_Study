package j0616;
//Rect+RectHandling 합친 것
//직사각형(추상화)=>사물(객체)->생성하기 위한 설계도 역할(직사각형)
class Rect {
	 
	// 1.공통의 멤버변수
	  private int x=10,y=20; //가로(넓이),세로(높이)->x*y->직사각형의 면적
	  private int area;
	  
	//추가 (),(x),(y),(x,y)     //생성자=> 멤버변수 다음에 나옴!, 생성자는 앞에 반환값 쓰지 않음.(int,void,,,안씀)
	  Rect(){
		  this(90,100);//다른 생성자를 호출할 때 맨 첫번째로 써야 된다.(2)
		 /* this.x=20;//현재 생성된 객체          r.x=20
		  this.y=30;									  r.y=30
		  */
		  System.out.println("기본 생성자(멤버변수 초기화)");//(4)
	  }
	  //오버로딩-하나의 클래스에서 비슷한 기능을 가진 메소드 만들 때 각각 만들면 귀찮으니 하나로 통합해주는 것
	  //ㄴ> 이름은 반드시 같고, 매개변수의 갯수가 다르거나,자료형이 달라야 한다.
	  Rect(int x){//int x 로 자료형 설정해주기
		  if(x<0) {
			  System.out.println("음수는 저장 불가");
		  }else {
			  this.x=x;//r2.x=30;
			  //this.y=40; //r2.y=40;
			  System.out.println("1개짜리 생성자 호출(this.x)=>"+this.x);
		  }
	  }
	  Rect(double y){//자료형 변환-int로 하면 에러남 //int->double(자동 형 변환)//int<--(int)double(명시적 형 변환)
		  this.y=(int)y; //자동으로 형 변환 되지 않기 때문에 명시적으로!
	  }
	  Rect(int x,int y){//x=90,y=100
		  this.x=x; //r.x=90
		  this.y=y; //r.y=100
		  System.out.println("2개짜리 생성자 호출");//(3)
	  }
	 //2. Setter(저장), Getter Method(불러와서 출력) 작성 ->보통 멤버변수 바로 밑에 만듦.
	  //보통 Setter, Getter 묶어서 씀!
	  public void setX(int x) {//a가 음수가 될 수도 있으므로 if값으로 예방!
		  if(x<0) {
			  System.out.println("x값은 음수 입력 불가");
			  //x=10; //초기값-> 위에서 초기값 이미 설정해서 여기선 설정 안해도 됨.
			  return;	  //탈출문 역할(break 대신)
		  }
		 this.x=x;//멤버변수=매개변수 x=20
	  }
	  //public void setXXXXXX(매개변수자료형 변수명){멤버변수=매개변수;}
	  public void setY(int y) {//a가 음수가 될 수도 있으므로 if값으로 예방!
		  if(y<0) {
			  System.out.println("y값은 음수 입력 불가");
			  //x=10; //초기값-> 위에서 초기값 이미 설정해서 여기선 설정 안해도 됨.
			  //return;	  //탈출문 역할(break 대신)
		  }else {//return 안쓰면 else 써야 함.
		  this.y=y;//멤버변수=매개변수 r2.y=40;
		  }
	  }	  
	  //public 자료형반환형 getXXXXXX(){return 멤버변수명;}
	  public int getX() {return this.x;}
	  public int getY() {return this.y;}
	  //2. 공통의 기능(=메서드)=>면적을 구하는 메서드
	  //1)매개변수X,반환형X->단순,반복=>똑같은 문장을 반복해서 사용
	 void print(){
		 System.out.println("x의 값=>"+this.x+",이고 y값은 "+this.y);
		 System.out.println("x*y=>"+(this.x*this.y)+"입니다.");
		 }
	 //2) 매개변수 O,반환형 X -> 입력 O => 출력,계산,저장
	 void area(int x,int y){
		 this.x=x;  // ->멤버변수=매개변수x=20
		 this.y=y;
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
		//------Rect클래스 객체 r2생성하면서 인수 1개짜리 정수형생성자 호출--------
		Rect r2=new Rect(30);//x
		r2.setY(40);
		r2.print();//1200
		
		Rect r3=new Rect(50,60);//x,y
		r3.print();//3000
		//------------------------------
		  Rect r=new Rect();//->Rect() 90,100  호출
		 // 2.객체명.멤버변수=값;//엉터리값
		 //r.x=10; r.y=20;
		  //r.setX(-20);//-20->10
		  //r.setY(30); //30*10=300
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
