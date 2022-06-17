package j0615;
//세 개의 값을 입력받아서 최대값을 구하시오. <-> 최소값
public class ThreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=4;
		int c=19;
		//추가
		/*
		int max;//최대값
		//		12 > 4
		max=(a>b)?a:b; //max=12  => 삼항연산자
		//			12 > 19
		max=(max>c)?max:c;
		System.out.println("max=>"+max);
		*/
		ThreeTest tt=new ThreeTest();
		tt.getMaxPrint(a,b,c);
		tt.getMaxPrint(23, 78, 83);
		tt.getMaxPrint(11, 34, 66);
		//반환값 O
		int replymax=tt.getMaxPrint2(23,98,77);
		System.out.println("반환받은 최대값은 "+replymax);
	}
	//반환값이 있는 메서드->응용
	int getMaxPrint2(int a,int b,int c) {//지역변수이기에 넘겨받아서
		int max;//최대값
		//		12 > 4
		max=(a>b)?a:b; //max=12  => 삼항연산자
		//			12 > 19
		max=(max>c)?max:c;
		return max;//return 계산 결과값(변수)
		//System.out.println("최대값은 "+max+"입니다.");
	}
	
	//work method
	void getMaxPrint(int a,int b,int c) {//지역변수이기에 넘겨받아서
		int max;//최대값
		//		12 > 4
		max=(a>b)?a:b; //max=12  => 삼항연산자
		//			12 > 19
		max=(max>c)?max:c;
		System.out.println("최대값은 "+max+"입니다.");
	}
}
