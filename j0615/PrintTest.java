package j0615;
//생성자 오버로딩+메서드 오버로딩
//클래스를 작성하는 목적->객체생성->1.데이터저장 2.메서드호출
class Test2{
	void test() {
		System.out.println("다른 클래스 객체명은 사용이 가능해요");
		
	}
}

public class PrintTest {
	
	//3)생성자 오버로딩->메서드->메서드를 호출하는 기법	
	PrintTest(){} //기본 생성자는 없으면 만들어서 자동으로 호출한다.
	PrintTest(char a){
		//생성자 내부에서는 자기 클래스의 객체명을 사용 X
		//다른 클래스의 객체명은 사용할 수 있다.(O)
		print(a);//print('v');//(2)
		Test2 t2=new Test2();
		t2.test();
		System.out.println("char 매개변수를 받아서 처리함!!");//(4)
	}
	PrintTest(int a){
		print(a);//print(2022) //(6)(8)		
	}
	PrintTest(boolean a){
		print(a);//print(3<2);//(10)(12)
	}
	//값을 입력->출력
	//(2)메서드 오버로딩
	void print(char a) {
		System.out.println("a=>"+a);//(3)
	}
	void print(int a) {
		System.out.println("a=>"+a);//(7)
	}
	void print(boolean a) {
		System.out.println("a=>"+a);//true//(11)
	}
	//(1)
	/*
	void charPrint(char a) {
		System.out.println("a=>"+a);
	}
	void intPrint(int a) {
		System.out.println("a=>"+a);
	}
	void booleanPrint(boolean a) {
		System.out.println("a=>"+a);
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1)
		/*
		PrintTest pt=new PrintTest();
		pt.charPrint('v');
		pt.intPrint(2022);
		pt.booleanPrint(3>2);//true
		*/
		//(2)
		/*
		PrintTest pt=new PrintTest();
		pt.print('v');
		pt.print(2022);
		pt.print(3>2);//true
		*/
		//(3)생성자=>다른 메서드를 호출
		//PrintTest pt 객체를 생성하면서 인수 1개짜리 문자열 처리 생성자 
		PrintTest pt=new PrintTest('v');//(1)
		PrintTest pt2=new PrintTest(2022);//(5)
		PrintTest pt3=new PrintTest(3>2);//(9) boolean
	}

}
