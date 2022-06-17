package j0615;
//2.this=>현재 생성된 객체를 가리키는 예약어(=키워드)로 사용
public class ThisTest2 {
	
	
	
	ThisTest2(){
		System.out.println("현재 생성된 객체이름(생성자 내부)"+this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest2 aa=new ThisTest2();//현재생성된 객체명:aa
		System.out.println("현재 생성된 객체명(aa)=>"+aa);
		System.out.println("===================");
		ThisTest2 aa2=new ThisTest2();
		System.out.println("현재 생성된 객체명(aa2)=>"+aa2);
	}

}
