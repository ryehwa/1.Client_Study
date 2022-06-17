package j0609;

public class IFtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입출력-> 사용자로 값을 입력 -> scanner객체(6장 생성자 후에 사용)
		// 짝수,홀수 판별(어떤수 /2==>2의 배수, /3==0(3의 배수)
		//ctrl+a (전체블럭지정) -> ctrl+shift+f ->자동정렬기능 => 들여쓰기 알아서 해줌
		System.out.println("if중첩문");
		int su = 90;
		// 조건1) su -> 1~100까지의 범위에 들어있는 경우 -> 짝수,홀수
		// 조건2) 짝수, 홀수 판별하기
		// if (su%2==1) //조건식(변수,연산자(관계,논리))
		// System.out.println(su+"은 짝수입니다.");
		// 하나의 조건식에 따라서 처리해야 할 문장이 하나 이상일 때 { }
		// % :나머지, su%2==0 -> su를 2로 나눴을 때 나머지가 0
		if ((su >= 1) && (su <= 100)) {// 1~100까지의 범위
			if (su % 2 == 0) {
				System.out.println(su + "은 짝수입니다.");
			} else {
				System.out.println(su + "은 홀수입니다.");
			}
		} else {
			System.out.println("su값은 1~100까지의 값만 입력이 가능");
		} // else
		System.out.println("if연습종료");
	}// main

}// class
