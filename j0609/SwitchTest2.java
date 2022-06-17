package j0609;
//다중 if문 대신 switch 권장
public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=6;
		//(1)
//		if(su % 2 == 0) {
//			System.out.println(su + "은 짝수입니다.");
//		} else {
//			System.out.println(su + "은 홀수입니다.");
//		}
		switch(su) {//조건식에 따라서 case값이 적게 나올 수 있도록 조건
			case 0: case 2: case 4:
			case 6:
			case 8: //case 0 To 10 (X)
			case 10: //case의 범위를 지정할 때 사용
				System.out.println(su+"은 짝수"); 
				break; //break문 반드시 줘야 함!
			case 1: case 3: case 5: case 7: case 9:
				System.out.println(su+"은 홀수");
				break;
			default: //if문의 else if문의 마지막 else구문과 같음.(위의 조건 모두 만족 X 경우)
				System.out.println("입력받을 수 있는 값은 0~10까지만");
				break;
		}
		System.out.println("switch 구문 종료");
	}

}
