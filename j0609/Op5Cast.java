package j0609;

public class Op5Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동형변환");
		//1. 적은 데이터값 -> 큰 데이터 공간 -> 자료형의 크기에 맞춰서 형변환 O
		//자동으로 바뀜
		//저장되는 것은 문제가 없지만 메모리 낭비가 발생한다.
		//byte s=12; //     00001100 ->8421 부호비트 0(양수) 1(음수)
		short s=12; //   00000000 00001100
		int n=s; //        00000000 00000000 00000000 00001100
		
		//2.계산 중간에 자료형이 변환 -> 작은 데이터가 큰 데이터로 변환
		//자동으로 안바뀌기 때문에 강제로 바꿔야 함! -> (...)씀으로써 ->ex: (char)
		char c='A'; //65
		int n2=c+1; //char(2byte)+int(4byte)=소+대=대+대(int)+int
		System.out.println("n2=>"+n2);//66
		System.out.println("(char)n2=>"+(char)n2);//int=>char
		//명시적인 형 변환 -> 단점(데이터 손실 O)
		int su=(int)3.5; //double(8byte)
		System.out.println("su=>"+su);//3저장, 0.5저장X->손실 ->0.5짤리는 것!
		
		int x=123;
		float y=x+12.3f; //int+float -> float+float=float=>123.0f+12.3f
		//float로 바꾸는 이유:12.3이였음 double이 됐을거임. 12.3f이기 때문에 float
		// 작은 데이터는 큰 데이터 따라가게 되어있음.
		System.out.println("y=>"+y);
		System.out.println("강제 형변환 주의할 점");
		byte s2=12; short s3=45;
		int re=s2+s3; //byte+short=short+short=short(X)
		//자바의 기본 연산 자료형
		System.out.println("re=>"+re); //57
		short re2=(short)(s2+s3); //int -> short(명시적인 형 변환)
		//변수가 아닌 수식값을 형 변환 할 때는 수식을 ( )로 묶어줘야 한다.
		System.out.println("re2=>"+re2);//57
	}

}
