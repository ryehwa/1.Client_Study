package j0608;
//변수 => 자료형(종류,크기 지정해주는 것)=> 변수, 상수의 특성

public class VarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언 -> 같은 자료형의 변수를 여러개 동시에 선언하고 싶다.
		//int num;int num2;int num3; //A(B+C+D)
		/*
		 * 주석을 주는 방법 -> 범위 지정 -> ctrl + shift + / -> 단점:라인 수가 바뀜
		 * 주석을 푸는 방법 -> 범위 지정 -> ctrl + shift + \
		 * 라인 변경 없이 주석 주기 => 한줄 주석 => 범위 지정 -> ctrl + / 를 반복(해제도 가능)
		*/
		  int num,num2=3,num3=4; //선언하면서 값을 저장 //같은 자료형은 ,로 나열해서 선언 및 값을 저장 O num=17;
		  num=23;
		  //변수는 중간에 값이 변경=> 맨 마지막값만 기억(저장)
		//상수(constant)=> 값이 정해지면 중간에 값이 변경되지 않는 숫자
		int num4=5,num5=6;
		//상수화된 변수=> 일단 값이 저장 => 중간에 값이 변경X
		final int NUM6=40;//var num6=40; var num6=90;
		//변수 앞에 예약어 final을 붙이면 상수화된 변수가 된다. 대문자로 표시 ex)NUM6 -> 일반 변수와 구분 위함.
		//num6=90; //int num6=90; 중복선언 허용X
		System.out.println("num=>"+num+",NUM6=>"+NUM6);

	}

}
