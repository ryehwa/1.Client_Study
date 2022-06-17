package j0610;
/*
 * 반복문 -> 특정 조건에 따라서 반복해서 실행이 되는 문장
 * 			=> 반복해서 사용되는 문장
 * 
 * 1. 반복할 횟수가 정해져 있는 경우 --> for, while
 * 2. 반복할 횟수가 정해져 있지 않은 경우 --> for(X),while(입출력 프로그램)
 */

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(1) 반복할 횟수 : 5 (2) 반복해서 수행할 문장
//		System.out.println("while구문 연습1");// 1-> start(시작값)
//		System.out.println("while구문 연습1");
//		System.out.println("while구문 연습1");
//		System.out.println("while구문 연습1");
//		System.out.println("while구문 연습1");// 5->end(종료값)
		
		int i=7; //반복할 횟수 -> 1부터 시작할 거니까
		//무한루프=> 끝도 없이 계속 수행이 되는 문장
		/*
		while(i<=100) {
			System.out.println("while구문 연습"+i);
			i++;//i=i+1, i+=1
		}
		*/
		//**while구문과 do~while구문의 차이점!**
		do {
			System.out.println("while구문 연습"+i);
			i++;
		}while(i<=5);//조건식에 ;을 쓰는 유일한 제어문
		//조건이 거짓이라도 한번은 수행함->조건을 나중에 체크하기 때문! like 선결제
		System.out.println("while구문 종료");

	}

}
