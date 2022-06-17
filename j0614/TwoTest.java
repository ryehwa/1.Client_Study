package j0614;
/*
 * 1.사용자로부터 값을 입력받아서 (2개) 큰 값을 구하시오. <-> 작은 값을 구하시오.
 * 2.최대값을 구해주는 메서드(max)를 이용해서 최대값을 구하시오.
 * 3.최소값을 구해주는 메서드(min)를 이용해서 최소값을 구하시오.
 */
public class TwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=12;
		int y=67;

		/*(1) 비효율적인 코딩방식(단순.반복적인 문장)
		if(x>y)//67>12
			System.out.println("큰값은"+x+"입니다.");
		else
			System.out.println("큰 값은"+y+"입니다.");
		
		int a=56;
		int b=97;
		
		if(a>b)
			System.out.println("큰값은"+a+"입니다.");
		else
			System.out.println("큰 값은"+b+"입니다.");
			*/
		TwoTest tt=new TwoTest();
		tt.max(x, y);
		tt.max(32, 12);
		tt.max(34, 99);
		System.out.println("==========");
		//tt.min(90,23)->23
		tt.min(90,23);
		tt.min(34, 14);
	}
	
	//최대값(max)
	void max(int x,int y) {
		if(x>y)//67>12
			System.out.println("큰값은"+x+"입니다.");
		else
			System.out.println("큰 값은"+y+"입니다.");
	}
	//최소값(min)
	void min(int x,int y) {
		if(x>y)
			System.out.println("작은 값은"+y+"입니다.");
		else
			System.out.println("작은 값은"+x+"입니다.");
	}

}
