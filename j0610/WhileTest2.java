package j0610;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int start=50; //시작값 start:just 변수이름,컴퓨터가 알 수 없는 그냥 우리가 설정한 변수
		int end=100; //종료값 end:                     ,,
		//반복할 횟수 -> 1부터 시작할 거니까 //무한루프=> 끝도 없이 계속 수행이 되는 문장
		if(start < end) {
		while(start<=end) {
			System.out.println("while구문 연습"+start);
			start++;
		}
		}else {//start>=end
			System.out.println("start값은 end값보다 클 수가 없다.");
		}
		System.out.println("while구문 종료");

	}

}
