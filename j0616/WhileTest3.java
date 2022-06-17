package j0616;

public class WhileTest3 {
	//멤버변수로 선언
	int start2=50;
	int end2=70;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수->일반 메서드 호출 시 매개변수로 전달해야 사용
		//->지역변수:메소드 내의 변수->메소드 벗어나면 사라짐.
		int start=50; //시작값 
		int end=100; //종료값 
		//반복할 횟수 -> 1부터 시작할 거니까 //무한루프=> 끝도 없이 계속 수행이 되는 문장
		/*if(start < end) {
		while(start<=end) {
			System.out.println("while구문 연습"+start);
			start++;
		}
		}else {//start>=end
			System.out.println("start값은 end값보다 클 수가 없다.");
		}
		System.out.println("while구문 종료");
	*/
		WhileTest3 wt=new WhileTest3();
		wt.whilePrint(start, end);//50,100
		wt.whilePrint(90, 150);
		wt.whilePrint(100, 200);
		wt.whilePrint();
	}
	//재사용성
		void whilePrint(int start,int end) {
			if(start < end) {
				while(start<=end) {//50<=100
					System.out.println("while구문 연습"+start);
					start++;
				}
				}else {//start>=end
					System.out.println("start값은 end값보다 클 수가 없다.");
				}
				System.out.println("while구문 종료");
				System.out.println("====================");
		}
		//메서드 오버로딩 기법
		void whilePrint() {
			if(start2 < end2) {
				while(start2<=end2) {//50<=100
					System.out.println("while구문 연습"+start2);
					start2++;
				}
				}else {//start>=end
					System.out.println("start2값은 end2값보다 클 수가 없다.");
				}
				System.out.println("while구문 종료");
				System.out.println("====================");
		}
}
