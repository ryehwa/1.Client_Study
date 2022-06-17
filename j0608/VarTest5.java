package j0608;
/*
 	변수의 종류=> 지역변수(정해진 범위 내에서만 사용이 가능한 변수)(메서드 내부)
 					   멤버변수(클래스 내부에 선언된 변수) => 5장에서 자세히
 */
public class VarTest5 {
	int su3; //멤버변수 -> 자바스크립트의 전역 변수처럼 모든 메서드에서 
				//(=인스턴트 변수)								 불러다 사용이 가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수의 사용 범위(scope)");
		int su1=10; //매서드 내부 선언(지역변수)
		{//블럭처리(어디부터 어디까지 사용한다(범위지정)
			int su2=20;
			System.out.println("su2=>"+su2+'\n');// '\n' 줄바꿈 기능
			
		}
		//System.out.println("범위 밖 su2=>"+su2+'\n'); //범위 밖 사용X
		//초기화=> 맨 처음에 변수를 처음 만들고 나서 처음 값을 저장 => 초기화 -> 딱 한번만 일어남
		System.out.println("su1=>"+su1);

	}

}
