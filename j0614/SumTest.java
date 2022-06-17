package j0614;
/*
 * 2개의 값을 입력을 받아서 사칙연산(+,-,*,/)을 해주는 프로그램을 작성?
 */

public class SumTest {//프로그램=>회사
	//1.데이터 저장 목적(=멤버변수) 2.메서드 호출 목적
	//멤버변수가 없으면 데이터 저장 목적X

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수
		int a=100;
		int b=50;
		int c=50,d=30;
		
		//(1)단순,반복적인 구문
		/*
		System.out.println("(a+b)=>"+(a+b));
		System.out.println("(a-b)=>"+(a-b));
		System.out.println("(a*b)=>"+(a*b));
		System.out.println("(a/b)=>"+(a/b));
		*/
		//메서드를 호출->객체를 생성->객체명.호출할메서드() or (~)
		SumTest st=new SumTest(); //객체 생성 -데이터 저장 or 일 시키려고 여기서는 일 시키기 위함.
		st.calculate(a, b); //100,50
		st.calculate(78, 90);//재사용성
		st.calculate(23, 45);
		st.calculate(12, 78);
		
		for(int i=1;i<=10;i++)
		st.calculate(90, 9);
	}
	
	//부하직원(Work Method)->매개변수 O or X, 반환값 X
	void calculate(int a,int b) {
		System.out.println("(a+b)=>"+(a+b));
		System.out.println("(a-b)=>"+(a-b));
		System.out.println("(a*b)=>"+(a*b));
		System.out.println("(a/b)=>"+(a/b));
		System.out.println("=============");
	}
	

}
