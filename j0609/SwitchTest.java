package j0609;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=50;
		//(1)
//		if(su % 2 == 0) {
//			System.out.println(su + "은 짝수입니다.");
//		} else {
//			System.out.println(su + "은 홀수입니다.");
//		}
		switch(su%2) {//조건식에 따라서 case값이 적게 나올 수 있도록 조건
			case 0: //su를 2로 나눴을 때 나머지 0일 경우
				System.out.println(su+"은 짝수"); 
				break; //break문 반드시 줘야 함!
			case 1: //su를 2로 나눴을 때 나머지가 1인 경우
				System.out.println(su+"은 홀수");
				break;
		}
		System.out.println("switch 구문 종료");
	}

}
